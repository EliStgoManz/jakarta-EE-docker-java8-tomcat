package com.jetbrains.MyWebApp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*MyServlet es un servelet el cual aloja y ejecuta posteriormete un archivo Html*/
        response.setContentType("text/html");

        /*Aqui con el objeto out, podemos hacer html embebido*/
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head><title>Hola!</title></head>");
        out.write("<body>");

        //declaración de los atributos o variables de nuestro objetp persona
        String name = request.getParameter("name");
        String gitHub = request.getParameter("gitHub");
        /*uso de regex para validar cadenas:
        nos indida que aceptara caracteres de la a-z(minusculas y mayusculas)
        tambien aceptara espacios en blanco*/
        String validationRegex = "^[a-zA-Z\\s]+";

        if(name.matches(validationRegex) && gitHub.matches(validationRegex)) {

            /*crearemos un objeto del tipo persona
            * los atributos de dichos objetos los declararemos con el uso de JPA'S */
            Person person = new Person();
            person.setName(name);
            person.setGitHub(gitHub);

            /*Es el template para que podamos hacer transaccciones:
            * para poder utilizar el JPA */
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();

            /*con el objeto out tenemos html embebido*/
            out.write("<h1>Guardado!</h1>");

            out.write("<table border ='1'>");
            out.write("<tr>");
            out.write("<th>Name          </th>");
            out.write("<th>Usuario de GitHub</th>");
            out.write("</tr>");


            /*aqui genero una lista del tipo persona, que nombrare people: */
            List<Person> people = em
                    .createQuery("Select p from Person p", Person.class)
                    .getResultList();
            for (Person p: people) {
                out.write("<tr>");
                out.write("<td>" + p.getName() +"</td>");
                out.write("<td>" + p.getGitHub() +"</td>");
                out.write("</tr>");
            }

            out.write("</table>");
        } else {
            out.write("<h1>Lo Siento! Sólo acepto letras!</h1>");
        }

        out.write("<br><a href=\"index.jsp\">Regresar al form</a>");
        out.write("</body></html>");
    }

    public void destroy() {
    }
}
# WebApp con Jakarta y Docker

Plantilla de aplicación web que usa Docker y Docker Compose.


## Instrucciones para levantar y ejecutar la aplicación:

0. Asegúrate de tener Docker instalado y corriendo.
1. Clona este repositorio.
  * Abre la terminal y ejecuta los siguientes comandos:
      ``` 
          cd IdeaProjects
          mkdir LaunchDemo
          cd LaunchDemo
    
 
-vamos a la terminal de intellIJ y escribiremos
![docker pull mysql-paso1](https://user-images.githubusercontent.com/67016286/171696398-706c4f5f-7ccf-4a94-adc7-a8c24f879520.PNG)

-crearemos un contenedor para la base de datos que vamos a utilizar en la realización del proyecto:
![creación de contenedor  para mysql, que contendra nuestra base de datos](https://user-images.githubusercontent.com/67016286/171696824-199a3f5b-3b15-484c-925f-fe7aeb1c6d31.PNG)

-cuando abrimos la aplicación de Docker, vemos que se ha creado una imagen de nuestra base de datos:
![creacionContenedor-baseDatos-mysql](https://user-images.githubusercontent.com/67016286/171696714-f4e4bd77-2d46-438a-a18c-a5ee31d2e965.PNG)

![creacion-imagen-MysqlDOcker-paso2](https://user-images.githubusercontent.com/67016286/171696551-68f062de-a0d1-48b1-a694-e0c69ef8ac65.PNG)




-ejecutamos el comando docker ps & docker images:para revisar el contenedor y la imagen de nuestra base de datos. 
![docker images-docker ps](https://user-images.githubusercontent.com/67016286/171697694-f9ad34fa-e5cf-4294-8ad4-cb441617041c.PNG)


-Servelet: revisamos en src, carpeta main->carpeta java->Myservlet
myservlet; es el archivo que contiene código HTML es un archivo de java que se encargara de generar un archivo HTML
![archivo java que ejecuta codigo html-servlet](https://user-images.githubusercontent.com/67016286/171699341-ea0ede03-fd61-460b-9fa3-085f2524b1a0.PNG)




-En este pedazo de código usamos Regex de Java-> nos permite identificar un patrón dentro de una cadena de texto
![declaracionVariables name and github, son validadas con  validationRegex](https://user-images.githubusercontent.com/67016286/171698804-f42d8d3e-d52a-40e0-ba8a-ca877745a981.PNG)

-tenemos el JPA person:que no permite realizar la persistencia de una entidad con la base de datos
![archivo JPA de la clase persona](https://user-images.githubusercontent.com/67016286/171699247-5069b10a-e494-4210-a170-647f8d06cc84.PNG)

-contamos con el archivo de persitencia que contiene datos sobre usuario->contrseña de usuario de base de datos, tambien contiene el driver
![archivo de persistencia que guarda nuestra contiene usuario y contraseña de nuestra BD](https://user-images.githubusercontent.com/67016286/171699378-4cb51799-084d-45de-9e78-07cf7ac63afe.PNG)


-através de un JPA vamos a crear tablas en nuestra base de datos, para ingresar a la bd escribiremos el siguiente comando:
![docker excec it para podr ingresar a mysql](https://user-images.githubusercontent.com/67016286/171700027-6e92f730-2b59-4531-8da7-bf3f77e16bc1.PNG)













 


Redes:
* GitHub: [EliStgoManz](https://github.com/EliStgoMan<)
* Twitter: [@EliManzano94](https://twitter.com/EliManzano94)

 

 

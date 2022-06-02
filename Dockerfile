FROM tomcat:10-jdk17

#agragamos el target
ADD target/MyWebApp.war /usr/local/tomcat/webapps/MyWebApp.war

#Exponemos el puerto 8080
EXPOSE 8080

#Eecutamos el servicio para iniciar el servidor de tomcat
CMD ["catalina.sh","run"]
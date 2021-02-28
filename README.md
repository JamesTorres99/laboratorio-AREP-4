# *AREP - Laboratorio 4*
# TALLER DE ARQUITECTURAS DE SERVIDORES DE APLICACIONES, META PROTOCOLOS DE OBJETOS, PATRÓN IOC, REFLEXIÓN

## Integrantes:

- James Alexander Torres

## Use Maven, HEROKU, Circle CI, GIT and GITHUB.
Para este taller los estudiantes deberán construir un servidor Web (tipo Apache) en Java. El servidor debe ser capaz de entregar páginas html e imágenes tipo PNG. Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS. Usando el servidor se debe construir una aplicación Web de ejemplo y desplegarlo en Heroku. El servidor debe atender múltiples solicitudes no concurrentes.

Para este taller desarrolle un prototipo mínimo que demuestre capcidades reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él. Debe entregar su trabajo al final del laboratorio.

## Despliegue 
[![CircleCI](https://circleci.com/gh/JamesTorres99/laboratorio-AREP-4.svg?style=svg)](https://circleci.com/gh/JamesTorres99/laboratorio-AREP-4)

Enlace heroku

[Enlace Heroku](https://sleepy-wave-57175.herokuapp.com/index.html)


**Compilar el proyecto con maven**
```
mvn package
```

**Ejecutar el proyecto con maven**
```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.App

```

**Ejecutar pruebas del proyecto con maven**
```
mvn test
```

**Obtener Documentacion del proyecto con maven**

El ejecutable de javadoc "index.html" se encuentra en target\site\apidocs al ejecutar el siguiente comando:
```
mvn javadoc:javadoc
```

## Pruebas 

prueba pagina 1:

[Enlace Heroku](https://sleepy-wave-57175.herokuapp.com/index.html)

prueba pagina 2:

[Enlace Heroku](https://sleepy-wave-57175.herokuapp.com/pagina.html)

prueba pagina 3 con script:

[Enlace Heroku](https://sleepy-wave-57175.herokuapp.com/hola.html)

# Proyecto archivosapi

Este proyecto es una API para servir archivos estáticos (JPG, HTML, XML, JSON, PDF) usando Spring Boot.

## Requisitos

- Java 17 o superior
- Maven 3.6+
- Spring Boot 3.x

## Instrucciones

### Endpoints disponibles

#### Imágenes (JPG)

Para cargar una imagen JPG, usa la siguiente ruta:

GET http://localhost:8080/apiarchivos/imagen/imagen3


#### Archivos HTML

Para cargar un archivo HTML, usa la siguiente ruta:

GET http://localhost:8080/apiarchivos/html/pagina1


#### Archivos XML

Para cargar un archivo XML, usa la siguiente ruta:

GET http://localhost:8080/apiarchivos/xml/documento1


#### Archivos JSON

Para cargar un archivo JSON, usa la siguiente ruta:

GET http://localhost:8080/apiarchivos/json/datos1


#### Archivos PDF

Para cargar un archivo PDF, usa la siguiente ruta:

GET http://localhost:8080/apiarchivos/pdf/hv


## Ejecución

Para ejecutar el proyecto localmente:

1. Clona el repositorio.
2. Asegúrate de tener configurado JDK 17 y Maven.
3. Ejecuta el siguiente comando:


La aplicación estará disponible en `http://localhost:8080`.

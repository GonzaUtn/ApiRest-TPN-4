# ApiRest-TPN-4
API REST - JAVA - Moyano Gonzalo - Desarrollo Back End
Este es un proyecto de ejemplo realizado con JPA, Envers, y una base de datos en memoria H2. El proyecto está diseñado para demostrar el uso de entidades, relaciones y auditoría en un contexto de API REST.

Tecnologías Utilizadas
Java: Lenguaje de programación.
JPA (Java Persistence API): Para la persistencia de datos.
Hibernate Envers: Para la auditoría de cambios en las entidades.
H2 Database: Base de datos en memoria para pruebas.
Configuración del Proyecto
Requisitos
JDK 17 o superior
Gradle
IDE (IntelliJ IDEA)
H2 Database
Envers
JPA
Hibernate
Java Persistence API
OpenAPI
Estructura del Proyecto
audit: Contiene la clase Revision.
config: Contiene la clase CustomRevisionListener para la auditoría.
controllers: Contiene el controlador de Persona, Autor y Localidad.
entities: Contiene las entidades Autor, Base, Domicilio, Libro, Localidad, Persona.
repositories: Contiene el repositorio de Persona, Autor y Localidad.
services: Contiene la interfaz AutorService, PersonaService y LocalidadService, con sus Implementaciones.

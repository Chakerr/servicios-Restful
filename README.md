# README - Aplicación Web con Servicios REST

## Descripción 
Esta aplicación web está diseñada para demostrar la implementación de servicios RESTful en Java utilizando Jersey. Se han agregado nuevas funcionalidades para mejorar el manejo de datos de personas y sus salarios. Se incluyen cálculos automáticos de salarios, consulta del salario promedio en formato XML y la suma total de los salarios en formato JSON. El proyecto permite entender el uso de anotaciones REST y la integración con GlassFish como servidor de aplicaciones.

## Objetivo
El objetivo de este proyecto es desarrollar una aplicación web que provea servicios REST utilizando el API Jersey. Durante el desarrollo, se aplicará el uso de anotaciones REST y se implementarán servicios adicionales a partir de un tutorial base.

## Tecnologías Utilizadas
- **Java** - Lenguaje de programación principal.
- **Maven** - Administrador de dependencias y compilación del proyecto.
- **GlassFish** - Servidor de aplicaciones para desplegar los servicios REST.
- **NetBeans (versión 8.#)** - Entorno de desarrollo recomendado.
- **Jersey API** - Framework para el desarrollo de servicios REST en Java.

## Características del Proyecto
- **Gestor de personas:** Se mantiene una lista de personas con datos como nombre, edad y salario calculado automáticamente.
- **Cálculo de salarios:** Se agrega un atributo `salario` en la clase `Persona`, con la siguiente fórmula:
  - `Salario = (Edad * Salario_Minimo_) / 3`
- **Servicios REST implementados:**
  1. Obtener la lista de todas las personas.
  2. Obtener el salario promedio en formato **XML**.
  3. Obtener la suma de los salarios en formato **JSON**.
  4. Agregar una nueva persona a la lista.
  5. Obtener información de una persona específica mediante su ID.

## API REST - Endpoints
| Método | URL                          | Descripción |
|---------|-----------------------------|-------------|
| GET     | `/api/personas`             | Obtener lista de personas |
| GET     | `/api/personas/{id}`        | Obtener persona por ID |
| POST    | `/api/personas`             | Agregar una nueva persona |
| GET     | `/api/personas/salario/promedio` | Obtener el salario promedio (XML) |
| GET     | `/api/personas/salario/total` | Obtener la suma total de salarios (JSON) |

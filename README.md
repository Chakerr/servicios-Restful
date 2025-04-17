# README - Aplicación Web con Servicios REST

## Descripción
Este proyecto es una aplicación web desarrollada en Java EE que implementa servicios RESTful utilizando el framework **Jersey**. Fue construido con **NetBeans 8.0.2**, **GlassFish Server 4.1** y **Maven**. Los servicios están centrados en el manejo de datos de personas y el cálculo de salarios basados en la edad.

## Objetivo
- Entender y aplicar las anotaciones REST (@GET, @POST, @Path, etc.)
- Usar Jersey como API para implementar servicios REST
- Construir servicios que retornen resultados en **JSON** y **XML**
- Desplegar servicios REST sobre GlassFish usando Maven

## Tecnologías Utilizadas
- Java EE 7
- Jersey 1.13
- Maven
- GlassFish 4.1
- NetBeans 8.0.2
- Postman (para pruebas REST)

## Funcionalidades

### Modelo: `Persona`
- Atributos: `id`, `nombre`, `edad`
- Atributo calculado: `salario = edad * SALARIO_MINIMO / 3`

### Servicios REST (`PersonaService`)
- `GET /persona`  
  Retorna la lista de personas en JSON o XML.
- `GET /persona/salarioPromedio`  
  Retorna el salario promedio (XML).
- `GET /persona/sumaSalarios`  
  Retorna la suma de los salarios (JSON).

## Rutas REST (EndPoints)
| Método | URL                                                              | Formato | Descripción                             |
|--------|------------------------------------------------------------------|---------|-----------------------------------------|
| GET    | `/RestPersonService/webresources/persona`                       | JSON/XML | Lista todas las personas                |
| GET    | `/RestPersonService/webresources/persona/salarioPromedio`       | XML     | Retorna el salario promedio             |
| GET    | `/RestPersonService/webresources/persona/sumaSalarios`          | JSON    | Retorna la suma total de los salarios   |
```

## Cómo Ejecutar
1. Abrir en NetBeans 8.0.2
2. Ejecutar sobre GlassFish Server 4.1
3. Usar navegador o Postman para probar los endpoints

---

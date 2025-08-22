# Backend Demo — Spring Boot (Products API)

> **Objetivo:** REST API mínima de productos para validar endpoints con Postman.

## Requisitos
- Java 17+
- Maven 3.9+

## Ejecutar
```bash
mvn spring-boot:run
# GET http://localhost:8080/api/products
# GET http://localhost:8080/api/products/1
```

## Endpoints
- `GET /api/products` — lista de productos
- `GET /api/products/{id}` — detalle por id

## Notas
- Datos en memoria (lista estática). Ideal para pruebas de API.

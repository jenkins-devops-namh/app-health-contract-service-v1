
### Acerca de la funcionalidad expuesta

La funcionalidad permite actualizar la información de la organización.


### URI de acceso a la API
| Método            | URI                                                                                                      |
|-------------------|------------------------------------------------------------|
| PUT               | /organization/{legalDocumentType}/{legalDocumentNumber}/completeName
### Precondiciones para el consumo de esta versión de la API
En progreso.

### Headers Requeridos
| Header    | Ejemplo |
|-----------|---------|
|Request-ID|550e8400-e29b-41d4-a716-446655440000|
|request-date|2017-06-01T17:15:20.509-0400|
|Content-Type|application/json|

### Query Parameters válidos en esta versión de la API
No aplica

### Variantes válidas del Payload (Cuerpo del mensaje)

@PUT /application/hlth/v1/health-contract-services/organization/6/20393525839/completeName

Request
{
    "completeName":"Real Core"
}


Response
true



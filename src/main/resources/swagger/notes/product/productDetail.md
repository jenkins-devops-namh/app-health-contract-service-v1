### Acerca de la funcionalidad expuesta
La funcionalidad permite obtener el producto y su detalle por 
id de contrato (contractId), codigo de servicio - serviceCode, parentCode y codigo de producto ProductCode 


### URI de acceso a la API
| Método            | URI                                                                                                      |
|-------------------|------------------------------------------------------------|
| GET               | /contract/{contractId}/organization/{documentType}/{documentNumber}/service/{serviceCode}/parentCode/{parentCode}/product/{productCode}/details
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

### Variantes

@GET /application/hlth/v1/health-contract-services/contract/0010Q5/organization/6/20222222222/service/SE001/parentCode/-/product/ACCOUNT/details

@GET /application/hlth/v1/health-contract-services/contract/0010Q5/organization/6/20222222222/service/SE001/parentCode/ACCOUNT/product/1910725565148/details

@GET /application/hlth/v1/health-contract-services/contract/0010Q5/organization/6/20222222222/service/SE001/parentCode/ACCOUNT-1910725565148/product/EXAM/details

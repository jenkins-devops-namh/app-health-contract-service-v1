### Acerca de la funcionalidad expuesta
La funcionalidad permite obtener datos de los productos por 
id de contrato (contractId) y/o codigo de servicio - serviceCode (opcional) 


### URI de acceso a la API
| Método            | URI                                                                                                      |
|-------------------|------------------------------------------------------------|
| GET               | /application/hlth/v1/health-contract-services/contract/{contractId}/product  |
| GET               | /application/hlth/v1/health-contract-services/contract/{contractId}/product?serviceCode=SE001 |
| GET               | /application/hlth/v1/health-contract-services/contract/{contractId}/product?productType=ACCOUNT  |
| GET               | /application/hlth/v1/health-contract-services/contract/{contractId}/product?serviceCode=SE001&productType=ACCOUNT  |

### Precondiciones para el consumo de esta versión de la API
En progreso.

### Headers Requeridos
| Header    | Ejemplo |
|-----------|---------|
|Request-ID|550e8400-e29b-41d4-a716-446655440000|
|request-date|2017-06-01T17:15:20.509-0400|
|Content-Type|application/json|

### Query Parameters válidos en esta versión de la API
serviceCode,
productType

### Variantes válidas del Payload (Cuerpo del mensaje)
No aplica.
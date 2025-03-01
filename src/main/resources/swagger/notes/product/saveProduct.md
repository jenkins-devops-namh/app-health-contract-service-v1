### Acerca de la funcionalidad expuesta
La funcionalidad permite guardar datos del producto y su detalle por 
id de contrato (contractId) y/o codigo de servicio - serviceCode (opcional) 


### URI de acceso a la API
| Método            | URI                                                                                                      |
|-------------------|------------------------------------------------------------|
| POST              | /application/hlth/v1/health-contract-services/contract/{contractId}/organization/{documentType}/{documentNumber}/service/{serviceCode}/product  |

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

@POST /application/hlth/v1/health-contract-services/contract/0010Q5/organization/RUC/20222222222/service/SE001/product

Request
{
    "productCode":"PAEPL",
    "productType":"LINE",
    "status":"ENABLED",
    "codeConfigurationFunction":"ACCOUNT",
    "productParentId":234,
    "user":"admin",
    "productDetail":[
        {"productDetailCode":"ALIAS_ACCOUNT",
        "productDetailTypeValue":"String",
        "productDetailValue":"00001|F1",
        "productDetailDescription":"00001|F1",
        "parameterConfig":"parametros",
        "status":"ENABLED"
        },
        {"productDetailCode":"LINE",
        "productDetailTypeValue":"String",
        "productDetailValue":"00001|E1",
        "productDetailDescription":"00001|E1",
        "parameterConfig":"parametros",
        "status":"ENABLED"
        }
    ]

}


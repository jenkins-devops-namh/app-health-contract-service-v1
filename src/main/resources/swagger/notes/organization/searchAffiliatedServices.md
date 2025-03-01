### Acerca de la funcionalidad expuesta
La funcionalidad permite obtener los servicios afiliados por empresa.

### URI de acceso a la API
| Método            | URI                                                    |
|-------------------|--------------------------------------------------------|
| GET              | /organization/{legalDocumentType}/{legalDocumentNumber}/services

### Precondiciones para el consumo de esta versión de la API
No aplica.

### Data de Prueba
| QueryParam    | Value |
|-----------|---------|
|contractId|0010Q5|

### Headers Requeridos
| Header    | Ejemplo |
|-----------|---------|
|Request-ID|550e8400-e29b-41d4-a716-446655440000|
|request-date|2017-06-01T17:15:20.509-0400|
|Content-Type|application/json|

### Usos válidos de Query Parameters
| QueryParam    | Value |
|-----------|---------|
|contractId|String|

### Variantes válidas del Payload (Cuerpo del mensaje)
No aplica.

### Lista de Valores usadas en esta versión de la API
Ninguna.

### Códigos de error usados en esta versión de la API
| Código |  HTTP Status | Descripción |
|--------|-------------|-------------|
| TL0003 | 400 | Petición incorrecta.
| TL9999 | 401 | No est&aacute; autorizado para consumir el API.
| TL0003 | 404 | Los servicios afiliados no se encuentran.
| TL0003 | 500 | curri&oacute; un error inesperado. Por favor contactarse con Soporte T&eacute;cnico.
| TL0003 | 503 | El servicio no se encuentra disponible. Por favor reintente más tarde.
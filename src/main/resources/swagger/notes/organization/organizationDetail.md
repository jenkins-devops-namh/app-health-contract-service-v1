### Acerca de la funcionalidad expuesta
La funcionalidad permite obtener la información de la organización y su detalle por
tipo de documento legal y número de documento legal.


### URI de acceso a la API
| Método            | URI                                                                                                      |
|-------------------|------------------------------------------------------------|
| GET               | /organization/{legalDocumentType}/{legalDocumentNumber}/organization-detail
### Precondiciones para el consumo de esta versión de la API
En progreso.

### Headers Requeridos
| Header    | Ejemplo |
|-----------|---------|
|Request-ID|550e8400-e29b-41d4-a716-446655440000|
|request-date|2017-06-01T17:15:20.509-0400|
|Content-Type|application/json|
|app-code|WH|

### Query Parameters válidos en esta versión de la API
No aplica

### Usos válidos de Query Parameters
No aplica.

### Data de Prueba
Ninguna.

### Variantes válidas del Payload (Cuerpo del mensaje)
Ninguna.

### Lista de Valores usadas en esta versión de la API
Ninguna.

### Códigos de error usados en esta versión de la API
| Código |  HTTP Status | Descripción |
|--------|-------------|-------------|
| TL0003 | 400 | Los datos proporcionados no son v&aacute;lidos
| TL9999 | 401 | No est&aacute; autorizado para consumir el API.
| TL0003 | 403 | No se tiene permisos para consumir el API.
| TL0003 | 404 | La organizacion no existe.
| TL0003 | 500 | curri&oacute; un error inesperado. Por favor contactarse con Soporte T&eacute;cnico.
| TL0003 | 503 | El servicio no se encuentra disponible. Por favor reintente más tarde.

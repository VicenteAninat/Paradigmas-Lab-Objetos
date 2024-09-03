# lab3_212547662_VicenteAninat

En este archivo se encuentran las instrucciones de uso pertinentes para el uso del programa. Tales como la carga de archivos, uso de los metodos de las clases u manipulacionde las instancias creadas.

Inicialmente, asegurarse de que Java esté entre las variables de entorno del equipo que se esté utilizando para el uso del proyecto.

Al momento en que se ejecute el programa, se desplegará un menú. Para acceder a las opciones que se presentan hay que ingresar el número correspondiente y posteriormente, ingresar los parámetros solicitados para la ejecución del comando uno a uno según indica el propio menú.
Para los tipos de estación se tienen solo c, m, r y t que son combinación, mantención, regular y terminal respectivamente, y para los tipos de estación se tienen ct y tr, central y terminal respectivamente, estos son los únicos tipos admitidos.

En el archivo main del proyecto se encuentran las llamadas de prueba a métodos junto con los resultados esperados de su ejecución.

Para cargar archivos de líneas, conductores o trenes, ingresar la ruta del archivo en su totalidad cuando esta sea solicitada.

- Para crear líneas: Se debe especificar cada atributo de las estaciones separados por una coma, y cada estación en una línea distinta. Luego del caracter “-” se especifican las secciones, especificando las estaciones que las conforman con sus IDs y los demás atributos. Luego de otro “-” se especifican los atributos de la línea donde las secciones ingresadas se ponen como “listaSeccion”, representando que se añaden todas las secciones creadas hasta el momento.
- Para crear conductores: Misma nomenclatura que para líneas, se separan los atributos por comas y los conductores con saltos de línea.
- Para crear trenes: Misma nomenclatura que para líneas, el “-” separa carros del tren construido.

Para mayor detalle consultar los archivos de prueba presentes en el proyecto.

Finalmente, usar los comandos .\gradlew build y .\gradlew run desde el terminal en la carpeta del proyecto para compilar y ejecutar el programa.
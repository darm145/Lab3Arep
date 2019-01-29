# networkinglab
## URL DATA
para cada uno de los valores generamos el print el cual podemos encontrar en el archivo URLData.java, y para la siguiente URL:  
![url](imagenes/url.PNG)  
recibimos los siguientes valores:  
![url](imagenes/results.PNG)  

como notamos nos desglosa toda la informacion de la URL y cada parametro que fue solicitado

## URL READER	
a diferencia del anterior, en este programa se accedera a internet y se creara una copia HTML de la pagina solicitada  
lo primero que hacemos es ejecutar el main de la clase URLReader  
![url](imagenes/readerexec.JPG)  
posteriormente escribiremos la URL de la pagina  
![url](imagenes/readerurl.JPG)  
el archivo se guardara en la carpeta raiz de nuestro projecto con el nombre resultado.html.  
![url](imagenes/readersave.JPG)  
finalmente al abrirlo notamos que no la pagina no esta completa ya que le faltan componentes, esto se debe a que  
se guardo estrictamente el html de la pagina y no puede encontrar los demas componentes para cargarla correctamente.   
![url](imagenes/readerresult.JPG)  

## respuesta de numero al cuadrado.
para este punto se debe modificar el archivo EchoServer.java que fue suministrado, la modificacion puede encontrarse  
en el archivo CuadradoServer.java.  
primero que todo iniciamos el servidor desde maven:  
![url](imagenes/cuadradoserver.JPG)  
dado que necesitamos un cliente lo inicializamos desde una consola aparte:  
![url](imagenes/cuadradocliente.JPG)  
se agrego un mensaje al servidor para evidenciar que efectivamente el cliente se conecto, finalmente probamos  
que este funcionando correctamente:  
![url](imagenes/cuadradoresult.JPG)  
y finalmente evidenciamos que el servidor tambien cerro su conexion:  
![url](imagenes/cuadradoclose.JPG)  

## funciones trigonometricas
al igual que el anterior, se debe modificar EchoServer.java, en este caso la modificacion se llama TrigonometricasServer.java  
se puede usar el mismo cliente que en el casos anterior, (Cliente.java)  
inicializamos el servidor y el cliente:  
![url](imagenes/trigonometricasserver.JPG)  
![url](imagenes/trigonometricascliente.JPG)  
posteriormente probamos que este funcionando correctamente:  
![url](imagenes/trigonometricasresult.JPG)  
y finalmente evidenciamos que el servidor tambien cerro su conexion:  
![url](imagenes/trigonometricasclose.JPG)  

## servidor paginas html e imagenes
para este punto podemos modificar ligeramente el codigo URLReader de tal manera que en vez de buscar una sola pagina  
podamos buscar las que deseemos y cada una de ellas guardarla con un nombre distinto, la modificacion es la siguiente:  
![url](imagenes/paginascode.JPG)  
posteriormente ponemos a correr el cliente y el servidor:  
![url](imagenes/paginasserver.JPG)  
![url](imagenes/paginascliente.JPG)  
y probamos que este funcionando correctamente:  
![url](imagenes/paginasresult.JPG)  
![url](imagenes/paginasresult1.JPG)  
y verificamos que el servidor tambien cierra la conexion:  
![url](imagenes/paginasclose.JPG)  
## Servidor datagramas(hora)
para el siguiente servidor usamos los codigos suministrados y les aplicamos ciertas modificaciones para que cumplan 
los requerimientos solicitados, dichas modificaciones se pueden encontrar en el codigo fuente.  
procedemos a inicar el servidor:  
![url](imagenes/horaserver.JPG)  
a continuacion procedemos a iniciar el cliente y que empiece a recibir los datagramas inmediatamente:
![url](imagenes/horacliente.JPG)  
como vemos funciona correctamente, para finalzar realizamos la prueba cerrardo el servidor y volviendolo a iniciar 
donde obtenemos lo siguiente:
![url](imagenes/horaprueba.JPG) 
y notamos que esta funcionando correctamente segun las especificaciones dadas.





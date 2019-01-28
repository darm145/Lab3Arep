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



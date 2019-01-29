package eci.networkproject;

import java.net.*;
import java.io.*;
public class HttpServer {
 public static void main(String[] args) throws IOException {
  ServerSocket serverSocket = null;
  int solicitud;
  try {
   serverSocket = new ServerSocket(2000);
  } catch (IOException e) {
   System.err.println("Could not listen on port: 35000.");
   System.exit(1);
  }
  Socket clientSocket = null;
  try {
   System.out.println("Listo para recibir ...");
   clientSocket = serverSocket.accept();
  } catch (IOException e) {
   System.err.println("Accept failed.");
   System.exit(1);
  }
  PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
  BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  String inputLine, outputLine;
  out.println("conectado al servidor de paginas html e imagenes");
  out.println("por favor ingrese las URL de las paginas a visitar.");
  out.println("el archivo html sera guardado como request(nrosolicitud).html");
  out.println("escriba cerrar para finalizar la conexion");
  out.println();
  solicitud=1;
  while ((inputLine = in .readLine()) != null) {
   System.out.println("Received: " + inputLine);
   if (inputLine.equals("cerrar")) {
	   out.println("Conexion cerrada");
	   break;
   }
   try {
	   URLReader.Pagina(inputLine, solicitud);
	   out.println("html guardado correctamente con el nombre requestnro"+solicitud+".html");
	   solicitud++;
	   
   }
   catch(MalformedURLException e) {
	   out.println("URL mal escrita por favor repitala");
   }
  }
  
  out.close(); in .close();
  clientSocket.close();
  serverSocket.close();
 }
}

package eci.networkproject;

import java.net.*;
import java.io.*;
public class CuadradoServer {
 public static void main(String[] args) throws IOException {
  ServerSocket serverSocket = null;
  try {
   serverSocket = new ServerSocket(2000);
  } catch (IOException e) {
   System.err.println("Could not listen on port: 35000.");
   System.exit(1);
  }
  Socket clientSocket = null;
  try {
   clientSocket = serverSocket.accept();
  } catch (IOException e) {
   System.err.println("Accept failed.");
   System.exit(1);
  }
  PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
  BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  out.println("conectado al servidor, ingrese un numero para elevarlo al cuadrado");
  out.println("ingrese el 0 para cerrar la conexion");
  out.println();
  String inputLine, outputLine;
  while ((inputLine = in .readLine()) != null) {
   System.out.println("Numero: "+inputLine);
   if (inputLine.equals("0")) {
	   out.println("Conexion cerrada");
	   break;
   }
   try {
	   int number=Integer.parseInt(inputLine);
	   outputLine = "Respuesta:" + number*number;
	   out.println(outputLine);
	   
   }
   catch (NumberFormatException e) {
	   outputLine="por favor ingrese un numero valido";
	   out.println(outputLine);
   }
  }
  out.close(); in .close();
  clientSocket.close();
  serverSocket.close();
 }
}
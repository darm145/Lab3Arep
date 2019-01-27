package eci.networkproject;
import java.net.*;
import java.io.*;
public class TrigonometricasServer {
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
  String function="cos";
  out.println("conectado al servidor, actualmente se esta calculando la funcion coseno(cos)");
  out.println("si desea cambiar la funcion ingrese 'fun:' seguido de la funcion que desee:");
  out.println("   -sin para seno");
  out.println("   -cos para coseno");
  out.println("   -tan para tangente");
  out.println("escriba 'cerrar' para cerrar la conexion");
  out.println("ingrese el numero o la operacion");
  out.println();
  String inputLine, outputLine;
  while ((inputLine = in .readLine()) != null) {
   System.out.println("Numero: "+inputLine);
   if (inputLine.equals("cerrar")) {
	   out.println("Conexion cerrada");
	   break;
   }
   if (inputLine.length()==7 && inputLine.substring(0,4).equals("fun:")) {
	   String change=inputLine.substring(4,7);
	   if(change.equals("sin")||change.equals("cos")||change.equals("tan")) {
		   function=change;
		   out.println("la funcion fue cambiada exitosamente a: "+function);
	   }
	   else out.println("funcion no existente por favor escriba bien la funcion");
   }
   else {
	   try {
		   String[] division=inputLine.split("/");
		   double[] values=new double[division.length];
		   for(int i=0;i<division.length;i++) {
			   int pi=0;
			   if (division[i].contains("pi")) {
				   pi=1;
				   division[i]=division[i].replaceAll("pi", "");
			   }
			   if(division[i].equals("") && pi==1) values[i]=Math.PI;
			   else if(pi==1) values[i]=Double.parseDouble(division[i])*(Math.PI*pi);
			   else values[i]=Double.parseDouble(division[i]);
		   }
		   double result=values[0];
		   for(int i=1;i<division.length;i++) {
			   result=result/values[i];
		   }
		   System.out.println(result);
		   if(function.equals("sin")) result=Math.sin(result);
		   else if(function.equals("cos")) result=Math.cos(result);
		   else if(function.equals("tan")) result=Math.tan(result);
		   out.println("el resultado es: "+result);
	   }
	   catch (Exception e) {
		   out.println("valor no valido por favor ingreselo correctamente");   
	   }   
   } 
  }
  out.close(); in .close();
  clientSocket.close();
  serverSocket.close();
 }
}
package eci.networkproject;

import java.io.*;
import java.net.*;
public class Cliente {
 public static void main(String[] args) throws IOException {
  Socket echoSocket = null;
  PrintWriter out = null;
  BufferedReader in = null; 

  try {
   echoSocket = new Socket("127.0.0.1", 2000);
   out = new PrintWriter(echoSocket.getOutputStream(), true); in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

  } catch (UnknownHostException e) {
   System.err.println("Don’t know about host!.");
   System.exit(1);
  } catch (IOException e) {
   System.err.println("Couldn’t get I/O for " + "the connection to: localhost.");
   System.exit(1);
  }
  BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));
  String userInput;
  String serverResponse;
  while(!(serverResponse=in.readLine()).equals("")) {
	  System.out.println(serverResponse);
  }
  while ((userInput = stdIn.readLine()) != null) {
   out.println(userInput);
   serverResponse=in.readLine();
   System.out.println(serverResponse);
   if (serverResponse.equals("Conexion cerrada")) break;
  }
  out.close(); in .close();
  stdIn.close();
  echoSocket.close();

 }
}
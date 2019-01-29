package eci.networkproject;
import java.io.*;
 import java.net.*;
import java.util.Scanner;
 public class URLReader {
   public static void main(String[] args) throws Exception {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("digite la URL a evaluar");
	   Pagina(sc.nextLine(),1);
	   sc.close();
	   
	   
   }
   public static void Pagina(String url,int nroSolicitud) throws MalformedURLException {
	   URL page=new URL(url);
	   try (BufferedReader reader = new BufferedReader(new InputStreamReader(page.openStream()))) {
		     String inputLine = null;
		     BufferedWriter bw = new BufferedWriter(new FileWriter("requestnro"+nroSolicitud+".html"));
		    while ((inputLine = reader.readLine()) != null) {
		     bw.write(inputLine);
		    }
		    bw.close();
		    
		   } catch (IOException x) {
		    System.err.println(x);
		    
		   }
   }
  
}
 
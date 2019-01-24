package eci.networkproject;
import java.io.*;
import java.net.*;
public class URLData {
	public static void main(String[] args) throws Exception {
		URL page=new URL("https://www.escuelaing.edu.co:2000/es/comunidad/estudiantes?a=123#ab");
		System.out.println("protocolo: "+page.getProtocol());
		System.out.println("autoridad: "+page.getAuthority());
		System.out.println("host: "+page.getHost());
		System.out.println("puerto: "+page.getPort());
		System.out.println("path: "+page.getPath());
		System.out.println("query: "+page.getQuery());
		System.out.println("file: "+page.getFile());
		System.out.println("ref: "+page.getRef());
	}

}

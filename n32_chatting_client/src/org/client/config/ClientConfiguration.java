package org.client.config;

public class ClientConfiguration {
	private static String IP = "127.0.0.1";			// default ip
	private static int PORT = 60000;					// default port
	
	public static String getIp(){
		return IP;
	}
	
	public static void setIp(String ip){
		IP = ip;
	}
	
	public static int getPort(){
		return PORT;
	}
	
	public static void setPort(int port){
		PORT = port;
	}
}

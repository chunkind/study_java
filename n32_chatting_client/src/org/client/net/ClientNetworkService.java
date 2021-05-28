package org.client.net;

import java.io.*;
import java.net.*;

import org.client.config.ClientConfiguration;

public class ClientNetworkService {
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	
	public ClientNetworkService(String ip, int port) throws Exception{
		connectServer(ip, port);
	}

	public void connectServer(String ip, int port) throws Exception{
		ClientConfiguration.setIp(ip);
		ClientConfiguration.setPort(port);
		
		socket = new Socket(ip, port);
		
		pw = new PrintWriter(socket.getOutputStream(), true);
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	
	public void sendMessage(String message){
		pw.println(message);
	}
	
	public String receiveMessage() throws IOException{
		return br.readLine();
	}
}

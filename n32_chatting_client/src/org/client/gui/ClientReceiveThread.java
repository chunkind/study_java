package org.client.gui;

public class ClientReceiveThread extends Thread{
	private ClientGui gui;
	
	public ClientReceiveThread(ClientGui gui){
		this.gui = gui;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				String message = gui.service.receiveMessage();
				
				if(message != null && !message.equals(""))
					gui.ta.append(message + "\n");
			}
		}catch(Exception e){
			gui.ta.append("<<서버와의 연결이 끊어졌습니다.>>\n");
		}
	}
}

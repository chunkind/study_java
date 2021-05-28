package org.client.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;

import org.client.config.ClientConfiguration;
import org.client.gui.event.*;
import org.client.net.ClientNetworkService;

public class ClientGui {
	public ClientNetworkService service;
	public Frame frame;
	public Panel east;
	public TextArea ta;
	public TextField tf;
	public Button [] b;
	public String nick;
	
	public ClientGui(String nick){
		frame = new Frame(nick + "님, 반갑습니다.");
		east = new Panel();
		ta = new TextArea(24, 45);
		tf = new TextField(25);
		b = new Button[5];
		
		b[0] = new Button("IP/port 설정");
		b[1] = new Button("about");
		b[2] = new Button("clear");
		b[3] = new Button("종료");
		b[4] = new Button("전송");
		
		this.nick = nick;
	}
	
	public void launchFrame(){
		addComponent();
		addListener();
		setComponent();
		
		try {
			String ip = ClientConfiguration.getIp();
			int port = ClientConfiguration.getPort();
			
			service = new ClientNetworkService(ip, port);
			ClientReceiveThread thread = new ClientReceiveThread(this);
			thread.start();
			ta.append("<<서버에 연결했습니다.>>\n");
		} catch (Exception e) {
			ta.append("<<서버가 닫혀있습니다.>>\n");
		}
	}
	
	public void setComponent(){
		east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
		
		ta.setEditable(false);
		ta.append("채팅방을 실행합니다... IP주소와 Port를 설정 해주세요...\n");
		tf.requestFocus();
	}
	
	public void addComponent(){
		east.add(b[0]);
		east.add(b[1]);
		east.add(b[2]);
		east.add(b[3]);
		east.add(b[4]);
		
		frame.add(east, "East");
		frame.add(ta, "Center");
		frame.add(tf, "South");
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public void addListener(){
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b[0].addActionListener(new ConnectListener(this));
		b[1].addActionListener(new AboutListener(this));
		b[2].addActionListener(new ClearListener(this));
		b[3].addActionListener(new QuitListener(this));
		b[4].addActionListener(new SendListener(this));
		tf.addActionListener(new SendListener(this));
	}
}

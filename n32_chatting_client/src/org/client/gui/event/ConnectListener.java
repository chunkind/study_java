package org.client.gui.event;

import java.awt.*;
import java.awt.event.*;

import org.client.config.ClientConfiguration;
import org.client.gui.ClientGui;
import org.client.gui.ClientReceiveThread;
import org.client.net.ClientNetworkService;

public class ConnectListener implements ActionListener {
	private ClientGui gui; 
	
	private Frame f;
	private Panel north;
	private Panel south;
	
	private TextField [] field;
	private Label [] l;
	
	private Button apply;
	private Button quit;
	
	public ConnectListener(ClientGui gui){
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		init();
		addComponent();
		setFrame();
		addListener();
	}
	
	private void init(){
		f = new Frame("IP/Port 변경");
		
		north = new Panel();
		south = new Panel();
		
		field = new TextField[5];
		l = new Label[5];
		
		apply = new Button("확인");
		quit = new Button("취소");
		
		for(int i = 0; i < field.length; i++)
			field[i] = new TextField(3);
		
		for(int i = 0; i < l.length; i++)
			l[i] = new Label(".");
		
		l[0].setText("IP : ");
		l[4].setText("Port : ");
		
		String [] ip = ClientConfiguration.getIp().split("\\.");
		field[0].setText(ip[0]);
		field[1].setText(ip[1]);
		field[2].setText(ip[2]);
		field[3].setText(ip[3]);
		field[4].setText(ClientConfiguration.getPort() + "");
	}
	
	private void addComponent(){
		north.add(l[0]);		// IP : 
		north.add(field[0]);
		north.add(l[1]);		// .
		north.add(field[1]);		
		north.add(l[2]);		// .
		north.add(field[2]);
		north.add(l[3]);		// .
		north.add(field[3]);
		north.add(l[4]);		// Port : 
		north.add(field[4]);	
		
		south.add(apply);
		south.add(quit);
		
		f.add(north, "Center");
		f.add(south, "South");
	}
	
	private void setFrame(){
		f.setSize(450, 100);;
		f.setResizable(false);
		f.setVisible(true);
	}
	
	private void addListener(){
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		apply.addActionListener(new ApplyListener());
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
	}
	
	private class ApplyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String ip = field[0].getText() + "." + 
					field[1].getText() + "." + 
					field[2].getText() + "." + 
					field[3].getText();
			
			int port = 0;

			try {
				port = Integer.parseInt(field[4].getText());
				
				gui.ta.append("<<" + ip + ":" + port + " 에 연결 중입니다.>>\n");
				
				gui.service = new ClientNetworkService(ip, port);
			} catch (Exception e1) {
				gui.ta.append("<<해당 IP와 Port로 서버에 연결할 수 없습니다.>>\n");
				f.dispose();
				return;
			}
			gui.ta.append("<<" + ip + ":" + port + "에 연결 했습니다.>>\n");
			
			ClientReceiveThread thread = new ClientReceiveThread(gui);
			thread.start();
			
			ClientConfiguration.setIp(ip);
			ClientConfiguration.setPort(port);
			
			f.dispose();
		}
	}
}

package chatting.server.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import chatting.server.service.ServerService;
import chatting.server.thread.ServerThread;

public class ServerGUI {
	//1. gui 구성
	public Frame f;
	public Panel p;
	public TextField tf;
	public TextArea ta;
	public Button save;
	public String nickName;
	
	public ServerService service;
	public ServerThread st;
	
	public ServerGUI(/*String nickName*/) { //객체 생성시 닉네임을 넣겠다
		/*this.nickName = nickName;*/
		f = new Frame("Chatting Room..");
		tf = new TextField(30);
		ta = new TextArea();
		save = new Button("저장");
		p = new Panel();
		service = new ServerService(this);
		
	}
	public void lunchFrame() {
		f.setSize(500, 400);
		f.add(ta,"Center");
		f.add(p,"South");
		p.add(tf);
		p.add(save);
		f.setResizable(false);
		f.setVisible(true);
		ta.setText("환영합니다.");
		tf.requestFocus();
		ta.setEditable(false);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
				System.exit(0);
				
			}
		});
		
		
		//리스너 부탁
		tf.addActionListener(new SendEventHandler(this));
		save.addActionListener(new SaveButtonHandler(this));
		
		try {
			ta.append("Server Ready..... port number 60000....\n");
			service.go();
		} catch (Exception e1) {
			ta.append(e1.getMessage() + "\n");
		}
	}
	
	
	public static void main(String[] args) {
		ServerGUI sg = new ServerGUI(/*"운영자"*/);
		sg.lunchFrame();
	}
}

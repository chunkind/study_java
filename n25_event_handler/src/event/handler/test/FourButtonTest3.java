package event.handler.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FourButton3 {
	//1. gui구성
	 Frame f;
	 Panel p;
	 Button b1,b2,b3,b4;
	 TextField tf;
	FourButton3(){
		f = new Frame("Four Button,,,");
		p = new Panel();
		b1 = new Button("나정이");
		b2 = new Button("칠봉이");
		b3 = new Button("쓰레기");
		b4 = new Button("삼천포");
		tf = new TextField(30);
	}
	public void lunchFrame(){
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		f.add(p,"North");
		f.add(tf,"South");		
		f.setBackground(Color.pink);
		f.pack();
		f.setVisible(true);
		
		//2. Listsner 부착
		b1.addActionListener(new ButtonHandler3(this));
		b2.addActionListener(new ButtonHandler3(this));
		b3.addActionListener(new ButtonHandler3(this));
		b4.addActionListener(new ButtonHandler3(this));
	}
	
}
public class FourButtonTest3 {

	public static void main(String[] args) {
		FourButton3 fb = new FourButton3();
		fb.lunchFrame();
	}
}




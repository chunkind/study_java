package gui.component.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class FourButtonTest1 {
	private Frame f;
	private Panel p;
	private Button b1,b2,b3,b4;
	private TextField tf;
	
	FourButtonTest1(){
		f = new Frame("Four Button...");
		b1 = new Button("나정이");
		b2 = new Button("칠봉이");
		b3 = new Button("쓰레기");
		b4 = new Button("빙그레");
		p = new Panel();
		tf = new TextField("해당하는 사람의 명언입이다",30);//1. 2.가로 사이즈
	}
	public void lunchFrame(){
		p.add(b1);  p.add(b2);  p.add(b3);  p.add(b4); //FlowLayout
		f.add(p,"North");
		f.add(tf,"South");
		
		f.setSize(400, 300);
		f.setBackground(Color.LIGHT_GRAY);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		FourButtonTest1 test = new FourButtonTest1();
		test.lunchFrame();
	}
}

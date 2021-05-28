package event.handler.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*
 * 마무리 코드 :: 
 * 이벤트 핸들링은 재사용성을 높이기 위해서..별도의 클래스에서 구현
 * 하지만, 프레임 창 닫는 로직같은 일회성 로직은
 * Local Anonymous Inner로 구현하자
 */
class FourButton7 {
	//1. gui구성
	 Frame f;
	 Panel p;
	 Button b1,b2,b3,b4;
	 TextField tf;
	FourButton7(){
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
		
		//2. Listsner 부착...hasing 관계도 고려하세여...
		b1.addActionListener(new ButtonHandler7(this));
		b2.addActionListener(new ButtonHandler7(this));
		b3.addActionListener(new ButtonHandler7(this));
		b4.addActionListener(new ButtonHandler7(this));
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
		
}
public class FourButtonTest7 {

	public static void main(String[] args) {
		FourButton7 fb7 = new FourButton7();
		fb7.lunchFrame();
	}
}




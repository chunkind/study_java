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
 * WindowAdapter를 상속받지 말고
 * Local Anonymous Inner Class로 구현하세여...
 */
class FourButton6 implements ActionListener {
	//1. gui구성
	private Frame f;
	private Panel p;
	private Button b1,b2,b3,b4;
	private TextField tf;
	FourButton6(){
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
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			b1.setForeground(Color.RED);
			tf.setText("오빠야 어디가는데?");			
		}if(e.getSource()==b2){
			b2.setForeground(Color.CYAN);
			tf.setText("끝나기 전까진 끝난게 아니다");			
		}if(e.getSource()==b3){
			b3.setForeground(Color.GREEN);
			tf.setText("나정이 가시나야~~");			
		}if(e.getSource()==b4){
			b4.setForeground(Color.MAGENTA);
			tf.setText("칠천포로 합시당");			
		}	
	}//actionPerformed()
	//지금처럼 프레임 창닫는 로직이 대표적으로 Local Anonymous Inner Class로
	//작성되어져야 할 로직이다.
	//한번 쓰이고나면 다시 쓸 일이 없으니깐...일회성 객체로 선언,생성, 그자리에서
	//바로 구현하는 객체로 작성...
	
}
public class FourButtonTest6 {

	public static void main(String[] args) {
		FourButton6 fb6 = new FourButton6();
		fb6.lunchFrame();
	}
}




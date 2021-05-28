package event.handler.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FourButton implements ActionListener{
	//1. gui구성
	private Frame f;
	private Panel p;
	private Button b1,b2,b3,b4;
	private TextField tf;
	FourButton(){
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
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//각각의 버튼이 눌려졌을때 서로 다른 메세지를 TextField에 출력
		/*if(e.getActionCommand()=="나정이"){
			b1.setForeground(Color.RED);
			tf.setText("오빠야 어디가는데?");			
		}if(e.getActionCommand()=="칠봉이"){
			b2.setForeground(Color.CYAN);
			tf.setText("끝나기 전까진 끝난게 아니다");			
		}if(e.getActionCommand()=="쓰레기"){
			b3.setForeground(Color.GREEN);
			tf.setText("나정이 가시나야~~");			
		}if(e.getActionCommand()=="삼천포"){
			b4.setForeground(Color.MAGENTA);
			tf.setText("칠천포로 합시당");			
		}		*/
		
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
	}	
}
public class FourButtonTest2 {

	public static void main(String[] args) {
		FourButton fb = new FourButton();
		fb.lunchFrame();
	}
}




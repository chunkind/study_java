package event.chatting.test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Simple한 채팅을 구현하겠다.
 * 메세지를 입력하면(TextField에)
 * 작성한 글이 TextArea에 올라가는 로직을 작성.
 */

public class ChattingClient implements ActionListener{
	//1.gui구성
	Frame f;
	TextField tf;
	TextArea ta;
	
	ChattingClient(String title){
		f = new Frame(title);
		tf =  new TextField();
		ta=  new TextArea();
		
		f.add(tf,"South");
		f.add(ta,"Center");
		f.setSize(300, 200);		
		f.setVisible(true);
		
		/*
		 * 1. tf에 마우스의 포커스가 가도록..실행되자마자
		 * 2. ta는 비활성화 시키고
		 *    ---> 배경색을 다크하게 주도록 한다
		 */
		tf.requestFocus();
		ta.setEditable(false);
		ta.setBackground(Color.LIGHT_GRAY);
	}
	public void lunchFrame(){
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//2. 리스너 부착
		tf.addActionListener(this);
		
	}//lunchFrame
	public static void main(String[] args) {		
		ChattingClient cc = new ChattingClient("Chatting Room..");
		cc.lunchFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * TextField에 입력한 메세지가 
		 * TextArea 에 붙도록 한다(한줄씩, 그 다음줄에 붙어야 한다)
		 * TextField는 다시 Clear
		 * 마우스의 포커스는 TextField로
		 */
		ta.append(tf.getText()+"\n");
		tf.setText("");
		tf.requestFocus();
		
	}
}






















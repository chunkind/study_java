package event.handler.test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Event Handling 하는 순서
 * 1. GUI 구성
 * 2. Source(이벤트가 발생한 component)에 리스너를 부착
 *    b.addActionListener()
 * 3. 이벤트 발생하면 리스너가 대신 호출해준 메소드를 오버라이딩
 *    == Event Handling 이라 한다.
 * ::
 * 자바에서는 이벤트를 처리하는 방식에 있어서
 * Delegation Design Pattern을 사용한다.
 * Delegation은 리스너가 중요한 일을 위임해서 대신 해준다는 의미이다.
 * 여기서 리스너가 위임하는 것들.
 * 1)이벤트를 감지
 * 2)이벤트 발생시 메소드 호출
 * 3)메소드 호출시 발생한 이벤트 객체를 인자값으로 넣어줌
 */

class ButtonClick{
	//1. gui구성
	private Frame f;
	private Button b;
	ButtonClick(){
		f = new Frame("Event..");
		b = new Button("Click");
		b.setActionCommand("104 홧팅!!");
	}
	public void lunchFrame(){
		f.add(b);
		f.pack();
		f.setVisible(true);
		
		//2. Source에 리스너 부착
		//b.addActionListener(this);
		b.addActionListener(new ButtonHandler());
	}
	//3.버튼을 클릭하면 리스너가 감지하고 actionPerformed()을 호출하니깐
	//우리는 구현만 해놓으면 이벤트 발생시 알아서 동작한다...
/*	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("왜불러...");
		System.out.println("왜자꾸 불러...");		
	}*/	
}
public class ClickButtonEventTest1 {
	public static void main(String[] args) {		
		ButtonClick bc = new ButtonClick();
		bc.lunchFrame();
	}
}













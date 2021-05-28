package gui.container.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

/*
 * gui 프로그램을 작성할때는 
 * 1.Component 선언은 선언끼리
 * 2.Component 생성은 생성끼리
 * 3.Component 부착은 부착끼리
 * 몰아서 해준다.
 * ::  
 * 여러개의 Component들이 부착될수 있는 Container, Frame을 하나 띄워보겠다.
 */
public class FrameAppTest1 {
	//1.선언
	private Frame f;
	private Button b1;
	
	public FrameAppTest1(){
		//2. 생성
		f = new Frame("Frame Test..."); 
		b1=  new Button("Click Me!!");
				
		//3. Frame의 사이즈를 지정...300,400
		f.setSize(300, 400);
		//4. Frame의 배경색을 yellow로 지정
		f.setBackground(Color.YELLOW);
		f.setResizable(false);
		//5. f에 b1이 부착되어야 한다.
		//f.add(b1);
		
		//Frame은 생성했다고 보여지지 않는다.
		//setVisible(false)가 기본으로 잡혀있다
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameAppTest1();
	}
}

















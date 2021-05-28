package gui.layout.test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/*
 * Frame에 Button을 6개 부착하겠다.
 * GridLayout을 사용할 것이기에...
 * Frame의 레이아웃을 Grid로 변경
 */
public class GridLayoutTest {
	private Frame f;
	private Button b1,b2,b3,b4,b5,b6;
	
	GridLayoutTest(){
		f = new Frame("GridLayout...");
		b1=  new Button("B1");
		b2=  new Button("B2");
		b3=  new Button("B3");
		b4=  new Button("B4");
		b5=  new Button("B5");
		b6=  new Button("B6");
	}
	public void lunchFrame(){
		//3줄...2칸
		f.setLayout(new GridLayout(3, 2));
		f.add(b1); f.add(b2); f.add(b3);
		f.add(b4); f.add(b5); f.add(b6);
		
		//Component 크기만큼 사이즈를 최적화 시키는 기능..
		//별도의 사이즈를 주지 않을때 사용		
		//f.setSize(300, 300);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		GridLayoutTest test = new GridLayoutTest();
		test.lunchFrame();
	}
}












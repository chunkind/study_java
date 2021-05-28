package gui.layout.test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/*
 * Button 5개를 Frame에 부착할 것이다.
 */
public class BorderLayoutTest {
	//선언
	Frame f;
	Button b1,b2,b3,b4,b5;
	
	BorderLayoutTest(){
		f = new Frame("BorderLayout Manager...");
		b1 = new Button("B1");
		b2 = new Button("B2");
		b3 = new Button("B3");
		b4 = new Button("B4");
		b5 = new Button("B5");
	}
	public void lunchFrame(){
		/*
		 * Frame에 버튼 5개를 각각 부착
		 * Frame의 사이즈는 200,200
		 */
		/*f.add(b1,"North");
		f.add(b2,"South");
		f.add(b3,"West");
		f.add(b4,"East");
		f.add(b5,"Center");*/
		f.setLayout(new FlowLayout());
		f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);
		f.setSize(200, 200);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayoutTest test = new BorderLayoutTest();
		test.lunchFrame();
	}
}














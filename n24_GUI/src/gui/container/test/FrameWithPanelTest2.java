package gui.container.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanelTest2 {
	//Button의 4개 선언, 생성하고
	//4개의 버튼을 panel에 부착해보세여..
	private Frame f;
	private Panel p;
	private Button b1,b2,b3,b4;
	
	FrameWithPanelTest2(){
		f = new Frame("Frame With Panel");
		p = new Panel();
		b1 = new Button("Open");
		b2 = new Button("Close");
		b3 = new Button("OK");
		b4 = new Button("Fail");
		
		//layout....panel이 frame의 어디에 부착될지를 지정하는 것
		//f.add(p,BorderLayout.SOUTH);	
		f.add(p,BorderLayout.NORTH); 
		//FlowLayout은 Panel에 기본으로 작동하는 LayoutManager이다
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		f.setSize(500, 400);
		f.setBackground(Color.YELLOW);
		p.setBackground(Color.CYAN);
		
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameWithPanelTest2();
	}
}












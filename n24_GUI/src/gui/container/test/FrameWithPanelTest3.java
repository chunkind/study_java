package gui.container.test;
/*
 * 해당 코드에서는 기본으로 동작하는 레이아웃메니저를 변경해보겠다
 * Frame : BorderLayout
 * Panel : FlowLayout
 * Panel에 Button이 부착...왼쪽에서 오른쪽으로부착되었다.
 * 이것을 변경...setLayout()
 * Panel에 동작하는 레이아웃 --> BorderLayout
 * b1-North
 * b2-South
 * b3-West
 * b4-East
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanelTest3 {
	private Frame f;
	private Panel p;
	private Button b1,b2,b3,b4;
	
	FrameWithPanelTest3(){
		f = new Frame("Frame With Panel");
		p = new Panel();
		b1 = new Button("Open");
		b2 = new Button("Close");
		b3 = new Button("OK");
		b4 = new Button("Fail");
		
		//layout....panel이 frame의 어디에 부착될지를 지정하는 것
		//f.add(p,BorderLayout.SOUTH);
		p.setLayout(new BorderLayout());//변경..
		
		f.add(p,BorderLayout.NORTH); 
		//FlowLayout은 Panel에 기본으로 작동하는 LayoutManager이다
		p.add(b1,"North");
		p.add(b2,"South");
		p.add(b3,"Center");
		p.add(b4,"East");
		
		f.setSize(500, 400);
		f.setBackground(Color.YELLOW);
		p.setBackground(Color.CYAN);	
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameWithPanelTest3();
	}
}

/*
 * Component들이 어디에 배치되는가를 전문적으로 관리하는 매니저가 있다.
 * --->LayoutManager
 * 1) BorderLayout
 * 2) FlowLayout
 * 3) GridLayout
 * 4) CardLayout
 */





















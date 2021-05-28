package gui.layout.test;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardLayoutTest implements MouseListener{
	private Panel p1,p2,p3,p4,p5; //5장의 카드
	private Label lb1,lb2,lb3,lb4,lb5;
	private CardLayout myCard;
	
	private Frame f;
	CardLayoutTest(){
		f =new Frame("Card Test...");
		myCard = new CardLayout();
		
		p1=  new Panel();
		p2=  new Panel();
		p3=  new Panel();
		p4=  new Panel();
		p5=  new Panel();
		
		lb1 = new Label("This is First Panel");
		lb2 = new Label("This is Second Panel");
		lb3 = new Label("This is Third Panel");
		lb4 = new Label("This is Fourth Panel");
		lb5 = new Label("This is Fifth Panel");
	}
	public void lunchFrame(){
		f.setLayout(myCard);
		p1.setBackground(Color.yellow);
		p1.add(lb1);
		p2.setBackground(Color.green);
		p2.add(lb2);
		p3.setBackground(Color.magenta);
		p3.add(lb3);
		p4.setBackground(Color.white);
		p4.add(lb4);
		p5.setBackground(Color.cyan);
		p5.add(lb5);
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
		
		f.add(p1,"First");
		f.add(p2,"Second");
		f.add(p3,"Third");
		f.add(p4,"Fourth");
		f.add(p5,"Fifth");
		
		myCard.show(f, "First");
		f.setSize(300, 300);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		CardLayoutTest test =  new CardLayoutTest();
		test.lunchFrame();
	}
	@Override
	public void mouseClicked(MouseEvent e) {		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {		
		myCard.next(f);
	}
	@Override
	public void mouseReleased(MouseEvent e) {		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {		
		
	}
}










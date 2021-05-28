package event.handler.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler7 implements ActionListener {
	FourButton7 fb7 ;
	
	ButtonHandler7(FourButton7 fb7){
		this.fb7 = fb7;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==fb7.b1){
			fb7.b1.setForeground(Color.RED);
			fb7.tf.setText("오빠야 어디가는데?");			
		}if(e.getSource()==fb7.b2){
			fb7.b2.setForeground(Color.CYAN);
			fb7.tf.setText("끝나기 전까진 끝난게 아니다");			
		}if(e.getSource()==fb7.b3){
			fb7.b3.setForeground(Color.GREEN);
			fb7.tf.setText("나정이 가시나야~~");			
		}if(e.getSource()==fb7.b4){
			fb7.b4.setForeground(Color.MAGENTA);
			fb7.tf.setText("칠천포로 합시당");			
		}	
	}//actionPerformed()

}

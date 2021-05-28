package event.handler.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler3 implements ActionListener {
	FourButton3 fb3;
	
	ButtonHandler3(FourButton3 fb3){
		this.fb3 = fb3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==fb3.b1){
			fb3.b1.setForeground(Color.RED);
			fb3.tf.setText("오빠야 어디가는데?");			
		}if(e.getSource()==fb3.b2){
			fb3.b2.setForeground(Color.CYAN);
			fb3.tf.setText("끝나기 전까진 끝난게 아니다");			
		}if(e.getSource()==fb3.b3){
			fb3.b3.setForeground(Color.GREEN);
			fb3.tf.setText("나정이 가시나야~~");			
		}if(e.getSource()==fb3.b4){
			fb3.b4.setForeground(Color.MAGENTA);
			fb3.tf.setText("칠천포로 합시당");			
		}	
	}	
}

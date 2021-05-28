package event.handler.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Event Handling을 여기서 하겠다..
public class ButtonHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());	//Button의 Title				
	}
}











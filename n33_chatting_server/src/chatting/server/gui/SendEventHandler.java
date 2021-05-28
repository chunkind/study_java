package chatting.server.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendEventHandler implements ActionListener {
	ServerGUI sg;
	SendEventHandler(ServerGUI sg) {
		this.sg=sg;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String message = sg.tf.getText();
		if(message.equals("")) return;
		
		sg.ta.append(message + "\n");
		sg.tf.setText("");
		sg.tf.requestFocus(); 

	}

}

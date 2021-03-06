package org.client.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.client.gui.ClientGui;

public class SendListener implements ActionListener {
	private ClientGui gui;
	
	public SendListener(ClientGui gui){
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String message = gui.tf.getText();
		gui.tf.setText("");
		
		gui.service.sendMessage(gui.nick + " >> " + message);
	}
}

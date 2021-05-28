package org.client.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.client.gui.ClientGui;

public class ClearListener implements ActionListener {
	private ClientGui gui;
	
	public ClearListener(ClientGui gui){
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gui.ta.setText("");
	}
}

package org.client.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.client.gui.ClientGui;

public class QuitListener implements ActionListener {
	private ClientGui gui;
	
	public QuitListener(ClientGui gui){
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

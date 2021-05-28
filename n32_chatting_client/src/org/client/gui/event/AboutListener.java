package org.client.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.client.config.ClientConfiguration;
import org.client.gui.ClientGui;

public class AboutListener implements ActionListener {
	private ClientGui gui;
	
	public AboutListener(ClientGui gui){
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message = 
				"IP 주소 : " + ClientConfiguration.getIp() + "\n" + 
				"Port : " + ClientConfiguration.getPort() + "\n";
		JOptionPane.showMessageDialog(gui.frame, message);
	}
}

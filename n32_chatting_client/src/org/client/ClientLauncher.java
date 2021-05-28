package org.client;

import javax.swing.JOptionPane;

import org.client.gui.ClientGui;

public class ClientLauncher {
	public static void main(String[] args) {
		String nick = JOptionPane.showInputDialog("채팅에서 사용할 닉네임을 입력하세요 : ");
		ClientGui c = new ClientGui(nick);
		c.launchFrame();
	}
}

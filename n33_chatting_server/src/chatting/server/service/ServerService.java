package chatting.server.service;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import chatting.server.gui.ServerGUI;
import chatting.server.thread.ServerThread;

public class ServerService {
	public ServerSocket server;
	public Socket s;
	public ArrayList<ServerThread> list;

	public String IP = "/192.168.7.139";

	ServerGUI sg;

	public ServerService(ServerGUI sg) {
		this.sg = sg;
		list = new ArrayList<ServerThread>();
	}

	// 클라이언트가 접속하면 소켓이 만들어지고, 쓰레드가 생성, 리스트에 쓰레드가 추가
	// Thread 를 리스트에 추가하는 기능..
	public void addThread(ServerThread st) {
		list.add(st);
	}

	// Thread를 리스트에 삭제하는 기능
	public void removeThread(ServerThread st) {
		list.remove(st);
	}

	// Client가 보낸 메세지를 연결된 모든 클라이언트(리스트에 저장된 쓰레드)에게
	// 뿌리는 기능
	public void broadcast(String message) {
		sg.ta.append(message + "\n");
		for (ServerThread st : list) {
			st.sendMessage(message);
		}
	}

	public boolean IpBan(Socket s) throws Exception {
		String temp = s.getInetAddress().toString();
		System.out.println("ip is " + temp);

		if (temp.equals(IP)) {
			s.close();
			
			sg.ta.append("블랙리스트의 멤버 아웃 : " + IP);
			return true;
		}

		return false;
	}

	// 서버측 잡다구레한 로직을 다여기에//
	public void go() throws Exception {
		server = new ServerSocket(60000);
		while (true) { // 무한 루핑
			s = server.accept();
			if (IpBan(s))
				continue;
			ServerThread st = new ServerThread(s, this);
			this.addThread(st); // 소켓 생성
			st.start();// run()으로 간다.
			// this.removeThread(st);
		}
	}
}

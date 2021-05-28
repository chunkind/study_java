package chatting.server.thread;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import chatting.server.service.ServerService;

public class ServerThread extends Thread {
	public Socket s;
	BufferedReader br, br2;
	PrintWriter pw;
	ServerService ss;

	public ServerThread(Socket s, ServerService ss) {
		this.s = s;
		this.ss = ss; // 이 부분이 들어가야한다.
		System.out.println(s.getInetAddress() + " 님이 접속하셨습니다.");
		ss.broadcast(s.getInetAddress() + " 님이 접속하셨습니다.");
	}

	public void sendMessage(String str) {
		// 서버에서 받은 메세지를 창으로 출력... 스트림이 만들어져 있어야 한다.
		pw.println(str); // 이게바로 자신의 창으로 메세지가 출력...
	}

	public void run() {
		
		try {
			// 스트림 생성
			/*
			 * 클라이언트가 보낸데이타를 읽어서 / 다시 클라인트로 뿌린다.
			 */

			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			br2 = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);
			while (true) {
				String line = br.readLine();
				
				ss.broadcast(line); // 이게 채팅이다..
			}
		} catch (Exception e) {
			// 클라이언트의 연결이 끊어졌을때의 로직을 작성...
			System.out.println(s.getInetAddress() + " 님의 연결이 끊어졌습니다..");
			ss.broadcast(s.getInetAddress() + " 님이 방을 나가셨습니다.");
			ss.removeThread(this); // 여기서 this 는 Thread
		}
	}

}

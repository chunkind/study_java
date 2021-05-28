package chatting.server.step2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import chatting.client.step2.ChattClient2;

/*
 * Client가 보낸 메세지를 받아서 
 * 다시 Client로 뿌린다 
 */
public class ChattServer2 {// 필드 선언
	// 필드 선언
	ServerSocket ss;
	BufferedReader br;
	Socket s;
	PrintWriter pw;

	public void go() {
		try {
			ss = new ServerSocket(60000);
			System.out.println("Server Ready....");

			s = ss.accept();
			InetAddress foreigner = s.getInetAddress();
			System.out.println(foreigner + "님이 접속하셨습니다.");

			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			while (true) {
				String line = br.readLine();
				pw.println(line);		
					
			}
		
		} catch (Exception e) {
			System.out.println("연결이 끊어졌습니다....");
		}
		
	}
	
		public static void main(String[] args) {
			ChattServer2 cs2 = new ChattServer2();
			cs2.go();
	}
}
	

	

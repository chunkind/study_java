package chatting.server.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 클라이언트가 보낸 메세지 받아서 / 자신의 콘솔창으로 출력
 * ::
 * 입력스트림 2개 - 보조/기본
 */
public class ChattServer {
		ServerSocket server;
		Socket s;
		BufferedReader br;
		
		public void go() throws Exception{
			/*
			 * 1.ServerSocket생성 
			 * 2. client가 접속하면 맞아들이고 Socket을 하나 반환 받는다
			 * 3. 스트림 생성
			 * 4. 콘솔로 출력
			 */
			
			server = new ServerSocket(60000);
			System.out.println("Server Ready....." );
			
			s = server.accept();
			InetAddress user = s.getInetAddress();
			System.out.println(user+"님이 접속하셨습니다");
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println("Client가 보낸 message ::" + line);
			}
			br.close();
		}
	
	public static void main(String[] args) throws Exception {
		ChattServer cs = new ChattServer();
		cs.go();
		
	}
}



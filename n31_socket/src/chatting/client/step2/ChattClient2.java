package chatting.client.step2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 키보드로 입력한 데이타를 읽어서 
 * 서버측으로 날리는 로직 
 * 서버가 다시 던지는 데이타를 받아서 
 * 자신의 콘솔창으로 출력
 */
public class ChattClient2 {
	// 필드 선언
	Socket s;
	BufferedReader br1, br2; // 하나는 키보드 하나는 서버에서 읽어들인것
	PrintWriter pw;

	public void go() {
		try {
			s = new Socket("127.0.0.1", 60000);
			System.out.println("Socket Creating....2");

			br1 = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);

			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));

			while (true) {

				// 이 부분의 로직을 잘 이해해야 함
				String line = br1.readLine();
				pw.println(line); // 서버로 날라간다
				// 서버에서 던진걸 다시 읽어들이기 전까지 Blocking 당한다
			String serverLine	= br2.readLine();
			System.out.println("서버가 보낸 메세지 : " + serverLine);
			
			}
			
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws Exception {
		ChattClient2 cc2 = new ChattClient2();
		cc2.go();

	}
}

package chatting.client.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 키보드로 데이타를 읽어서 / 서버로 뿌리는 로직 
 * ::
 * 입력(자체적 생성) / 출력(소켓으로부터 리턴받아서) 
 */
public class ChattingClient {
	Socket s;
	BufferedReader br;
	PrintWriter pw;

	public void go() throws Exception {
		// 1. socket 생성
		s = new Socket("127.0.0.1", 60000);
		// 2. 스트림 생성
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(s.getOutputStream(), true);
		System.out.println("Stream Creating....");
		// 3. 읽어들인 데이타를 서버로 뿌린다
		String line = null;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}
		pw.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {
		ChattingClient cc = new ChattingClient();
		cc.go();

	}
}

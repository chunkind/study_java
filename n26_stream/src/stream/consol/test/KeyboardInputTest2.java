package stream.consol.test;
/*
 * 키보드로 입력받은 데이타를 콘솔창으로 출력하는 로직...
 * "고마해라" 라는 메세지가 입력되면 더이상 입력받지 않도록... Lopping을 빠져나오도록
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 키보드로 읽어들인 데이타를 콘솔로 출력
 * 입력 스트림 : InputStreamReader, BufferedReader 2개
 * 출력스트림 :  필요없다... System.out.println()을 바로 사용
 *
 */
public class KeyboardInputTest2 {
	public static void main(String[] args) throws IOException {
		//1. 스트림 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("InputStream Creating... ");
		//2. 계속 입력하면 계속 읽어들여서 
		String line = null;
		while((line = br.readLine()) !=  null){
			System.out.println("Reading : " + line);
			if(line.equals("고마해라"))
				break;
		}
		//3. 콘솔창으로 출력 
			
	}

}


package stream.consol.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 키보드로 읽어들인 데이타를 콘솔로 출력
 * 입력 스트림 : InputStreamReader, BufferedReader 2개
 * 출력스트림 :  필요없다... System.out.println()을 바로 사용
 *
 */
public class KeyboardInputTest1 {
	public static void main(String[] args) {
			//1. 스트림 객체 생성 
			InputStreamReader ir =  new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);  
			
		
			System.out.println("InputStream Creating...");
			System.out.println("키보드로 데이타를 입력하세요...\n");
		
			//2. 읽어들인다..
			try {
			String line	= br.readLine();
			while(line != null){
			//3. 읽어들인 데이타를 콘솔로 출력
			System.out.println("Read :: "+ line);
				line = br.readLine(); 
			}
			} catch (IOException e) {
				e.printStackTrace();
			
			}
			
	}

}


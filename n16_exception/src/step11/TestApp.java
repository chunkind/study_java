package step11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp {
	public static void main(String[] args) {
		String fileName = "c:\\Kosta\\test\\hoho.txt";
		FileReader fr = null;
		try {
			System.out.println("1. FileReader Creating...");
			fr = new FileReader(fileName);
			fr.read();
			System.out.println("2. read()를 통해서 파일의 내용을 읽어들입니다..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 또 다른 Exception이 수행될때
			// 이 부분은 무조건 수행된다...
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

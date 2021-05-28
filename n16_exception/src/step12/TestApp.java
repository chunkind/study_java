package step12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "c:\\Kosta\\test\\hoho.txt";
		FileReader fr = null;
		try {
			System.out.println("1. FileReader Creating...");
			fr = new FileReader(fileName);
			fr.read();
		} finally {
			System.out.println("2. read()를 통해서 파일의 내용을 읽어들입니다..");
			try {
				fr.close();
			} catch (IOException e) {
			}
		}
	}
}

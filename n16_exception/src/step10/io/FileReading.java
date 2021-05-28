package step10.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading {
	// 파일에 있는 내용을 읽어오는 기능을 하나 작성...
	public void readFile(String fileName) throws FileNotFoundException { // throws로 던진다
		System.out.println("FileReader Creating..."); // 파일이 있어도 오류, 없어도 오류...
		FileReader file = new FileReader(fileName); // 파일을 못찾으니 에러 뜸..
	}
}

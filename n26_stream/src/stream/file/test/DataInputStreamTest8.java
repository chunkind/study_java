package stream.file.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/*
 * watermelon.png 파일을 읽어서 
 * src/water.png  이 파일로 출력하는 코드를 작성...
 * water.png을 열어서 이미지가 출력되어 있는지를 확인..
 * ::
 * DataInputStream이 가지는 보조스트림으로서의 기능
 * binary data를 DataInputStream을 통해서 
 * 자바 기본형(int)으로 변형
 * 이러한 데이타 조작부분은 buffering 부분에서 일어남
 * 필터계열이기에 가능 
 */
public class DataInputStreamTest8 {
	public static void main(String[] args) throws IOException{
		String inputFile = "src/watermelon.png";
		String outputFile = "src/water.png";
		
		try {
			DataInputStream ds = new DataInputStream(new FileInputStream(	inputFile));
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile));
			System.out.println("DataInputStream Creating.....");
			System.out.println("DataOutputStream Creating.....");
			
			int data = 0;
			while ((data = ds.read()) != -1) {
				dos.write(data);
			
			}
			
			dos.close();
			ds.close();
		} catch (EOFException e) {
		
		} catch (IOException e) {
		}
		
	}
}



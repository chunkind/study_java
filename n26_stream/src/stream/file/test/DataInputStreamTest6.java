package stream.file.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * DataInputStream을 사용 
 * 읽어들인 데이타를 콘솔로 출력
 * src/score.dat 
 */
public class DataInputStreamTest6 {
	public static void main(String[] args) {
		String inputFile = "src/score.dat";
		try {
			DataInputStream ds = new DataInputStream(new FileInputStream(
					inputFile));
			System.out.println("DataInputStream Creating.....");

			int data = 0;
			while ((data = ds.readInt()) != -1) {
				
				System.out.println(data);
			}
		} catch (EOFException e) {

		} catch (IOException e) {
		}
	}

}

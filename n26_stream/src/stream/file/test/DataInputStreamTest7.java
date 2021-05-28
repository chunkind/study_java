package stream.file.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * score.dat 파일을 readInt() 로 읽어서 
 * 각각의 score를 출력했다
 * 여기서 모든 점수의 총합을 출력... 로직을 작성
 */
public class DataInputStreamTest7 {
	public static void main(String[] args) throws IOException{
		String inputFile = "src/score.dat";
		int total = 0; 
		try {
			DataInputStream ds = new DataInputStream(new FileInputStream(	inputFile));
				
			System.out.println("DataInputStream Creating.....");

			int data = 0;
			while ((data = ds.readInt()) != -1) {
				System.out.println(data);
					total += data;
			}
		} catch (EOFException e) {
					System.out.println("점수의 총합 : " +total);
		} catch (IOException e) {
		}
		
	}
}


package step03;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author ck
 * DataInputStreamEx2 를 try-with-resources 구문 사용
 */
public class DataInputStreamEx3 {
	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		
		//old
//		FileInputStream fis = null;
//		DataInputStream dis = null;
//		try {
//			fis = new FileInputStream("src/step03/score.dat");
//			dis = new DataInputStream(fis);
//			while(true) {
//				score = dis.readInt();
//				System.out.println(score);
//				sum += score;
//			}
//		}catch(EOFException e) {
//			System.out.println("점수의 총합은 " + sum + " 입니다.");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally{
//			try {
//				if(dis!=null) {
//					dis.close();
//				}
//			} catch (IOException ie) {
//				ie.printStackTrace();
//			}
//		}
		
		try (FileInputStream fis = new FileInputStream("src/step03/score.dat");
			 DataInputStream dis = new DataInputStream(fis)){
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch(EOFException e) {
			System.out.println("점수의 총합은 " + sum + " 입니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
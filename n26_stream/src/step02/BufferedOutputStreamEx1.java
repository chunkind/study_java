package step02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx1 {
	public static void main(String[] args) {
		try{
			String path = 
				"src/step02/BufferedOutputStreamEx1.java";
			FileOutputStream fos = new FileOutputStream(path, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			//파일 123.txt에 1부터 9까지 출력.
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			fos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
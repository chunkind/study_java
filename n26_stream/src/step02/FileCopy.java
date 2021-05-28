package step02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {
		try {
			String path1 = "src/step02/FileCopy.java";
			String path2 = "src/step02/FileCopy.bak";
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int data = 0;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

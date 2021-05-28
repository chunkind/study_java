package step02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {
	public static void main(String[] args) throws IOException {
		String path = "src/step02/FileViewer.java";
//		String path = "/Users/ck/development/eclipse/workspace/hangang/doc/한강_기획서(희귀동물)_v0001.pptx";
		
		FileInputStream fis = new FileInputStream(path);
		
		int data = 0;
		while((data=fis.read()) != -1) {
			char c = (char)data;
			System.out.print(data);
//			System.out.print(c);
		}
	}
}

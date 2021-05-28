package step03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			String path = "src/step03/sample.dat";
//			String path = "/Users/ck/development/eclipse/workspace/study_java_web_all/dev01_java37_Stream/src/step03/sample.dat";
			fos = new FileOutputStream(path);
			dos = new DataOutputStream(fos);
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
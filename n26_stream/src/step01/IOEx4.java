package step01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author ck
 * @date 2019. 07. 06.
 * 이전 코드에서 마지막 값을
 * 덮어씌우는 코드를 개선 한 것.
 */
public class IOEx4 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) {
				System.out.println("블로킹없이 읽어 올 수 있는 바이트의 수 : " + input.available());
				
				//old
//				input.read(temp);
//				output.write(temp);
				
				//new
				int len = input.read(temp);
				System.out.println("len : " + len);
				output.write(temp, 0, len);

				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	private static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}

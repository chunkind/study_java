package step01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author ck
 * @date 2019. 07. 06.
 * 마지막 결과를 보면 {8, 9} 가 아니라 {8, 9, 6, 7}
 * 인 이유는 이전값에 덮어씌우기 때문이다. 
 * 개선코드는 다음 코스에. 
 */
public class IOEx3 {
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
				input.read(temp);
				output.write(temp);

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

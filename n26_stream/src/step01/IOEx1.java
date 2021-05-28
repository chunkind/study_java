package step01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author ck
 * @date 2019. 07. 06
 * 스트림을 이해하기 위한 기본적인 코드.
 * InputStream을 OutputStream에 쓰는 코드.
 * 바이트배열은 사용하는 자원이 메모리 밖에 없으므로
 * 가비지컬렉터에 의해 자동적으로 자원을 반환하기 때문에
 * close()를 사용하지 않았다.
 * 
 * 이코드의 문제점은 한 번에 1byte만 읽고 쓰므로 
 * 작업효율이 떨어진다.
 */
public class IOEx1 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1) {
			output.write(data); // void write(int b)
		}
		
		outSrc = output.toByteArray(); // 스트림의 내용을 byte배열로 반환한다.
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
	}
}

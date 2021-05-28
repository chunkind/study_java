package stream.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
/*
 * PrintWriter를 기본스트림으로 사용
 * ::
 * 이렇게 기본스트림으로 사용하게 되면 
 * println() 를 사용할순 있지만 true키워드  사용이 제한 
 */

public class FileWriterTest5 {
	public static void main(String[] args) throws IOException{
				String inputFile = "src/poem.txt";
				String outputFile =  "src/output/result.txt";
				
				BufferedReader br = new BufferedReader(new FileReader(inputFile));
				PrintWriter pw = new PrintWriter(outputFile);   
				//PrintWriter  기본과 보조 전부 사용 가능
				//FileWriter 안에 있는 true는 이어붙여 쓰기 .... 
				System.out.println("Stream Creating....");
					String line = null;
				/*
				 * flush()나 close()를 사용하지 않고 autoFlushing 기능이 일어나도록 
				 * 생성자 안을 수정하세요 
				 */
					while((line = br.readLine()) != null){
						pw.println(line);
					}
					pw.close();
					br.close();
	}
}
				
				


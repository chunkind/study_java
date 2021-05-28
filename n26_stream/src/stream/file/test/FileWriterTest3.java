package stream.file.test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * poem.txt 파일의 내용을 읽어서
 * src/output/result.txt 파일로 출력
 * ::
 * 이때 입력 대상이 되는 파일은 (poem.txt) 미리 만들어져 있어야 하지만 
 * 출력용 파일은 (result.txt)미리 만들어져 있지 않아도 된다
 * 프로그램이 실행되는 것과 동시에 파일은 생성되어지고 그곳으로 데이타가 
 * 출력될것이다
 * ::
 * 입력스트림 : FileReader,  BufferedReader 
 * 출력스트림 : FileWriter, BufferedWriter 
 */
public class FileWriterTest3 {
	public static void main(String[] args) throws IOException {
				/*
				 *  String inputFile = "src/poem.txt";
				 *  String outputFile =  "src/output/result.txt";
				 *  BufferedReader br = new BufferedReader(new FileReader(inputFile));
				      BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
					
					system.out.println("stream Creating...");
					String line = null;
					sysout("result.txt 파일을 열어보세요.. 이때 F5!!")
					
					while((line = br.readline()) != null){
					 	bw.write(line);
					 	bw.newLine();
					 	}
				 */
		
		
				BufferedReader br = new BufferedReader(new FileReader("src/poem.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/output/result.txt"));
				
				String line = null;
				System.out.println("FileReader Creating...");
				System.out.println("FileWriter Creating...");
				while((line = br.readLine()) != null){
					System.out.println(line);
				bw.write(line);
				// bw.flush();  //while 바깥에 놓았을 때 
				bw.newLine();  //auto Flush 기능 ...
				}
				br.close();
				bw.close();
				
	}

}

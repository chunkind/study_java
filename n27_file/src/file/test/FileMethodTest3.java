package file.test;

import java.io.File;
import java.io.IOException;
//test1, test2의 메소드를 다시 반복해서 연습
public class FileMethodTest3 {
	public static void main(String[] args) throws IOException{
		File dir = new File("c : " + File.separator+"kosta" + File.separator+ "prob1");
		//1.
		System.out.println("파일의 경로 : " + dir.getPath());  // c : \kosta\prob1 
		System.out.println("파일의 경로가 실제로 존재하는가? "+ dir.exists()); // false 
		
		//2. 
		File dir2 = new File("c:" + File.separator+ "kosta2 "+ File.separator+ "prob2");
		System.out.println("디렉토리 생성 :: " + dir2.mkdirs());
		System.out.println("파일인가요?  "+ dir2.isFile());
		System.out.println("그럼 디렉토리 인가요?" + dir2.isDirectory());
		System.out.println("디렉토리의 절대경로 : " + dir2.getAbsolutePath());
		System.out.println("디렉토리의 상대경로 ::" + dir2.getParent());
		
		//3.
	File dir3= dir2.getParentFile(); // c : \kosta2
		System.out.println(dir3.getParent()); //c
		
		//4.
		File file = new File(dir2.getPath()+ File.separator + "hello.html");
		System.out.println("파일의 경로 : " + file.getPath());
		System.out.println("파일이 존재합니까? "+ file.isFile()); //false 
		
		//만약에 파일이 존재하지 않는다면 해당파일을 디렉토리 안에 생성한다..
		if(!file.isFile() ){
		boolean flag= file.createNewFile();
			System.out.println("해당파일을 생성 : " + flag);
		}
		
		//5.
		//listFiles()를 이용해서 생성된 파일명을 출력....for
		File [ ] fa = dir2.listFiles();
		for(File f : fa){
			System.out.println("생성된 파일명 : " + f.getName());
		}
		
	
		
	}
}



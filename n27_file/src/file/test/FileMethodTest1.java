package file.test;

import java.io.File;

/*
 * File 클래스에 대해서 다뤄보겠다
 * File 클래스의 기능들을 알아보겠다
 * :: 
 * File이라 함은?
 *  : 디렉토리(path) + fileName  
 */
public class FileMethodTest1 {
	public static void main(String[] args) {
File f = new File("C:\\PerfLogs"+File.separator+"lkb\\javaPro\\eclipse\\javaWorkspace\\java36_File\\src\\file\\test\\FileMethodTest1.java");
//File.separator 기능 : 운영체제별로 구분자가 다르기 때문에 우리가 정해주는것이 아니라 jvm에서 알아서 운영체제에 맞도록 구분자를 스스로 정해주는 것 
		String fileName = f.getName();
		System.out.println("f.getName() : " + fileName);
		int pos = fileName.lastIndexOf(".");
		System.out.println("확장자를 제외한 파일명 : "+ fileName.substring(0,pos)); //0번째부터 마지막 .(점) 있는 부분까지 출력 
		System.out.println("파일의 확장자만 출력 : " + fileName.substring(pos+1));
		
		System.out.println("파일을 포함한 경로 : f.getPath() - "+ f.getPath());
		System.out.println("파일의 절대 경로: f.getAbsolutePath :  " + f.getAbsolutePath() );
		
		System.out.println("f.getParent() : " + f.getParent());
		System.out.println("f.getParentFile() : "+ f.getParentFile());
		System.out.println("File.seperator : " + File.separator );
		System.out.println("File Length : " + f.length());
}
}
/*File f = new File("C:\\PerfLogs"+File.separator+"lkb\\javaPro\\eclipse\\javaWorkspace\\java36_File\\src\\file\\test\\FileMethodTest1.java");
		
	String fileName	= f.getName();
	System.out.println("f.getName() : " + fileName); // FileMethodTest1.java
	System.out.println("파일의 경로를 제외한 파일명만 리턴받는 기능 ::"+ fileName); // FileMethodTest1.java
	
	//확장자를 제외한 파일 이름만 출력할려면?
	//.java를 빼야한다...String 의 기능을 사용..
   int pos = fileName.lastIndexOf(".");
   //System.out.println(pos);
   System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos)); //FileMethodTest1
   System.out.println("파일의 확장자만 출력 : " +fileName.substring(pos+1) );  //java
   
   System.out.println("파일을 포함한 경로 : f.getPath() : " + f.getPath()); // 전부 다 나온다 .. 
   System.out.println("파일의 절대경로 :  f.getAbsolutePath() : " + f.getAbsolutePath());
   
   //////////////////////////////////// getParent()////////////////////////////////////////
   System.out.println("f.getParent() : " + f.getParent());  //상대경로 
   System.out.println(" f.getParentFile() : " + f.getParentFile());
   System.out.println("File.seperator ::" + File.separator);  // 역슬레시가 나타난다.. 
   System.out.println("File Length : " + f.length() + "byte"); //1kb*/	

































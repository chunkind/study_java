package file.test;

import java.io.File;

public class FileMethodTest2 {
	public static void main(String[] args) {
			File dir = new File("C:\\filetest1\\step1\\code");
			File dir2 = new File("C:\\fileteat1");
			System.out.println("디렉토리가 생성되어 있나?");
			
			dir.mkdirs();
			dir2.mkdir();
		}
	}
        /*File dir = new File("c:\\filetest\\step1\\code");
			File dir2 = new File("c:\\filetset1");
			System.out.println("디렉토리가 생성되어 있나요??");
			
			//1. 디렉토리를 각각 생성해보세요 ... dir, dir2 
			// mkdir()/ mkdirs() / getParent()/ getParentFile()  4가지 쓰임새 확인!!
			System.out.println("========= mkdir()/ mkdirs() ==================");
			dir.mkdirs();
			dir2.mkdir();  //mkdirs()는?  사용가능 
			System.out.println("=========== getParent()/ getParentFile() ===============");
	
			String fileDir = dir.getParent();
			System.out.println(fileDir); //c:\filetest\step1
			
			File fd = dir.getParentFile();
			System.out.println(fd);  //c:\filetest\step1
			System.out.println(fd.getParent()); //c:\filetest
			
			File fd2 =dir2.getParentFile();
			System.out.println(fd2); //c:
			
			System.out.println("=========listFiles()/isDirectory()/isFile() ================================");
			File [ ] fa =fd.listFiles();
			
 * for문을 이용해서 만약에 디렉토리 안에 파일이 있다면 파일명을 출력 
			 
			for(int i =0; i<fa.length; i++){
				if(fa[i].isFile())
				System.out.println( "FileName ::"+fa[i].getName());
				//삼항연산자를 이용해 보세요...isDerectory() / isFile() 
				String name = fa[i].getName();
				System.out.println(fa[i].isDirectory() ? "[ fileDirectory ] -" : name);  //[ fileDirectory ] -
				}*/

	

























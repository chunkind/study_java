package file3.book.test;

import java.io.File;
import java.util.ArrayList;

//page 852 예제 14-29
public class File3BookTest1 {
			static int totalFiles = 0;
			static int totalDirs = 0; 
	
	public static void main(String[] args) {
				if(args.length != 1){
					System.out.println("USAGE : java FileBookTest1 DIRECTORY");
					System.exit(0);
				}
				
				File dir = new File(args[0]);
				
				if(!dir.exists() || !dir.isDirectory()){
					System.out.println("유효하지 않은 디렉토리입니다");
					System.exit(0);
				}
				printFileList(dir);
				System.out.println();
				System.out.println("총" + totalFiles + "개의 파일");
				System.out.println("총" + totalDirs + "개의 디렉토리");
			}		
	
		public static void printFileList(File dir){
			System.out.println(dir.getAbsolutePath() + "디렉토리");
			File [ ] files = dir.listFiles();
			
			ArrayList subDir  = new ArrayList();
			
			for(int i =0; i<files.length; i++){
				String fileName = files[i].getName();
				
				if(files[i].isDirectory()){
					fileName = "["+ fileName+ "] ";
					subDir.add(i+"");
				}
				System.out.println(fileName);
			}
		}
				

}


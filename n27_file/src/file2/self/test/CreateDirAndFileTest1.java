package file2.self.test;

import java.io.File;

class FileExam{
			public void creatDirAndFile(String path) throws Exception{
				/*
				 * path에 해당하는 경로가 없으면 경로를 생성
				 * 해당하는 경로가 만들어져 있으면 그 안에 파일을 생성
				 * 최종적으로 생성된 파일의 이름을 콘솔창으로 출력.. 
				 */
				/*File file = new File(path);
				if(!file.exists() )
					file.getParentFile().mkdirs();
				
				if(!file.isFile())
					file.createNewFile();
				System.out.println(file.getName());*/
				File file = new File(path);
				File dir = file.getParentFile();
				boolean b = dir.mkdirs();
			
			}
}

public class CreateDirAndFileTest1 {
	public static void main(String[] args) {
				FileExam exam =  new FileExam();
				
				try {
					exam.creatDirAndFile("c:\\fileExam\\exam1\\test1.mp3");
					exam.creatDirAndFile("c:\\fileExam\\exam1\\note.txt");
					exam.creatDirAndFile("c:\\fileExam\\exam1\\Hello.java");
					exam.creatDirAndFile("c:\\fileExam\\exam1\\greeting.avi");
				} catch (Exception e) {
					e.printStackTrace();
				}
				

	}
}


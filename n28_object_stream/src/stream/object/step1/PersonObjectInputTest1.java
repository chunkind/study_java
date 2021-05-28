package stream.object.step1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//역직렬화 예제 
/*
 * FileInputStream / ObjectInputStream 을 생성
 * objFile / Person.obj 파일을 읽어서 ...  readObject()
 * 콘솔창으로 연아의 정보를 출력 
 */

public class PersonObjectInputTest1 {
	
	public static void main(String[] args) throws Exception{
		String fileName =  "c:\\objFile\\person.obj";		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		System.out.println("이름 : "+ p.getName()+", 주소 : "+ p.getAddress());
				
	

	}

}

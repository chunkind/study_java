package stream.object.step1;
/*
 * code Pattern 
 * ----직렬화----
 * 1) stream 생성
 * 2) 날린다
 * --------------------------
 * -----역직렬화----
 * 3)stream 생성
 * 4)읽어들린다 Object로 리턴 ---- Casting..Person 타입으로
 * 5)person을 출력... getter()/ toString()
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonObjectOutputTest1 {
	public static void main(String[] args) throws IOException{
				//1. 스트림 생성
				String fileName = "c:\\objFile\\person.obj";	
				
				FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				//2. Person 객체를 생성
				Person p = new Person("김연아", 27, "방배동", "kim77");
				
				//3. Sink(File)쪽으로 날린다
				oos.writeObject(p);
				//4. 스트림 닫아준다
				oos.close();
				System.out.println("Person.obj 파일에 연아에 대한 정보를 저장...");
				System.out.println("연아에 대한 정보를 확인하실려면 역직렬화해서 추후에 확인...");
	}

}

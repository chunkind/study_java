package stream.object.step2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * 역직렬화 로직...
 * ::
 * 역직렬화(읽어들일때)를 할때는 직렬화할때의 순서를 주의해야한다
 * 그렇지 않으면 순서가 뒤틀려서 데이타가 꼬이기 때문이다
 * 이런 이유로 여러개의 객체를 스트림을 통해서 전달할때는 각각의 객체를
 * 직렬화 / 역직렬화 시키는 것보다 Collection에 한꺼번에 담아서 
 * 한번에 날리고 / 읽어들이는 작업이 더 바람직하다.
 */
public class UserInfoObjectInputTest2 {
	public static void main(String[] args) throws Exception{
		String fileName = "src\\userinfo.ser";
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		//2. 읽어들인다..
		UserInfo user1 = (UserInfo)ois.readObject();
		UserInfo user2 = (UserInfo)ois.readObject();
		UserInfo user3 = (UserInfo)ois.readObject();
		ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
		
		//3. 콘솔창으로 각각의 정보를 출력 
		System.out.println("user1 :" + user1);
		System.out.println("user2 :" + user2);
		System.out.println("user3 :" + user3);
		System.out.println("list :" + list);
		
		ois.close();
	}
}

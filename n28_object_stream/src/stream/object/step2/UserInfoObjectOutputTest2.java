package stream.object.step2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserInfoObjectOutputTest2 {
	public static void main(String[] args) throws Exception{
				String fileName = "src\\userinfo.ser";
				FileOutputStream fos = new FileOutputStream(fileName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				
				UserInfo user1 = new UserInfo("James", 44, "jj123");
				UserInfo user2 = new UserInfo();
				UserInfo user3 = new UserInfo("gosling", 29, "gogo88");
				//user1 user2 user3 순으로 입력했다면 똑같은 순서로 나와야한다....
				// arrayLIst 만들고 담아서 날리기
				ArrayList<UserInfo> list = new ArrayList<UserInfo>();
				
				list.add(user1);
				list.add(user2);
				list.add(user3);
				
			  //직렬화 ... 날리는게 직렬화이다.. 
				oos.writeObject(user1);
				oos.writeObject(user2);
				oos.writeObject(user3);
				oos.writeObject(list);
					
					oos.close();
					System.out.println("직렬화 작업을 끝냈습니다... ");
					System.out.println("userinfo.ser 파일이 생성됬는지 확인...");
	}
	}



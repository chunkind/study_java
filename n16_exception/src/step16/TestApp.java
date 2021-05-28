package step16;

import step16.exception.CommonException;
import step16.service.Service;

public class TestApp {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			service.doing();
		} 
		catch (CommonException e) {
			System.out.println("Main CommonException :: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Main Exception :: " + e.getMessage());
		}
	}
}

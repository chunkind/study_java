package step15;

import step15.service.Service;

public class TestApp {
	public static void main(String[] args) {
		Service service = new Service();
		try {
//			service.doing1();
//			service.doing2();
			service.doing3();
		} catch (Exception e) {
			System.out.println("main catch block :: " + e.getMessage());
		}
	}
}

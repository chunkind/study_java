package step15.service;

public class Service {
	public void doing1() {
		try {
			throw new Exception("Error!!");
		}catch (Exception e) {
			System.out.println("Service catch block :: " + e.getMessage());
		}
	}
	public void doing2() throws Exception{
		try {
			throw new Exception("Error!!");
		}catch (Exception e) {
			System.out.println("Service catch block :: " + e.getMessage());
		}
	}
	public void doing3() throws Exception{
		try {
			throw new Exception("Error!!");
		}catch (Exception e) {
			System.out.println("Service catch block :: " + e.getMessage());
			throw new Exception(e.getMessage());
		}
	}
}

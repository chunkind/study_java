package step16.service;

import step16.dao.Dao;

public class Service {
	
//	public void doing() throws SQLException, CommonException, Exception{
	//부모 클래스로 퉁치자.
	public void doing() throws Exception{
		try {
			Dao dao = new Dao();
			dao.access();
		}
//		catch (CommonException e) {
//			System.out.println("Service CommonException :: " + e.getMessage());
//		}
		catch (Exception e) {
			System.out.println("Service Exception :: " + e.getMessage());
		}
	}
}

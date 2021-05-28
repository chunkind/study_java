package step16.dao;

import java.net.SocketTimeoutException;

import step16.exception.CommonException;
import step16.service.Service;

public class Dao {
	private Service service;
	
	public void access() throws CommonException{
		try {
			throw new SocketTimeoutException("타임아웃");
		}
		catch (SocketTimeoutException e) {
			System.out.println("Dao SocketTimeoutException :: " + e.getMessage());
			throw new CommonException(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Dao Exception :: " + e.getMessage());
			throw new CommonException(e.getMessage());
		}
	}
	
}

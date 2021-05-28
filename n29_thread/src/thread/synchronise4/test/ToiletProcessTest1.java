package thread.synchronise4.test;
class ToiletUser implements Runnable{
		
	private String tNumber = "toilet01";
		
	@Override
	public void run() {
	//화장실에서 일보는 로직 
		try{
			     ddWork();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	/*
	 * 화장실을 공동으로 소유하는 상황에서 
	 * 정기가 일보는 도중에 자꾸만 민재가 끼어드는 현상이 항상 일어난다
	 * 이때 동기화 처리를 하면 
	 * 정기가 일을 다보고 나올때까지 절대로 민재가 화장실을 사용할수 없다 
	 */
		
	public  void ddWork() throws InterruptedException{
	String threadName	= Thread.currentThread().getName();
	synchronized(this){
	System.out.println(threadName + "  " + tNumber+ " 1. 화장실 들어감.");
	System.out.println(threadName + "  " + tNumber+ " 2. 일보기 시작함...");
	Thread.sleep(1000);
	System.out.println(threadName + "  " + tNumber+ " 3.일 다보고 정리...");
	}
	}
	
}

public class ToiletProcessTest1 {
	public static void main(String[] args) {
		ToiletUser user = new ToiletUser();
		Thread t1 = new Thread(user, "정기");
		Thread t2 = new Thread(user, "민재");
		
		t1.start();
		t2.start();

	}
}

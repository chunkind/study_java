package thread.join5.test;
class JoinThread extends Thread{
	static int i=10;
	public void run(){
		JoinThread.i = 500;
	}
}
public class JoinThreadTest1 {
	public static void main(String[] args) throws InterruptedException{		
		JoinThread join = new JoinThread();
		join.start();
		
		join.join(); //main thread를 blocking 시키는 효과가 난다
		//join이란 쓰레드가 수행을 마치기 전까지 main 이 무작정 기다려야한다.
		//일종의 동기화효과
		
		System.out.println(JoinThread.i);
	}
}










package thread.basic.test;
/*
 * Thread 를 작성하는 두번째 방법 :
 * Runnable을 상속받는 방법
 * - start()를 사용할수 없다...Thread 클래스를 가져야한다.
 */
class GGThread implements Runnable{
	int i=0;	
	
	@Override
	public void run() {
		while(true){	
			try{
				Thread.sleep(500);
				System.out.println("현재 실행중인 쓰레드의 이름 : "
					+ Thread.currentThread().getName()+" "+i++);
				if(i==20) break;
				}catch(InterruptedException e){
					e.printStackTrace();
			}
		}//while
		
	}	
}
class CCThread implements Runnable{
	int i=0;	
	@Override
	public void run() {
		while(true){	
			try{
					Thread.sleep(1000);
				System.out.println("현재 실행중인 쓰레드의 이름 : "
					+ Thread.currentThread().getName()+" "+i++);
				if(i==20) break;
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}		
	}	
}
public class GGCCThreadTest2 {
	public static void main(String[] args) {		
		//CC, GG는 Runnable을 상속받아서 start()가 없다.
		CCThread cc = new CCThread();
		GGThread gg = new GGThread();
		
		Thread t1=  new Thread(cc);
		Thread t2 = new Thread(gg);
		
		t1.start();
		t2.start();
	}
}











package thread.synchronise4.test;
/*
 * MegaBox에서 좌석을 예매하는 상황
 * 좌석을 예매하는 User를 쓰레드로 간주한다
 * reserve() 라는 기능을 예매하는 기능으로 로직을 작성
 * 
 */
class MegaBoxUser implements Runnable{
		private boolean seat = false;
	
		@Override
	public void run() {
				try{
							reserve();
				}catch(InterruptedException e){
						e.printStackTrace();
	}
}//run
	 
		public synchronized void reserve() throws InterruptedException{
		  String threadName  = Thread.currentThread().getName();
		  System.out.println(threadName + " : 좌석 예매하러 왔어요..");
		  
		  if(seat == false){
			  Thread.sleep(2000);
			  System.out.println(threadName +": 좌석예매 성공!!");
			  seat = true;
		  }else{
			  System.out.println("예매가 이미 완료된 좌석입니다.");
		  }
	  }
}

public class MegaBoxProcessTest2 {
	public static void main(String[] args) {
		MegaBoxUser user = new MegaBoxUser();
		Thread t1 = new Thread(user, "승기");
		Thread t2 = new Thread(user, "윤아");

		t1.start();
		t2.start();
	}
}

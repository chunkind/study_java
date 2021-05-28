package thread.basic.test;

import java.awt.Toolkit;
/*
 * Step2 ::
 * 동시성을 보장받으면서 작업하기위해서 쓰레드를 하나더 정의한다.
 * (메인쓰레드 / 작업쓰레드)
 * 경고음을 울리면서 동시에 콘솔창 출력이 가능해진다.
 * BeepThread라는 작업쓰레드를 직접 구현하세여
 */
class BeepThread implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++){
			toolkit.beep();
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				
			}
		}//for			
	}//run	
}
public class BeepPrintTest4 {
	public static void main(String[] args) {		
		BeepThread beep = new BeepThread();
		Thread t = new Thread(beep);
		t.start(); //13라인으로 이동
		
		for(int i=1; i<=5; i++){
			System.out.println("띵");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				
			}
		}	
	}
}




















package thread.basic2.test;

import javax.swing.JOptionPane;
/*
 * step2 ::
 * 카운팅 작업은 작업대로 / 입력작업은 입력작업대로
 * 각각이 서로 다른 작업영역을 가져야 한다.. 쓰레드 하나 더 추가 
 * main쓰레드  - 팝업창에서 값을 입력받고 출력하는 작업
 * CountingThread - 카운팅 처리 
 */

class CountingThread extends Thread {
			
			public void run(){
				for(int i =10; i>0; i--){
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
}
					

public class InputThreadTest2 {
	public static void main(String[] args) {
		CountingThread ct = new CountingThread();
		ct.start();
		String input = JOptionPane.showInputDialog("아무 숫자나 입력하세요...");
		System.out.println("당신이 입력한 숫자는 ::" + input);
		
		for(int i =10; i>0; i--){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}

/*public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//catch
		}//for
	}*/
		
/*CountingThread ct = new CountingThread();
		ct.start();
		String input = JOptionPane.showInputDialog("아무 숫자나 입력하세요....");
		System.out.println("당신이 입력한 숫자는 ::" + input);
		
		// 카운팅 기능을 달자... (10~1까지 sleep())
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/




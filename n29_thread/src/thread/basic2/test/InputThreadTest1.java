package thread.basic2.test;

import javax.swing.JOptionPane;

/*
 * step 1 ::
 * 쓰레드 사용안함. 
 * 하나의 쓰레드(main)로 사용자의 값을 입력받고 / 입력받은 숫자를 화면에 출력 
 * 사용자가 값을 입력하기 전에는 화면에 값이 출력되지 않는다
 * 입력해야지만 값이 출력될수 있다
 * ::
 * 이런 작업은 동시성을 요구하지 않는다 
 */
public class InputThreadTest1 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 숫자나 입력하세요...");
		System.out.println("당신이 입력한 숫자 ::" + input);
		
		for(int i=10; i>0; i--){
			System.out.println(i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
/*	String 	input	= JOptionPane.showInputDialog("아무 숫자나 입력하세요....");
		System.out.println("당신이 입력한 숫자는 ::" + input);
		
		//카운팅 기능을 달자... (10~1까지 sleep())
		for(int i =10; i>0; i--){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}*/










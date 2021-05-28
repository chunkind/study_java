package thread.basic2.test;

import javax.swing.JOptionPane;
/*
 * step3 ::
 * 1~10까지의 카운팅이 완료되기 전에 팝업창에 값을 입력하도록 유도하는 로직
 * 만약에 카운팅이 끝났는데도 값을 입력하지 않으면 ...더이상 값이 입력되지 않도록
 * 팝업창을 닫아버린다. 
 * ::
 * 카운팅만 전담하는 쓰레드
 * 입력만 전담하는 쓰레드
 * 작업쓰레드를 start 시키는 일만 전담함는 main 쓰레드
 */
class Counting extends Thread{
	public void run(){
		for(int i=10; i>0; i--){
			//popup 창에 값이 입력되면 ... for문을 빠져 나온다.
			if(InputThreadTest3.inputCheck) break;
			try{
				Thread.sleep(1000);
				System.out.println(i);
			}catch(InterruptedException e){
				
			}			
		}//for
		System.out.println("10초가 경과됬거나 그전에 값을 입력하셨군여!!");
		System.exit(0);
	}
}
class InputPopup extends Thread{
public void run(){
	System.out.println("10초 동안 카운팅이 진행됩니다..그 안에 값을 입력...");
	
	String input=JOptionPane.showInputDialog("아무 숫자나 입력하세여...");
	System.out.println("당신이 입력한 숫자는 :: "+input);
	
	InputThreadTest3.inputCheck = true; //변경
	}
}
public class InputThreadTest3 {
	static boolean inputCheck=  false;
	public static void main(String[] args) {			
		Counting c = new Counting();
		InputPopup i = new InputPopup();
		c.start();
		i.start();
		
	}
}












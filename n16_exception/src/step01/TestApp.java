package step01;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 예외를 간단히 알아보는 예제.
 */
public class TestApp {
	public static void main(String[] args) {
		String [ ] str = {  
			"Hello Java",  //0 -- 배열값
			"No I Mean it",  //1 
			"Nice to meet you" //2 
		};
		// try, catch 사용 
		int i = 0;
		while(i<4){
			try{
				System.out.println(str[i]); //폭탄이 터짐 ... i가 3일때 
			}catch(ArrayIndexOutOfBoundsException e){
				//System.out.println("Nice Catch~~");
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}finally{
				
			}
			i++;
		}
	}
}

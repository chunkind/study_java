package step01;

/*
 * int 타입의 배열을 선언 + 생성 + 초기화까지 한꺼번에 하는 방법
 */
public class BasicIntArrayTest2 {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 안의 각각의 값 : : " + arr[i]);
		}
		System.out.println("arr 객체가 저장된 주소값 : : " + arr);
	}
}
package step01;

public class BasicIntArrayTest1 {
	public static void main(String[] args) {
		// 1. int 타입의 배열을 선언 + 생성 :: arr, size 3
		int[] arr = new int[3];
		System.out.println("reference value :: " + arr);
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " 번째 값 :: " + arr[i]);
		}
		// 2. 명시적 초기화
		System.out.println("Initialization......");
		arr[0] = 11;
		arr[1] = 22;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " 번째 값 :: " + arr[i]);
		}
	}
}
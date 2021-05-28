package step02;

/*
 * 어제한 예제에서 배열의 특징으로 한번 잡힌 사이즈 변경 불가능
 * 다른 배열에 저장된 값을 copy해 올수 있는 기능이 있다. 
 * System.arraycopy()을 이용하면 가능하다.  static하다 
 */
public class ArrayCopyTest3 {
	public static void main(String[] args) {
		int[] target = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 10
		int[] source = { 99, 88, 77, 66, 55, 44, 33, 22 };// 8
		// 서로 다른 반찬통
		/*
		 * arrarycopy()를 이용해서 출력결과가 1,2,3,4,5,66,55,44,33,22이 되도록..target
		 */

		System.arraycopy(source, 3, target, 5, 5);
		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i] + " \t ");
		}
	}
}

package step05;

/**
 * @Auth chunkind@naver.com
 * @Date 2021. 01. 22.
 *
 * class의 구성요소 :
 * Filed / Method 로만 구성
 *
 * 1. Person객체를 2개 생성.. p1, p2라는 이름으로
 * 2. 각 객체의 값으로 James, 54, / Gosling, 60 이라는 값을 할당
 * 3. method를 호출하여 콘솔창에 출력 되도록 로직을 작성
 *
 */
public class TestApp {
    public static void main(String[] args)	{
        System.out.println("--------------- Person의 정보들을 출력 -------------------");
        // 객체 생성
        Person p1 = new Person();
        Person p2 = new Person();

        // Field에 접근 값 할당
        p1.setPersonInfo("James", 54);
        p2.setPersonInfo("Gosling", 60);

        // Method 호출,, Worker가 동작 하도록 함.
        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());
    }
}
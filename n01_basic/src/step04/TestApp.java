package step04;

/**
 * @Auth chunkind@naver.com
 * @Date 2019. 10. 30.
 *
 * step3의 문제점 :
 * Person의 변수에 실질적인 값을 이미 할당함으로써
 * Test 클래스에 우리는 김준호의 정보만 출력 받을수 밖에 없었다.
 *
 * 해결책 :
 * Person 클래스의 변수는 그대로 두고
 * 여기에 실질적인 값을 할당하는 코드는 Test 클래스에서 하자.
 *
 * 아래와 같은 결과가 나오도록 코딩!
 * ----------------Person들의 정보 출력 -----------------
 *
 * 차태현	34	삼성동
 * 김준호	33	여의도
 *
 */
public class TestApp {
    public static void main(String[] args){
        System.out.println("----------------Person들의 정보 출력 -----------------\n");
        Person p = new Person();
        Person p1 = new Person();

        // 여기서 값을 할당 하자.
        p.name = "차태현";
        p.age = 34;
        p.address = "삼성동";
        p.getDetails();

        p1.name = "김준호";
        p1.age = 33;
        p1.address = "여의도";
        p1.getDetails();
    }
}
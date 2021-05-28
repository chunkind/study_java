package step03;

/**
 * @Auth chunkind@naver.com
 * @Date 2019. 10. 30.
 *
 * Person : 사람에 대한 정보를 담고 있는 클래스 로서
 * 특정인의 나이와 주소, 이름을 저장하고
 * 그 사람의 정보를 콘솔로 출력하는 기능을 가지고 있다.
 *
 * 하지만 값을 클래스에서 직접 정의하고 있기 때문에
 * 문제가된다.(모든 객체가 같은 값을 가짐)
 */
public class TestApp {
    public static void main(String[] args){
        // Person 클래스의 기능을 여기서 불러다 쓸 것이다.
        Person p = new Person();
        System.out.println("======= Person의 정보를 출력합니다. =======");
        System.out.println(" ");
        p.getDetails();	//	; = 문장의 종료, calling(호출)
    }
}
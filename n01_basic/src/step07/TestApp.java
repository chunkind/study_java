package step07;

/**
 * @Auth chunkind@naver.com
 * @Date 2021. 01. 22.
 *
 * 	WhiteBoard와 Education의 Hasing 관계를 설정.
 * 	1. 필드에 선언 : Education
 * 	2. WhiteBoard에 setXxxxx()를 만들어서 실제로 Education을 주입시켜야 한다.
 * 	----> 이럴때만 Hasing 관계가 성립.
 * 	----> Hasing 관계가 성립되면 WhiteBoard가 Education의 모든 구성요소
 * 		  들을 사용할 수 있다.(값 할당 / 호출)
 */
public class TestApp {
    public static void main(String[] args){
        // 1.WhiteBoard의 정보를 전부다 출력
        WhiteBoard wb = new WhiteBoard();
        wb.setInfo(10000.0, 250, 'w');
        wb.getInfo();

        //2. 7강의장에서 위의 Board를 사용하는 강사는
        //"홍길동 강사 입니다." 를 출력
        //이때 WhiteBoard 클래스에서 Education 클래스와
        //Has a Relation 관계가 되도록 코드를 추가 하세요.
        Education ke = new Education();
        ke.setInfo(7, "홍길동", "JAVA");
        System.out.println(ke.getInfo());

        wb.setEdu(new Education());	// 여기서 주입이 이뤄진다.
        Education kosta = wb.getEdu();
        kosta.setInfo(7, "홍길동", "자바");
        System.out.println(kosta.getclassNumber() + "강의장에서 위의 Board를 사용하는 강사는 " + kosta.getteacherName() + " 강사 입니다.");
    }
}
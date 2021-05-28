package step06;

/**
 * @Auth : chunkind@naver.com
 * @Date : 2021. 01. 21.
 * 변수란?
 * 오브잭트의 정보를 담는 곳
 *
 * 기본형
 * 8가지가 있다.
 *
 * 논리형
 * boolean(1byte) : true, false 값만을 갖는 논리형 변수
 *
 * 문자형
 * char(2byte) : 0~65535(2^16) 2바이트의 데이터를 표현
 *
 * 정수형
 * byte(1byte) : -128 ~ 127(-2^7 ~ 2^7-1)의 숫자 표현
 * short(2byte) : -32768 ~ 32767 (-2^15 ~ 2^15 -1)
 * int(4byte) : 약 -21억 ~ 21억 (-2^31 ~ 2^31 -1)
 * long(8byte) : 약 -920경 ~ 920경(-2^31 ~ 2^31 -1)
 *
 * 실수형
 * float(4byte) : 1.4E-45 ~ 3.4E38
 * double(8byte) : 4.9E-324 ~ 1.8E308
 *
 * 참조형
 * 기본형을 제외한 모든 타입의 변수
 */
public class WhiteBoardTest{
	public static void main(String[] args){
		WhiteBoard wb = new WhiteBoard();
		wb.setDetails("서울대", 'W', true);
		System.out.println(wb.getDetails());

		Education ke = new Education();
		ke.setRoomNumber("7 강의실");
		System.out.println(ke.getRoomNumber());
		ke.setRoomNumber("해당 화이트 보드는 '7 강의실'에 있습니다");
		String roomNum = ke.getRoomNumber();

		System.out.println("\n위에서 출력된 WhiteBoard는 " + roomNum + " 에 있는 WhiteBoard는 입니다.");

		//ke 변수에 빈 객체를 초기화.
		ke = new Education();
		wb.setEdu(new Education());// 이 시점에서 WhiteBoard 와 Education이 관계성을 갖는다.

		ke = wb.getEdu();

		ke.setRoomNumber("7강의장");
		System.out.println("당신이 출력한 WhiteBoard는" + ke.getRoomNumber() + " 에 있는 Board입니다,");
	}
}

class WhiteBoard{
	String company;
	double price;
	char color;
	boolean scratch;
	int size;  
	String material;
	Education edu;

	public String wirte(){
		return "잘써진다";
	}
	public String eraze(){
		return "잘 안지워진다";
	}
	public void setEdu(Education ko){
		edu = ko;
	}
	public Education getEdu(){
		return edu;
	}
	public void setDetails(String com, char co, boolean sc){
		company = com;
		color = co;
		scratch = sc;
	}
	public String getDetails(){
		return company + "\t" + price + "\t" + color + "\t" + scratch + "\t" + size +
				"\t" + material;
	}
}

class Education{
	String roomNumber;
	
	public void setRoomNumber(String number){
		roomNumber = number;
	}
	public String getRoomNumber(){
		return roomNumber;
	}
}


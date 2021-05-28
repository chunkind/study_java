package step01;


public class AbstractPlayerTest {
	public static void main(String[] args) {
		// TV tv = new TV("TV"); //abstract class는 객체 생성의 대상이 안된다
		TV caption = new CaptionTV();
		TV plate = new PlateTV();
		System.out.println(caption.concreteTv());
		System.out.println(plate.concreteTv());
	}
}

/////////////////////   parents class  /////////////////////
class Player {
	int volumn;
	String maker;
	public void play() {
		System.out.println("가동시키다...");
	}
	public void stop() {
		System.out.println("멈추다....");
	}
}

abstract class TV extends Player {
	TV(String maker) {
		this.maker = maker;
	}
	public abstract String concreteTv();
}

/////////////////////   child class  /////////////////////
class CaptionTV extends TV {
	CaptionTV() {
		super("CaptionTV");
	}
	public String concreteTv() {
		return "CaptionTV concrete..";
	}
}
class PlateTV extends TV {
	PlateTV() {
		super("PlateTV");
	}
	public String concreteTv() {
		return "PlateTV concrete..";
	}
}
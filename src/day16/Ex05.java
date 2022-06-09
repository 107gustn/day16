package day16;

class Parents {
	public void familyName() {
		System.out.println("이");
	}
	public void name() {
		familyName();
		System.out.println(" 순신");
	}
}
class Daughter extends Parents {
	public void name() {
		familyName();
		System.out.println(" 국주");
	}
}
class Son extends Parents {
	public void name() {
		familyName();
		System.out.println(" 기광");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		//업캐스팅 - 부모형태로 받아서 처리, 변수를 하나만 받아서 처리가 가능하다.
		Parents p = new Parents();
		p.name();
		p = new Daughter();
		p.name();
		p = new Son();
		p.name();

	}

}

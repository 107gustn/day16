package day16;

/*
Overriding
- 상속받은 자식에서 부모의 메소드와 동일하게 만드는 것
- 부모의 메소드가 실행되는게 아니라 자식의 메소드가 실행되는 것
- 조건
   - 부모 메소드와 형식(public)이 같아야 한다.
(private < protect < public)
*/
class Ferrai{
	private int ye; //인스턴스 변수
	public Ferrai(int ye) { this.ye = ye; } //입력값이 들어가서 저장
	public int getYe() { return ye; }
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 300km");
	}
}
class NewFerrai extends Ferrai{ //기존의 기능 사용
	public NewFerrai(int y) { super(y); } //부모에 있는 생성자로 값을 넘겨줌
	public void autoSystem() { //새로운 기능 추가
		System.out.println("자동 운전 모드 시작합니다.");
	}
	public void speed() { //부모와 자식에 동일한 메소드가 있다면 overriding을 통해 자신의 메소드가 실행된다.
		System.out.println(super.getYe() + "년식 페라리 400km");
	}
} //자기자신에게 기능이 없으면 부모를 찾아감
public class Ex01 {
	public static void main(String[] args) {
		NewFerrai f = new NewFerrai(2023); //객체 생성후 생성자 호출
		f.speed(); //메소드 실행 //자기 자신을 우선적으로 찾아감
		f.autoSystem();
		
	}
}

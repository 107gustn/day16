package day16;

interface 공방{ //이름 단일화 가능
	public void attack();
	public void defence();
}
class AA지상군 implements 공방{
	public void 총알장전() { System.out.println("총알장전"); }
	public void 전진앞으로() { System.out.println(); }
	public void attack() {
		총알장전();
		System.out.println("공격 개시~");
	}
	public void defence() {	
		System.out.println("지상군 방어합니다.");
	}
}
class BB공군 implements 공방{
	public void attack() {
		System.out.println("공군이 공격 합니다.");
	}
	public void defence() {
		System.out.println("공군 방어합니다.");
	}
}
class AB{
	public void printAttack(공방 aa) { //동일한 부모를 통해 처리
		aa.attack();
	}
	public void defence() {
		System.out.println("공군 방어합니다.");
	}
}
public class Ex08 {
	public static void main(String[] args) {
//		공방 a = new AA지상군(); //부모형태로 업캐스팅하면 부모 메소드만 보임
//		a.attack();
		
		AB ab = new AB();
		AA지상군 aa = new AA지상군();
		ab.printAttack( aa );
		
		ab.printAttack( new BB공군() );
	}
}

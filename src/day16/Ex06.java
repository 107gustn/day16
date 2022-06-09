package day16;

class AAAA{
	public void aaa() {}
}
class Ex06Class extends AAAA implements Test { //인터페이스 상속
	@Override //인터페이스가 가지고있는 메소드를 무조건 override 해주어야 한다.
	public void test() {
		System.out.println("test");
	}
	
}
/*
인터페이스 
- 이름 단일화
- 기능 교체 유용함
*/
public class Ex06 {
	public static void main(String[] args) {
		Ex06Class e = new Ex06Class();
		e.test();
	}
	
}

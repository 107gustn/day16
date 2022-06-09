package day16;

import java.util.ArrayList;

class A1 {
	public void print() {
		System.out.println("A클래스");
	}
}
class B1 extends A1{
	public void print() { //오버라이딩
		System.out.println("B클래스");
	}
	public void bbb() {}
}
class C1 extends A1{
	public void print() {
		System.out.println("C클래스");
	}
	public void add(Object a) {
		double d = (double)a; //다운캐스팅
		System.out.println(a);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		/*A1 a; //A형태 객체 생성
		B1 b;
		C1 c;
		a = new A1(); a.print();
		b = new B1(); b.print();
		c = new C1(); c.print();
		*/
		A1 a; //상속한 부모형태의 변수로 처리가 가능. - 부모가 가지고있는 메소드만 호출 가능
		a = new B1(); a.print(); //업캐스팅(캐스팅 = 형변환): 부모 형태로 형 변환
		a = new C1(); a.print();
		
		B1 b = (B1)a; //다운캐스팅: 부모형태 값을 자식형태로 형변환
		
		ArrayList arr = new ArrayList();
		
		Object i = b; //모든값의 최상위 부모는 Object 타입이다. //업캐스팅
		arr.add("aaa");
		
		C1 cc = new C1();
		cc.add(1111.11);
	}

}

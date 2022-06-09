package day16;

import java.util.ArrayList;

final class A { //final이라는 키워드를 클레스앞에 넣으면 상속이 불가능하다. = Overriding 불가능.
	public void aaa() {
		System.out.println("A클래스");
	}
}
class B extends ArrayList{
	A a = new A(); //클래스를 상속을 받아서 사용할 수 없으면 객체를 생성해서 사용
	public void bbb() {
		String s;
		a.aaa();
		System.out.println("B클래스");
	}
}

class AA{
	public void aa() {
		
	}
}
class BB extends AA{
	public void bb() {}
}
public class Ex02 {
	public static void main(String[] args) {
		BB bb = new BB();
		
		B b = new B(); b.bbb();
		
		b.add("aaaa"); //부모가 가진 기능 사용 가능
		System.out.println( b.get(0) );
	}
}

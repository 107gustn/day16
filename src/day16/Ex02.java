package day16;

import java.util.ArrayList;

final class A { //final�̶�� Ű���带 Ŭ�����տ� ������ ����� �Ұ����ϴ�. = Overriding �Ұ���.
	public void aaa() {
		System.out.println("AŬ����");
	}
}
class B extends ArrayList{
	A a = new A(); //Ŭ������ ����� �޾Ƽ� ����� �� ������ ��ü�� �����ؼ� ���
	public void bbb() {
		String s;
		a.aaa();
		System.out.println("BŬ����");
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
		
		b.add("aaaa"); //�θ� ���� ��� ��� ����
		System.out.println( b.get(0) );
	}
}

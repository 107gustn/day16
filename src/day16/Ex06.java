package day16;

class AAAA{
	public void aaa() {}
}
class Ex06Class extends AAAA implements Test { //�������̽� ���
	@Override //�������̽��� �������ִ� �޼ҵ带 ������ override ���־�� �Ѵ�.
	public void test() {
		System.out.println("test");
	}
	
}
/*
�������̽� 
- �̸� ����ȭ
- ��� ��ü ������
*/
public class Ex06 {
	public static void main(String[] args) {
		Ex06Class e = new Ex06Class();
		e.test();
	}
	
}

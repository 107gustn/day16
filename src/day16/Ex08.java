package day16;

interface ����{ //�̸� ����ȭ ����
	public void attack();
	public void defence();
}
class AA���� implements ����{
	public void �Ѿ�����() { System.out.println("�Ѿ�����"); }
	public void ����������() { System.out.println(); }
	public void attack() {
		�Ѿ�����();
		System.out.println("���� ����~");
	}
	public void defence() {	
		System.out.println("���� ����մϴ�.");
	}
}
class BB���� implements ����{
	public void attack() {
		System.out.println("������ ���� �մϴ�.");
	}
	public void defence() {
		System.out.println("���� ����մϴ�.");
	}
}
class AB{
	public void printAttack(���� aa) { //������ �θ� ���� ó��
		aa.attack();
	}
	public void defence() {
		System.out.println("���� ����մϴ�.");
	}
}
public class Ex08 {
	public static void main(String[] args) {
//		���� a = new AA����(); //�θ����·� ��ĳ�����ϸ� �θ� �޼ҵ常 ����
//		a.attack();
		
		AB ab = new AB();
		AA���� aa = new AA����();
		ab.printAttack( aa );
		
		ab.printAttack( new BB����() );
	}
}

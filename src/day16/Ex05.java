package day16;

class Parents {
	public void familyName() {
		System.out.println("��");
	}
	public void name() {
		familyName();
		System.out.println(" ����");
	}
}
class Daughter extends Parents {
	public void name() {
		familyName();
		System.out.println(" ����");
	}
}
class Son extends Parents {
	public void name() {
		familyName();
		System.out.println(" �Ɽ");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		//��ĳ���� - �θ����·� �޾Ƽ� ó��, ������ �ϳ��� �޾Ƽ� ó���� �����ϴ�.
		Parents p = new Parents();
		p.name();
		p = new Daughter();
		p.name();
		p = new Son();
		p.name();

	}

}
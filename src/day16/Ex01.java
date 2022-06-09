package day16;

/*
Overriding
- ��ӹ��� �ڽĿ��� �θ��� �޼ҵ�� �����ϰ� ����� ��
- �θ��� �޼ҵ尡 ����Ǵ°� �ƴ϶� �ڽ��� �޼ҵ尡 ����Ǵ� ��
- ����
   - �θ� �޼ҵ�� ����(public)�� ���ƾ� �Ѵ�.
(private < protect < public)
*/
class Ferrai{
	private int ye; //�ν��Ͻ� ����
	public Ferrai(int ye) { this.ye = ye; } //�Է°��� ���� ����
	public int getYe() { return ye; }
	public void speed() {
		System.out.println(ye + "��� ��� �ӵ� 300km");
	}
}
class NewFerrai extends Ferrai{ //������ ��� ���
	public NewFerrai(int y) { super(y); } //�θ� �ִ� �����ڷ� ���� �Ѱ���
	public void autoSystem() { //���ο� ��� �߰�
		System.out.println("�ڵ� ���� ��� �����մϴ�.");
	}
	public void speed() { //�θ�� �ڽĿ� ������ �޼ҵ尡 �ִٸ� overriding�� ���� �ڽ��� �޼ҵ尡 ����ȴ�.
		System.out.println(super.getYe() + "��� ��� 400km");
	}
} //�ڱ��ڽſ��� ����� ������ �θ� ã�ư�
public class Ex01 {
	public static void main(String[] args) {
		NewFerrai f = new NewFerrai(2023); //��ü ������ ������ ȣ��
		f.speed(); //�޼ҵ� ���� //�ڱ� �ڽ��� �켱������ ã�ư�
		f.autoSystem();
		
	}
}

package day16;

import java.util.Scanner;
interface Test01{
	public static final String NAME="ȫ�浿"; //static final�� �빮�ڷ� �������� �����ش�.
	public String N = "aaa"; //�������̽� ������ static final ���� ����
}
public class Ex10 {
	public static void main(String[] args) {
		System.out.println( Test01.NAME);
		//AA���� ���� = new AA����();
		//BB���� ���� = new BB����();
		���� u; //��ĳ����
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice = 0, num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num == 1) {
			u = new AA����();
			System.out.println("���� ���� �ϼ̽��ϴ�");
		}else {
			u = new BB����(); 
			System.out.println("���� ���� �ϼ̽��ϴ�");
		}
		System.out.println("1.���� 2.���");
		choice = sc.nextInt();
		if(choice == 1) u.attack();
		else if(choice == 2) u.defence();
		
	
	}

}

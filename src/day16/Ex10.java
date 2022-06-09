package day16;

import java.util.Scanner;
interface Test01{
	public static final String NAME="홍길동"; //static final은 대문자로 변수명을 지어준다.
	public String N = "aaa"; //인터페이스 변수는 static final 생략 가능
}
public class Ex10 {
	public static void main(String[] args) {
		System.out.println( Test01.NAME);
		//AA지상군 지상군 = new AA지상군();
		//BB공군 공군 = new BB공군();
		공방 u; //업캐스팅
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice = 0, num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num == 1) {
			u = new AA지상군();
			System.out.println("지상군 선택 하셨습니다");
		}else {
			u = new BB공군(); 
			System.out.println("공군 선택 하셨습니다");
		}
		System.out.println("1.공격 2.방어");
		choice = sc.nextInt();
		if(choice == 1) u.attack();
		else if(choice == 2) u.defence();
		
	
	}

}

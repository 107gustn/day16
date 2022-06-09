package day16;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		AA지상군 지상군 = new AA지상군();
		BB공군 공군 = new BB공군();
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice = 0, num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num == 1) {
			System.out.println("지상군 선택 하셨습니다");
		}else {
			System.out.println("공군 선택 하셨습니다");
		}
		System.out.println("1.공격 2.방어");
		choice = sc.nextInt();
		if(choice == 1 && num == 1) 지상군.attack();
		else if(choice == 2 && num == 1) 지상군.defence();
		else if(choice == 1 && num == 2) 공군.attack();
		else if(choice == 2 && num == 2) 공군.defence();
		
	
	}

}

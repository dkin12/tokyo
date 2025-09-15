package ch2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("짝수가 나올때 까지 반복합니다.");
		while(true) {
			System.out.print("수를 입력하세요. : ");
			int num = scanner.nextInt();
			if(num % 2 == 0) {
				System.out.println(num);
				System.out.println("종료");
				return;
			}
		}
		
		
		
	}

}

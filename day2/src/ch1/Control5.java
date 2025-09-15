package ch1;

import java.util.Scanner;

public class Control5 {

	public static void main(String[] args) {
		// 1~10까지의 정수 중 하나를 입력받아 홀/짝수 출력
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1~10까지의 정수를 입력하세요 : ");
			int value = scanner.nextInt();
			if(value >= 1 && value <= 10) {
				if(value % 2 == 0) {
					System.out.println("짝수");
					break;
				}else {
					System.out.println("홀수");
					break;
				}
			}else {
				System.out.println("정확한 숫자를 입력하세요. ");
			}
		}while(true);
		
		scanner.close();
		
		

	}

}

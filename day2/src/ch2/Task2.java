package ch2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// 1. 치킨 주문 알림기
		System.out.print("주문할 치킨 수를 입력하세요. : ");
		var num1 = scanner.nextInt();
		for(int i = 0; i<num1; i++) {
			System.out.println("치킨 "+(i+1)+"마리 주문이요.");
		}
		
		// 2. 스쿼트 계산기
		System.out.print("스쿼트 몇 번 할까요? : ");
		var num2 = scanner.nextInt();
		
		for(int i = 0; i < num2; i++) {
			System.out.println("스쿼트 "+ (i+1)+ "회 완료");
		}
		// 3. 입력받은 수의 짝수만 출력하는 계산기
		System.out.print("짝수판별기 : ");
		var num3 = scanner.nextInt();
		if(num3 % 2 == 0) {
			System.out.println(num3 +"는 짝수입니다.");
		}
		// 4. 두 수를 입력 받아 그 사이 숫자 모두 출력
		System.out.print("첫번째 숫자를 입력하세요. : ");
		var num4_1 = scanner.nextInt(); 
		System.out.print("두번째 숫자를 입력하세요. : ");
		var num4_2 = scanner.nextInt();
		var num4_temp = num4_1;
		if(num4_temp < num4_2) {
			num4_temp = num4_2;
		}
		for( int i = num4_1 ; i<=num4_2;i++) {
			System.out.println("숫자 : " + i);
		}
		// 5. 구구단 3단 출력
		System.out.println("구구단 3단 출력 ");
		for( int i = 1; i < 10; i++) {
			System.out.println("3 x " + i + " = " + i*3);
		}
		
		// 6. 입력한 수를 구구단으로 만들기 
		System.out.print("검색할 구구단 수를 입력하세요. : ");
		var num6 = scanner.nextInt();
		for( int i = 0; i < 10 ; i++) {
			System.out.println(num6 + " x " + i + " = " + i*num6);
		}
		
		// 7. 숫자를 입력하면, 3의 배수일 때만 "점프 출력" 아니면 패스
		System.out.print("숫자를 입력하세요. : ");
		var num7 = scanner.nextInt();
		if(num7 % 3 == 0) {
			System.out.println("점프!");
		}else {
			System.out.println("패스");
		}
		
		// 8. 정수를 입력받아, n x n 네모 정사각형 별 출력
		System.out.print("만들 별 크기를 입력하세요. (정사각형) : ");
		var num8 = scanner.nextInt();
		for(int i = 0; i < num8 ; i++) {
			for( int j = 0 ; j<num8;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 9. 피자 조각 개수와 사람 수를 입력받아, 한 사람당 몇 조각을 먹을 수 있는지, 남는 조각은 몇 개인지를 출력
		System.out.print("피자 조각 개수 : ");
		var num9_1 = scanner.nextInt();
		System.out.println("사람 수 : ");
		var num9_2 = scanner.nextInt();
		System.out.println("한 사람당 피자 조각 : " + num9_1/num9_2 + " 남는 조각 : " + num9_1 % num9_2 );
		
		// 10. 주사위를 두 번 던졌을 때, 각각의 결과를 출력하고, 두 숫자의 합을 출력
		var num10_1 = random.nextInt(6);
		var num10_2 = random.nextInt(6);
		System.out.println("첫 번째 주사위 : " + num10_1 + " 두번째 주사위" + num10_2 + " 두 수의 합 : " + num10_1 + num10_2);
	
		// 11. 1~10중 랜덤 숫자를 하나 만들고, 사용자가 숫자를 입력해서 맞출때 까지 UP 또는 Down을 출력
		var num11 = random.nextInt(50);
		do {
			System.out.print("1~50까지의 숫자를 입력하세요 : ");
			var input11 = scanner.nextInt();
			if(input11 == num11) {
				System.out.println("정답입니다.");
				break;
			}else if(input11 < num11) {
				System.out.println("UP");
			}else if(input11>num11) {
				System.out.println("DOWN");
			}
		}while(true);
		
	}

}

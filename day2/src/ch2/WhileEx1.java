package ch2;

import java.util.Scanner;

/*
 * while(조건){
 * 	실행문;
 *  증감값;
 * }
 * 
 * */


public class WhileEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1~5까지 출력
		int i = 1;
		while(i<=5) {
			System.out.println(i++);
		}
		int j = 0;
		while(j<3) {
			j++;
			System.out.println("빠잉");
		}
		// 10 감소
		int k = 10;
		while(k>0) {
			System.out.println(k--);
		}
		int t = 1;
		while(t<=10) {
			if(t%2==0) {
				System.out.println(t);
			}
			t++;
		}
		
		// 두수를 입력 받아 합계 출력
		var a = scanner.nextInt();
		var b = scanner.nextInt();
		int num1, num2, sum;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		// 한번만 실행
		int count = 0;
		while(count < 1 ) {
			sum = num1 + num2;
			count ++; // 증가되면 다음은 반복하지 않음
		}
	}

}

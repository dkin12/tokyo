package ch2;

import java.util.Scanner;

public class ForEx1 {
/*
 * for 반복문
 * 정해진 조건 만큼 반복
 * 
 * for(초기값; 조건식; 증감값){
 * 실행문;
 * }
 * 
 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1 ~ 5 까지 출력
		// i++ : 후위증가 연산자
		// i-- : 후위감소 연산자
		// --i : 전위감소 연산자 
		// ++i : 전위증가 연산자 
		for( int i = 1; i<=5 ; i++) {
			System.out.println(i);
			System.out.println(++i);
			System.out.println(i++);
			System.out.println(i);
			System.out.println("-----");
		}
		System.out.println("=====");
		for( int i = 0; i<3 ; i++) {
			System.out.println(i+1 + "번째 안녕");
		}
		System.out.println("=====");
		for( int i = 10; i>0 ;i--) {
			System.out.println(i + "번째 안녕");		
		}
		
		System.out.println("=====");
		// 1~10까지 중 홀수만 출력 1
		// a += 2 : a + 2 = a 
		// a -= 2 : a - 2 = a 
		// a *= 2 : a * 2 = a
		// a /= 2 : a / 2 = a 
		
		for(int i = 1 ; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("=====");
		// 1~10까지 중 홀수만 출력 2
		for(int i = 1; i< 10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("=====");
		// 1~5까지의 합
		int sum = 0 ;
		for( int i = 1 ; i <= 5; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("=====");
		System.out.println("정수를 입력받아 그 수만큼 숫자 출력");
		// 정수를 입력받아 그 수만큼 숫자 출력
		int num249 = scanner.nextInt();
		for( int i = 1; i<= num249; i++) {
			System.out.println(i);
		}
		
		System.out.println("====="); 
		// 배열 Array : 여러개의 값을 한번에 저장한 변수
		// 한번 크기를 정하면 변경할 수 없고, 같은 자료형만 저장가능
		
		// 자료형 [ ] 배열명 = {} ; 
		// 자료형 [ ] 배열명 = new 자료형 [크기];
		// 불러오는 방식 배열명[인덱스 번호]
		// 인덱스 번호 0 ~ 
		// .length : 배열이나 문자열의 길이, 크기, 갯수를 알려주는 속성
		
		int [] nums = {3,5,7,9};
		for(int i = 0 ; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	

}

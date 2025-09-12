package ch1;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		System.out.println("2025.09.11");
		
		// 1. 비밀번호 맞추기
		String password = "qwer1234";
		String inputPassword = "qwer1234";
		if(password.equals(inputPassword)) {
			System.out.println("비밀번호가 맞아요!");
		}else {
			System.out.println("비밀번호가 틀렸어요!");
		}
		// 2. 1번 문제를 사용자 입력으로 
		Scanner scanner = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요 : ");
		inputPassword = scanner.nextLine();
		if(password.equals(inputPassword)) {
			System.out.println("비밀번호가 맞아요!");
		}else {
			System.out.println("비밀번호가 틀렸어요!");
		}
		
		// 3.좋아하는 동물 찾기
		String animal = "강아지";
		if(animal.equals("강아지")) {
			System.out.println("멍멍");
		}else if(animal.equals("고양이")) {
			System.out.println("야옹!");
		}else {
			System.out.println("무슨 동물이야?");
		}
		
		// 4. 2번문제를 사용자 입력으로 만들기
		System.out.print("강아지 or 고양이를 입력하세요. : ");
		String inputAnimal = scanner.nextLine();
		if(inputAnimal.equals("강아지")) {
			System.out.println("멍멍");
		}else if(inputAnimal.equals("고양이")) {
			System.out.println("야옹!");
		}else {
			System.out.println("무슨 동물이야?");
		}
		
		// 5. 주말 맞추기 
		int day = 6;
		String result = "";
		if(day == 6 || day == 0) {
			result = "주말이야!";
		}else { result = "평일이야!"; }
		System.out.println(result);
		
		// 6. 5번문제를 사용자 입력으로 만들기
		System.out.print("월(1), 화(2), 수(3), 목(4), 금(5), 토(6), 일(7) : ");
		day = scanner.nextInt();
		if(day == 6 || day == 0) {
			result = "주말이야!";
		}else { result = "평일이야!"; }
		System.out.println(result);
		
		// 7. 나이 검사기
		System.out.print("나이를 입력하세요. : ");
		int age = scanner.nextInt();
		if(age >= 19 ) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년입니다.");
		}
		
		// 8. 카페인 섭취에 따른 내 상태
		System.out.print("오늘 마신 커피 수를 입력하세요. : ");
		int coffee = 0;
		String status = "";
		if(coffee == 0) {
			status = "여긴 어디? 😵";
		}else if(coffee >= 1 && coffee < 3) {
			status = "완전 맑은 정신~ 🍀";
		}else {
			status = "기분 좋은 상태! 😄";
		}
		System.out.println(status);
		
		// 9. 숫자 입력받아 짝수/홀수 출력
		System.out.print("숫자를 입력하세요. : ");
		int inputValue = scanner.nextInt();
		if(inputValue % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
	}

}

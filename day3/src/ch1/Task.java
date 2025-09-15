package ch1;

import java.util.Random;

public class Task {
	
	
	
	public static void main(String[] args) {
		// 1. 치킨 한 마리에 8조각
		System.out.println(test(60));
	}
	
	// 1. 치킨 한 마리에 8조각
	public static int chicken(int num1) {
		return num1 * 8;
	}
	// 2. 커피 한잔에 80mg
	public static int coffee(int num1) {
		return num1*80;
	}
	// 3. 삼각김밥 한개 칼로리
	public static int calo(int num1) {
		return 200*num1;
	}
	// 4. 이름 2개 받기
	public static int love(String A, String B) {
		Random rd = new Random();
		return rd.nextInt(200);
	}
	// 5. 아무것도 안받고 출력하면서 랜덤으로 추천 
	public static String eat() {
		int one = 1;
		int two = 2;
		int three = 3;
		int four = 4;
		Random rd = new Random();	
		int choose = rd.nextInt(4);
		String menu = "";
		switch(choose) {
			case 1 : menu = "라면"; break;
			case 2 : menu = "김밥"; break;
			case 3 : menu = "파스타"; break;
			case 4 : menu = "샐러드"; break;
		}
		return "오늘의 추천 메뉴는 " + menu;
	
	}
	// 6. 점수입력
	public static char test(int score) {
		char grade = 'F';
		switch(score/10) {
			
		case 10: case 9 :
			grade = 'A';
			break;
		case 8: grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : break;
		}
		
		return grade;
		
	}
	// 7. 시급 일한 시간
	public static int pay(int money, int hour) {
		return money*hour;
	}

}



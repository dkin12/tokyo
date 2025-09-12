package ch1;

import java.util.Random;
import java.util.Scanner;

public class RandomEX1 {

	public static void main(String[] args) {
		// Random 랜덤 도구 객체 설정
		Random ran = new Random(); 
		Scanner scanner = new Scanner(System.in);
		// 2전까지의 값 중 랜덤 수
		int result = ran.nextInt(2);
		
		if(result == 0) {
			System.out.println("등교");
		}else {
			System.out.println("자체 휴강");
		}
		//	System.out.println("");
		
		
		

	}

}

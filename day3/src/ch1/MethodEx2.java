package ch1;

public class MethodEx2 {

	
	public static void main(String[] args) {
		
			System.out.println(cupRamen(3));
			System.out.println(pay(1000,11));

	}
	// 컵라면 칼로리 계산기 메서드 
	public static int cupRamen(int num1) {
		// 3개를 삿을 대 콘솔에 칼로리 게산 
		int kcal = 500;
		return num1 * kcal;
	}
	// 컵라면 계산 메서드 
	public static int pay(int money, int count) {
		return money * count;
	}

}

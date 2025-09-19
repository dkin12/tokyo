package task_FoodSystem;
import java.util.List;
import java.util.Scanner;

public class FoodController {
private FoodService service;
	
	Scanner sc = new Scanner(System.in);
	
	
	public FoodController(FoodService service) {
		super();
		this.service = service;
	}
	public void run() {
		boolean run = true ;
		while(run) {
			System.out.println("번호입력:1-회원입력, 2-회원출력, 0-프로그램 종료");
			int q = sc.nextInt(); // 숫자 뒤에 \n 
			sc.nextLine(); // 엔터값을 바로 읽어서 버림, 버퍼 정리 
			switch (q) {
			case 1:
				System.out.printf("식자재번호 : ");
				String number = sc.nextLine();
				System.out.printf("식자재명 : ");
				String name = sc.nextLine();
				System.out.printf("수량 : ");
				int count = sc.nextInt();
				System.out.printf("등록날짜 : ");
				String date = sc.nextLine();
				service.addFood(number,name,count,date);
				System.out.println("회원 등록");
				break;
			case 2:
				showFood();
				break;
			case 0 : 
				System.out.println("프로그램 종료");
				run = false;
				
				break;
			default:
				System.out.println("숫자만 입력하세요.");
				break;
			}
		}
		
	}
	void showFood() {
		List<FoodDTO> Food = service.getAllFood();
		for(FoodDTO dto : Food) { // member 리스트에서 순차적으로 꺼내 dto에 담아 출력 
			System.out.println(dto);
		}
	}
}

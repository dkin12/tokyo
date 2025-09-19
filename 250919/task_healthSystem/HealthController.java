package task_healthSystem;
import java.util.List;
import java.util.Scanner;

public class HealthController {
private HealthService service;
	
	Scanner sc = new Scanner(System.in);
	
	public HealthController(HealthService service) {
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
				System.out.printf("회원명 : ");
				String name = sc.nextLine();
				System.out.printf("회원번호 : ");
				String number = sc.nextLine();
				System.out.printf("기준칼로리 : ");
				int kcal = sc.nextInt();
				System.out.printf("소비칼로리 : ");
				int burnkcal = sc.nextInt();
				
				service.addHealth(name,number,kcal,burnkcal);
				System.out.println("회원 등록");
				break;
			case 2:
				showAnimal();
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
	void showAnimal() {
		List<HealthDTO> Health = service.getAllHealth();
		for(HealthDTO dto : Health) { // member 리스트에서 순차적으로 꺼내 dto에 담아 출력 
			System.out.println(dto);
		}
	}
}

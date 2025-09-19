package task_AnimalSystem;
import java.util.List;
import java.util.Scanner;

public class AnimalController {
private AnimalService service;
	
	Scanner sc = new Scanner(System.in);
	
	
	public AnimalController(AnimalService service) {
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
				System.out.printf("아이디 : ");
				String id = sc.nextLine();
				System.out.printf("보호자명 : ");
				String protector = sc.nextLine();
				System.out.printf("반려동물명 : ");
				String name = sc.nextLine();
				System.out.printf("나이 : ");
				int age = sc.nextInt();
				System.out.printf("연락처 : ");
				int number = sc.nextInt();
				service.addAnimal(id, protector, name, age, number);
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
		List<AnimalDTO> Animal = service.getAllAnimal();
		for(AnimalDTO dto : Animal) { // member 리스트에서 순차적으로 꺼내 dto에 담아 출력 
			System.out.println(dto);
		}
	}
}

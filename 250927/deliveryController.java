package task_250927;


import java.util.List;
import java.util.Scanner;

public class deliveryController {
	Scanner sc = new Scanner(System.in);
	private deliveryService service;
	
	public deliveryController(deliveryService service) {
		this.service = service;
	}
	
	public void run() {
		boolean isRun = true;
		
		while(isRun) {
			try {
				System.out.println("==0.프로그램 종료 1.품명입력 2. 전체조회 3.개별조회 4.삭제 5. 수정 6. 통계==");
				int input = sc.nextInt();
				sc.nextLine();
				switch(input) {
				case 0 : // 프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					isRun = false;
					break;
				case 1 : // 품명입력 자동증가 번호, 품명, 가격, 총 개수, 주문 가능 수 
					System.out.printf("품명 : " ); 
					String name = sc.nextLine();
					System.out.printf("가격 : " );
					int price = sc.nextInt();
					sc.nextLine();
					System.out.printf("총 개수 : " );
					int total = sc.nextInt();
					sc.nextLine();
					System.out.printf("주문 수 : " );
					int order = sc.nextInt();
					sc.nextLine();
					service.add(name,price,total,order);
					System.out.println("추가되었습니다." );
					break;
				case 2 :
					findAllItem();
					break;
				case 3:
					findOneItem();
					break;
				case 4 :
					System.out.println("서비스 준비중");
					break;
				case 5 : 
					System.out.println("서비스 준비중");
					break;
				case 6 : 
					System.out.println("서비스 준비중");
					break;
				}
			}catch (Exception e) {
				System.out.println("문제가 발생했습니다. 다시 시도해주세요.");
			}
			
		}
		
		
		
	}
	
	public void findAllItem() {
		List<deliveryDTO> devList = service.getAllProduct();
		if(devList.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
		}else {
			for(deliveryDTO dto : devList) {
				System.out.println(dto);
			}
		}
	}
	
	public void findOneItem() {
		System.out.printf("검색할 아이템 번호를 입력하세요 : ");
		int inputId = sc.nextInt();
		sc.nextLine();
		
		var check = service.getOneProduct(inputId);
		if(check != null) {
			System.out.println(check);
		}else {
			System.out.println("문제가 발생했습니다. 다시 시도해주세요.");
		}
	}
	
	
	
	
	
	
	
}

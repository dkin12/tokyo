package ch4;

import java.util.List;
import java.util.Scanner;

public class ItemController {
	Scanner sc = new Scanner(System.in);
	private ItemService service;
	
	public void run() {
		boolean isloop = true;
		while(isloop) {
			try {
				System.out.println("0.프로그램 종료 1. 아이템 입력  2. 아이템 전체 조회 3. 아이템 개별 조회 4. 아이템 삭제 5. 아이템 수정");
				int input = sc.nextInt();
				sc.nextLine();
				switch(input) {
				case 0 : 
					isloop = false;
					System.out.println("프로그램을 종료합니다.");
					break;
					
				case 1:
					addItem();
					break;
				
				case 2:
					findAllItem();
					break;
				
				case 3: // 개별 탐색 
					findOneItem();
					break;
				case 4: // 선택 삭제 
					break;
				case 5: // 선택 수정 
					break;
				
				}
			} catch (Exception e) {
				System.out.println("정확한 번호를 입력하세요.");
			}
		}
	}
	
	public void addItem() {
		System.out.printf("아이템 명 : ");
		String itemName = sc.nextLine();
		System.out.printf("아이템 수량 : ");
		int itemCount = sc.nextInt();
		sc.nextLine();
		System.out.printf("아이템 가격 : ");
		int itemPrice = sc.nextInt();
		sc.nextLine();
		service.addItem(itemName, itemCount, itemPrice);
		System.out.println("추가되었습니다.");
	}
	public void findAllItem() {
		List<ItemDTO> itemList = service.getAllItem();
		for(ItemDTO dto : itemList) {
			System.out.println(dto);
		}
	}
	
	// 개별 탐색 
	public void findOneItem() {
		System.out.printf("검색할 아이템 번호를 입력하세요 : ");
		int inputId = sc.nextInt();
		sc.nextLine();
		var check = service.getOneItem(inputId);
		if(check!=null) {
			System.out.println(check);
		}else {
			System.out.println("문제가 발생했습니다. 다시 시도해주세요.");
		}
		
	}
	
	public void deleteItem() {
		System.out.println("삭제할 아이템 번호를 입력하세요 : ");
		int inputId = sc.nextInt();
		sc.nextLine();
		service.deleteCheck(inputId);
	}
	
	public void updateItem() {
		System.out.println("수정할 아이템 번호를 입력하세요 : ");
		int inputId = sc.nextInt();
		sc.nextLine();
		ItemDTO dto = service.getOneItem(inputId);
		if(dto == null) {
			 System.out.printf("변경 아이템명 : (" + dto.getItName() + ") = ");
			 String newName = sc.nextLine();
			 System.out.printf("변경 수량 : (" + dto.getItCount() + ") = ");
			 int newQty = sc.nextInt();
			 sc.nextLine();
			 System.out.printf("변경 가격 : (" + dto.getItPrice() + ") = ");
			 int newPrice = sc.nextInt();
			 sc.nextLine();
			 
			 if(service.editItem(inputId,newName,newQty,newPrice)) { // true, false 
				 System.out.println("정보가 수정되었습니다.");
			 }else {
				 System.out.println("오류가 발생했습니다.! ");
				 
			 }
		}else {
			System.out.println("해당 번호가 없습니다.");
		}
		
	}
	
}

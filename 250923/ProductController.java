package ch3;

import java.util.List;
import java.util.Scanner;


public class ProductController {
	Scanner sc = new Scanner(System.in);	
	private ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	
	 public void run() {

	        boolean isloop = true;

	        while (isloop) {
	            try {
	                System.out.println(
	                    "0. 프로그램 종료 | 1. 상품 등록 | 2. 전체 상품 조회 | 3. 개별 상품 조회 | 4. 상품 삭제 | 5. 상품 정보 수정 | 6. 분석"
	                );
	                int input = sc.nextInt();
	                sc.nextLine(); // 버퍼에 남은 줄바꿈 문자를 제거합니다.


	                switch (input) {
	                    case 0:
	                        isloop = false;
	                        System.out.println("프로그램을 종료합니다.");
	                        break;
	                    case 1:
	                        System.out.printf("상품번호 : ");
	                        int id = sc.nextInt();
	                        sc.nextLine();
	                        System.out.printf("상품명 : ");
	                        String name = sc.nextLine();
	                        System.out.printf("수량 : ");
	                        int qty = sc.nextInt();
	                        sc.nextLine();
	                        System.out.printf("가격 : ");
	                        int price = sc.nextInt();
	                        sc.nextLine();
	                        int total = qty * price;
	                        service.addProduct(id, name, qty, price, total);
	                        break;
	                    case 2:
	                        List<ProductDTO> products = service.getAllProduct();
	                        if (products.isEmpty()) {
	                            System.out.println("데이터가 없습니다.");
	                        } else {
	                            for (ProductDTO dto : products) {
	                                System.out.println(dto);
	                            }
	                        }
	                        break;
	                    case 3:
	                        System.out.printf("찾을 상품번호 : ");
	                        id = sc.nextInt();
	                        sc.nextLine();
	                        if (service.getProduct(id) == null) {
	                            System.out.println("상품번호가 올바르지 않습니다. 다시 검색하세요.");
	                        } else {
	                            System.out.println(service.getProduct(id));
	                        }
	                        break;
	                    case 4:
	                        System.out.println("현재 서비스 준비중! ");
	                        break;
	                    case 5:
	                        System.out.println("현재 서비스 준비중! ");
	                        break;
	                    case 6:
	                        List<ProductDTO> products2 = service.getAllProduct();
	                        if (products2.isEmpty()) {
	                            System.out.println("저장된 제품 리스트가 없습니다.");
	                        } else {
	                            System.out.println("현재 총 제품 수는 " + service.getAllProductCount());
	                            System.out.println("현재 총 제품 가격은 " + service.getAllProductSum());
	                        }
	                        break;
	                    default:
	                        System.out.println("0~6 사이의 번호만 입력하세요.");
	                        break;
	                }
	            } catch (Exception e) {
	                System.out.println("숫자만 입력이 가능합니다. 다시 시도해 주세요.");
	                sc.nextLine(); // 잘못된 입력값을 버퍼에서 비워줍니다.
	            }
	        }
	 }
}

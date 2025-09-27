package task_250927;

import java.text.DecimalFormat;

/*
 * 1. 배달 주문 리스트 프로그램
    
    외부 csv 파일을 만들어 읽고 쓰기
    
    자동증가번호, 품명, 가격, 주문가능수, 현재재고(주문 후 남은 수량)
    
    품명입력, 전체조회, 개별조회, 삭제, 수정, 통계
*/

public class deliveryDTO {
	int delivery_auto_number; // 자동 증가 번호 
	String delivery_name; // 품명 
	int delivery_price; // 가격 
	int delivery_total; // 총 개수
	int delivery_order; // 주문 가능 수 
	int delivery_current; // 현재 재고

	public int getDelivery_auto_number() {
		return delivery_auto_number;
	}

	public void setDelivery_auto_number(int delivery_auto_number) {
		this.delivery_auto_number = delivery_auto_number;
	}


	public String getDelivery_name() {
		return delivery_name;
	}


	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}


	public int getDelivery_price() {
		return delivery_price;
	}


	public void setDelivery_price(int delivery_price) {
		this.delivery_price = delivery_price;
	}


	public int getDelivery_total() {
		return delivery_total;
	}


	public void setDelivery_total(int delivery_total) {
		this.delivery_total = delivery_total;
		setDelivery_current();
	}


	public int getDelivery_order() {
		return delivery_order;
	}


	public void setDelivery_order(int delivery_order) {
		this.delivery_order = delivery_order;
		setDelivery_current();
	}


	public int getDelivery_current() {
		return delivery_current;
	}


	public void setDelivery_current() {
		this.delivery_current = getDelivery_total()-getDelivery_order();
	}


	public deliveryDTO(int delivery_auto_number, String delivery_name, int delivery_price, int delivery_total,
			int delivery_order) {
		this.delivery_auto_number = delivery_auto_number;
		this.delivery_name = delivery_name;
		this.delivery_price = delivery_price;
		this.delivery_total = delivery_total;
		this.delivery_order = delivery_order;
		this.delivery_current = delivery_total-delivery_order;
	}


	DecimalFormat df = new DecimalFormat("#,###");
	@Override
	public String toString() {
		return String.format("번호:%s | 품명:%s | 가격:%s원 | 총 개수 : %s | 주문 수 : %s |주문 가능 수 %s",df.format(delivery_auto_number),delivery_name,df.format(delivery_price),df.format(delivery_total),df.format(delivery_order),df.format(delivery_current));
	}
	
}

package ch4;
/*
 * 요구사항 
 * 1. 아이템번호 ( 자동 증가 ) , 아이템명, 수량, 가격, 합계 
 * 2. 아이템 입력
 * 3. 아이템 전체 조회
 * 4. 아이템 개별 조회 
 * 5. 아이템 삭제 
 * 6. 아이템 수정 : 아이템 명, 수량, 가격 
 * 0. 프로그램 종료 
 */


public class ItemDTO {
	int itId;
	String itName;
	int itCount;
	int itPrice;
	int itTotalPrice; // count * price 
	
	
	public ItemDTO(int itId, String itName, int itCount, int itPrice) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.itCount = itCount;
		this.itPrice = itPrice;
	}


	public int getItId() {
		return itId;
	}


	public void setItId(int itId) {
		this.itId = itId;
	}


	public String getItName() {
		return itName;
	}


	public void setItName(String itName) {
		this.itName = itName;
	}


	public int getItCount() {
		return itCount;
	}


	public void setItCount(int itCount) {
		this.itCount = itCount;
		setItTotalPrice();
	}


	public int getItPrice() {
		return itPrice;
	}


	public void setItPrice(int itPrice) {
		this.itPrice = itPrice;
		setItTotalPrice();
	}


	public int getItTotalPrice() {
		return this.itCount * this.itPrice;
	}


	public void setItTotalPrice() {
		this.itTotalPrice = this.itCount * this.itPrice;
	}


	@Override
	public String toString() {
		return "ItemDTO [itId=" + itId + ", itName=" + itName + ", itCount=" + itCount + ", itPrice=" + itPrice
				+ ", itTotalPrice=" + itTotalPrice + "]";
	}
	
	

	
	
}

package ch4;

import java.util.List;

public class ItemService {
	private ItemDAO dao;
	
	
	int autoId = 0;
	
	public void addItem(String itemName, int itemCount, int itemPrice) {
		ItemDTO dto = new ItemDTO(autoId++,itemName,itemCount,itemPrice);
		dao.save(dto);
	}
	
	public List<ItemDTO> getAllItem() {
		return dao.findALL();
	}
	public ItemDTO getOneItem(int inputId) {
		
		return dao.findById(inputId);
	}
	public void deleteCheck(int inputId) {
		var check = dao.deleteById(inputId);
		if(check) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("문제가 발생했습니다. 다시 시도해주세요.");
		}
	}


	public boolean editItem(int inputId, String newName, int newQty, int newPrice) {
		if(dao.updateDAO(newPrice, newName, newPrice, newPrice)) {
			return true;
		}else {
			return false;
		}
		
	}
	
}

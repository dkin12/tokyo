package ch4;

import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
	
	List<ItemDTO> itemList = new ArrayList<>();

	public void save(ItemDTO dto) {
		itemList.add(dto);
	}
	public List<ItemDTO> findALL(){
		return itemList;
	}
	
	public ItemDTO findById(int itemId) {
		for(ItemDTO dto : itemList) {
			if(dto.getItId() == itemId) {
				return dto;
			}
		}
		
		return null;
	}
	
	
	public boolean updateDAO(int itemId, String itemName, int itemCount, int itemPrice){
		ItemDTO dto = findById(itemId);
		
		if(dto!=null) {
			dto.setItName(itemName);
			dto.setItCount(itemCount);
			dto.setItPrice(itemPrice);
			return true;
		}
		
		return false;
	}
	
	public boolean deleteById(int itemId) {
		for(int i = 0; i<itemList.size();i++) {
			if(itemList.get(i).getItId() == itemId) {
				itemList.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	
}

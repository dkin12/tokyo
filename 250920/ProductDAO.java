package ch3;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	List<ProductDTO> PTList = new ArrayList<>();
	
	public void save(ProductDTO dto) {
		PTList.add(dto);
	}
	public List<ProductDTO> findALL(){
		return PTList;
	}
	
	// 삭제 
	public boolean deleteById(int id) {
		/*		
		 for-each 조회용으로 자주 사용
		 리스트를 직접 삭제하기 때문에 리스트 내용이 갑자기 바뀜 
		 내부적으로 반복자와 리스트 크기가 달라져 오류 발생
		  
		for(ProductDTO dto : PTList) {
			if(dto.getId() == id) {
				PTList.remove(dto);
				return true;
			}else {
				return false;
			}
		}
		return false;
		
		*/
		
		// 삭제시 인덱스 기반 for 사용
		// 반복 인덱스를 직접 관리하기 때문에 리스트의 크기가 변해도 안
		for(int i = 0; i<PTList.size();i++) {
			if(PTList.get(i).getId()==id) {
				PTList.remove(i);
				return true;
			}
		}
		return false;
	}
}

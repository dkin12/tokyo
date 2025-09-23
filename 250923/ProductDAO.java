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
}

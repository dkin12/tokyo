package ch3;

import java.util.List;

public class ProductService {
	
	private ProductDAO dao ; 
	public ProductService(ProductDAO dao) {
		this.dao = dao;
	}
	
	public void addProduct(int id, String name, int qty, int price, int total)
	{
		ProductDTO dto = new ProductDTO(id,name,qty,price,total);
		
		dao.save(dto);
		
	}
	public List<ProductDTO> getAllProduct() {
		return dao.findALL();
	}
	
	public ProductDTO getProduct(int num) {
		List<ProductDTO> products = getAllProduct();
		for(ProductDTO dto : products) {
			if(dto.getId()==num) {
				return dto;
			}
		}
		return null;
	
	}
	public void deleteProduct() {
		
	}
	public void changeProduct() {
		
	}
	public int getAllProductCount() {
		List<ProductDTO> products = getAllProduct();
		int count = 0;
		for(ProductDTO dto : products) {
			count += dto.getQty();
		}
		return count;
	}
	public int getAllProductSum() {
		List<ProductDTO> products = getAllProduct();
		int total = 0;
		for(ProductDTO dto : products) {
			total += dto.getTotal();
		}
		return total;
	}

}

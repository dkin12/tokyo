package task_250927;

import java.util.List;


public class deliveryService {
	private deliveryDAO dao;
	private int autoId = 0;
	
	public deliveryService(deliveryDAO dao) {
		this.dao = dao;
		this.autoId = getId() + 1 ;
	}

	private int getId() {
		int max = 0;
		for(deliveryDTO dto : dao.findAll()) {
			if(dto.getDelivery_auto_number() > max) {
				max = dto.getDelivery_auto_number();
			}
		}
		return max;
	}
	
	public void add(String name, int price, int total, int order) {
		deliveryDTO dto = new deliveryDTO(autoId++, name, price, total, order);
		dao.save(dto);
	}
	
	public List<deliveryDTO> getAllProduct(){
		return dao.findAll();
	}
	
	public deliveryDTO getOneProduct(int inputId) {
		return dao.findById(inputId);
	}
	
	public deliveryDTO findById(int num) {
		List<deliveryDTO> devlierys = getAllProduct();
		for(deliveryDTO dto : devlierys) {
			if(dto.getDelivery_auto_number() == num) {
				return dto;
			}
		}
		return null;
		
	}
	
	
	
	
	

}

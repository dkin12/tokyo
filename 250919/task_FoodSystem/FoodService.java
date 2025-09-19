package task_FoodSystem;

import java.util.List;

public class FoodService {
	private FoodDAO dao;
	public FoodService(FoodDAO dao) {
		super();
		this.dao = dao;
	}
	public List<FoodDTO> getAllFood(){
		return dao.findAll();
	}
	public void addFood(String number, String name, int count, String date) {
		FoodDTO dto = new FoodDTO(number,name,count,date);
		dao.save(dto);
	}

}

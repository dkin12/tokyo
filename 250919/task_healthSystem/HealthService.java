package task_healthSystem;

import java.util.List;

public class HealthService {
	private HealthDAO dao;
	public HealthService(HealthDAO dao) {
		super();
		this.dao = dao;
	}
	public List<HealthDTO> getAllHealth(){
		return dao.findAll();
	}
	//회원명, 회원번호, 기준칼로리, 소비칼로리
	//name, number , kcal, burnkcal 
	public void addHealth(String name, String number,int kcal,int burnkcal) {
		HealthDTO dto = new HealthDTO(name, number, kcal , burnkcal);
		dao.save(dto);
	}

}

package task_healthSystem;

import java.util.ArrayList;
import java.util.List;

public class HealthDAO {
	List<HealthDTO> healthList = new ArrayList<>();
	
	public void save(HealthDTO dto) {
		healthList.add(dto);
	}
	public List<HealthDTO> findAll(){
		return healthList;
	}
}

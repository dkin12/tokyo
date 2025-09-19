package task_AnimalSystem;

import java.util.List;

public class AnimalService {
	private AnimalDAO dao;
	public AnimalService(AnimalDAO dao) {
		super();
		this.dao = dao;
	}
	public List<AnimalDTO> getAllAnimal(){
		return dao.findAll();
	}
	public void addAnimal(String id, String protector, String name, int age,int number) {
		AnimalDTO dto = new AnimalDTO(id, protector, name, age, number);
		dao.save(dto);
	}

}

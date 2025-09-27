package task_250927;

public class Main {
	public static void main(String[] args) {
		String filename = "DB/items.csv";
		deliveryDAO dao = new deliveryDAO(filename);
		deliveryService service = new deliveryService(dao);
		deliveryController controller = new deliveryController(service);
		
		controller.run();
	}
}

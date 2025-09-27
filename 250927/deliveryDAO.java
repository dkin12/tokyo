package task_250927;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class deliveryDAO {
	private String filename;
	private List<deliveryDTO> deliveryList;
	
	// csv 파일에서 내용 읽기
	
	public deliveryDAO(String filename) {
		this.filename = filename;
		this.deliveryList = loadCsv(filename);
	}
	
	
	private List<deliveryDTO> loadCsv(String filename){
		List<deliveryDTO> csvList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line; 
			boolean isSkip = true;
			while((line = br.readLine()) != null) {
				if(isSkip) {
					isSkip = false;
					continue;
				}
				
				String[] parts = line.split(",");
				
				int id = Integer.parseInt(parts[0].trim());
				String name = parts[1].trim();
				int price = Integer.parseInt(parts[2].trim());
				int total = Integer.parseInt(parts[3].trim());
				int order = Integer.parseInt(parts[4].trim());
				int current = Integer.parseInt(parts[5].trim());
				
				csvList.add(new deliveryDTO(id, name, price, total, order));
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return csvList;
		
	}


	public void save(deliveryDTO dto) {
		deliveryList.add(dto);
		writeCsv();
	}
	
	// CSV 파일에 저장
	private void writeCsv() {
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(filename));
			pw.println("id,name,price,total,order,current");
			for(deliveryDTO dto : deliveryList ) {
				pw.printf("%d,%s,%d,%d,%d,%d\n",dto.getDelivery_auto_number(),dto.getDelivery_name(),dto.getDelivery_price(),dto.getDelivery_total(),dto.getDelivery_order(),dto.getDelivery_current());
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("csv 저장 실패 : "+ e.getMessage());
		}finally {
			if(pw!=null) pw.close();
		}
		
	}
	
	public List<deliveryDTO> findAll(){
		return deliveryList;
	}
	
	public deliveryDTO findById(int itemId) {
		for(deliveryDTO dto : deliveryList) {
			if(dto.getDelivery_auto_number() == itemId) {
				return dto;
			}
		}
		
		return null;
		
	}
	
	
	
	
	
	
}

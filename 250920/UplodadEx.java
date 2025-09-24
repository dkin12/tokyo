package ch3;

import java.util.ArrayList;
import java.util.List;

public class UplodadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int deleteID = 30;
		
		List<ListDTO> list = new ArrayList<>();
		
		list.add(new ListDTO(10,"한라봉"));
		list.add(new ListDTO(20,"천혜향"));
		list.add(new ListDTO(30,"진지향"));
		list.add(new ListDTO(40,"설국향"));
		list.add(new ListDTO(50,"불로초"));
		
		int updateId = 10; // 수정할 번호 
		String newName = "오렌지" ; // 바꿀 이름
		
		// 1.인덱스 for문으로 수정 
		System.out.println("==for문으로 수정==");
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getId() == deleteID) {
				list.get(i).setName(newName);
				break;
			}
		}
		System.out.println(list);
	}

}

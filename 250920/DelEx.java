package ch3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ListDTO> list = new ArrayList<>();

		list.add(new ListDTO(10,"한라봉"));
		list.add(new ListDTO(20,"천혜향"));
		list.add(new ListDTO(30,"진지향"));
		list.add(new ListDTO(40,"설국향"));
		list.add(new ListDTO(50,"불로초"));
		
		final int deleteID = 30;
		
		// 1.인덱스 기반 for문 삭제
		System.out.println("==for문 삭제==");
		
		for( int i = 0; i<list.size();i++) {
			if(list.get(i).getId() == deleteID) {
				list.remove(i);
				break;
			}
		}
		System.out.println(list);
		
		list.clear();
		list.add(new ListDTO(10,"한라봉"));
		list.add(new ListDTO(20,"천혜향"));
		list.add(new ListDTO(30,"진지향"));
		list.add(new ListDTO(40,"설국향"));
		list.add(new ListDTO(50,"불로초"));
		

		// 2. literator 삭제 
		// list 같은 여러 데이터를 순차적으로 꺼낼 수 있게 도와주는 객체
		// 반복하면서 삭제, 변경하는 경우 반드시 필요
		System.out.println("==literator 삭제==");
		Iterator<ListDTO> it = list.iterator();
		while(it.hasNext()) { // 다음 값이 있으면
			if(it.next().getId() == deleteID) {
				it.remove();
				break;
			}
		}
		System.out.println(list);
		

		list.clear();
		list.add(new ListDTO(10,"한라봉"));
		list.add(new ListDTO(20,"천혜향"));
		list.add(new ListDTO(30,"진지향"));
		list.add(new ListDTO(40,"설국향"));
		list.add(new ListDTO(50,"불로초"));
		
	
		 
		// 3. Stream 삭제 .removeIf();
		// list.set, 배열 등 여러 데이터를 반복문 없이 처리할 수 있게 도와줌 
		// 메서드 체이닝 : method1().method2()
		// 순차적으로 적용해야하고, 타고타고 들어갈 수 있음 
		// .filter(); : 걸러냄
		// .map(); : 값 반환 
		// .forEach(); : 각 요소들의 반복
		// .fidFirst(); : 첫번째 값만 반복 
		// .sorted(); : 정렬
		// .collect(); 여러 데이터를 모아 새로운 컬렉션으로 반환 
		
		System.out.println("==3.removeIf==");
		// 람다식  이름 없는 함수로 한줄 표현 , (매개변수) -> {실행문}
		list.removeIf(n -> n.getId() == deleteID);
		System.out.println(list);

		list.clear();
		list.add(new ListDTO(10,"한라봉"));
		list.add(new ListDTO(20,"천혜향"));
		list.add(new ListDTO(30,"진지향"));
		list.add(new ListDTO(40,"설국향"));
		list.add(new ListDTO(50,"불로초"));
		
		// 4. Stream + collect = 원본리스트는 그대로 두고 새로운 리스트로 반환
		System.out.println("==4.Stream + collect == ");
		List<ListDTO> newList = list.stream().filter(n -> n.getId() != deleteID).toList();
		System.out.println("newList" + newList);
		System.out.println("원본 : " + list);
	}

}

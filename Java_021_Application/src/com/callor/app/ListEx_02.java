package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {

	public static void main(String[] args) {
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}
		System.out.println(intList);
//		어떤 객체를 출력? 호출할때 toString을 자동 호출하기떄문에 아래랑 같대
//		System.out.println(intList.toString());
		sort(intList);
		
		// intList
		// 매개변수로 보낸 값은 변경이 안된다고 했는데
		// sort method로 보낸 intList의 값이 변경되었음 !!!
		// Why!!! 일반변수와 리스트는 성질이 좀 다르대!!! 
		System.out.println("=".repeat(50));
		System.out.println(intList.toString());
		
		
	}//end main
	
	public static void sort(List<Integer> list) {
		int nSize = list.size();
		for(int i = 0; i < nSize; i++) {
			for(int j = i+1; j < nSize; j++) {
				if(list.get(i) > list.get(j)) {
					
					Integer te = list.get(i);
					list.set(i, list.get(j));
					list.set(j, te);
				}
			}
		}
		System.out.println(list);
	}
}

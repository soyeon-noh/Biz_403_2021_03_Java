package com.callor.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_03 {

	public static void main(String[] args) {
		/*
		 * Generic 사용 : <Integer>
		 * List 형 객체에 저장할 데이터의 type을 제한하므로써
		 * 코드 실행과 메모리 사용의 효율을 높이기 위함이다.
		 */
		List<Integer> divisor = new ArrayList<Integer>(); // 객체생성 // <Integer> 같은 제네딕을 사용하는 이유 : 자원관리의 효율성때문
		Random rnd = new Random(); // 객체생성
		int intNum = rnd.nextInt(51) + 50;
		
		for(int i = 2; i < intNum; i++) { // 약수찾기
			if(intNum % i == 0) {
				divisor.add(i); //약수인경우 list에 추가
			} // 필요한 자리수만큼 add를 사용하면 된다!
		}
		// 추가된 list 출력
		System.out.println("생성된 난수 : " + intNum);
		System.out.print("약수들의 리스트 : ");
		for(int i = 0; i < divisor.size(); i++){ // list에는 size라는 메서드가 준비되어있대
			System.out.print(divisor.get(i) + "\t");
		}
	}
}

package com.callor.fine;

import com.callor.fine.model.ScoreVO;

public class MainEx_02 {

	public static void main(String[] args) {
		
		ScoreVO[] scoreVO = new ScoreVO[10];
		// 참조타입은 배열을 선언했을 때 초기값이 null이다.
		
		for(int i = 0; i < 10; i++ ) {
			scoreVO[i] = new ScoreVO(); 
			// 배열은 초기화했는데
			// 배열 안의 VO를 초기화 못한거구나.
			// 그래서 출력할 수 가 없구나.
		}
	
		System.out.println(scoreVO[0].getNum());
		
		int index = 3;
		scoreVO[index].setNum("0001");
		scoreVO[index].setKor(90);
		scoreVO[index].setEng(88);
		scoreVO[index].setMath(77);
		
		System.out.println("학번 : " + scoreVO[index].getNum());
		System.out.println("학번 : " + scoreVO[index].getKor());
		System.out.println("학번 : " + scoreVO[index].getEng());
		
		// 널포인트 익셉션 해결방법은?
	}
}

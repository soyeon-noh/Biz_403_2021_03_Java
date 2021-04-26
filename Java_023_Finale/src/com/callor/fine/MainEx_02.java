package com.callor.fine;

import com.callor.fine.model.ScoreVO;

public class MainEx_02 {

	public static void main(String[] args) {
		
		ScoreVO[] scoreVO = new ScoreVO[10];
		
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

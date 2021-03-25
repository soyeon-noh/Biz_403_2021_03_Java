package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_09 {

	public static void main(String[] args) {
		
		// public ScoreServiceV1()
		// public ScoreServiceV2( int member ) 
		// 5는 ssV2 객체를 만들때 생성자에게 전달(보내는) 값
		// argument
		ScoreServiceV2 ssV2 = new ScoreServiceV2(5); // 클래스 생성자를 호출 할때 정수값을 보냄
		ssV2.makeScore();
		ssV2.calculatorScore();
		ssV2.printScore();
	}
}

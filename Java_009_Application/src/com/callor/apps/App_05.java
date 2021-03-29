package com.callor.apps;

import com.callor.apps.service.ScoreServiceV5;

public class App_05 {

	public static void main(String[] args) {
		
		ScoreServiceV5 ssV5 = new ScoreServiceV5(10); //클래스를 이용해 객체를 만들고 생성.
		/*
		 * ssV5.makeScores()명령이 실행되면
		 * ScoreServiceV5 클래스의 makeScoress() method의 코드가 실행된다.
		 * 
		 * 코드가 모두 정상 종료되거나 
		 * 아니면 중간에 return 명령문을 만나면 
		 * System.out.println("입력..."); 명령문이 이어서 실행된다.
		 */
		ssV5.makeScores();
		//
		System.out.println("입력업무 중단!!!");
		
		// method에 static keyword가 부착되면
		// 객체를 생성하는 절차 없이 method를 직접
		// 호출할 수 있다.
		// 클래스.method()
		
		// 안붙어있으면 객체만들고해야함. => 그럼 왜 static을 사용 안했나?
		//		V5 98줄
		System.out.println(ScoreServiceV5.dLine());
	}
}

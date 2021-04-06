package com.callor.method.service;

public class ScoreServiceV1 {

	InputServiceV1A inService;
	
	public ScoreServiceV1() {
		inService = new InputServiceV1A();
	}
	
	public void inputScore() {
		
		Integer score = inService.inputValue("국어", 0, 100);
		
		if(score == null) {
			System.out.println("종료");
		}else {
			System.out.println("점수 : " + score);
		}
		
	}
}

package com.callor.method.service;

public class ScoreServiceV4 {

	public void inputScore() {
		InputServiceV2 inService = new InputServiceV2();
		
		String[] subject = {"국어", "영어", "수학"};
		Integer[] score = new Integer[subject.length];
		int sum = 0;
		
		float avg = 0.0f;
		
		for(int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			if(score[i] == null) {
				System.out.println("종료");
				return;
			}
			sum += score[i];
		}
		
		avg = (float)sum / subject.length;
		
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %5.2f", avg);
		
	}
}

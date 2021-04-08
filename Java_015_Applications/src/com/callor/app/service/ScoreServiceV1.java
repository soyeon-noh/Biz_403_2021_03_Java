package com.callor.app.service;

import com.soyeon.standard.InputService;
import com.soyeon.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	
	String[] subject;
	Integer[] score;
	public ScoreServiceV1() {
		subject = new String[] {"국어", "영어", "수학"};
		score = new Integer[subject.length];
	}
	
	
	public void PrintScore() {
		int total = 0;
		float avg = 0.0f;
		
		InputService isV1 = new InputServiceImplV1();
		
		for(int i = 0; i < subject.length; i++) {
			score[i] = isV1.inputValue(subject[i], 0, 100);
			if(score[i] == null) {
				return;
			}
			total += score[i];
		}
		avg = (float)total / subject.length;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
		
	}
}

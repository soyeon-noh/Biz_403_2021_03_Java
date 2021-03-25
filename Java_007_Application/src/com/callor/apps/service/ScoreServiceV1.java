package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	
	int[] scoKor;
	int[] scoEng;
	int[] scoMath;
	
	int[] scoSum;
	float[] scoAvg;
	
	
	public ScoreServiceV1() {
	scoKor = new int[10]; // 계속 같다면 length 를 사용해라
	scoEng = new int[scoKor.length];
	scoMath = new int[scoKor.length];
	
	scoSum = new int[scoKor.length];
	scoAvg = new float[scoKor.length];
	}
	
	public void makeScore() {
		Random random = new Random();
		for(int i = 0; i < scoKor.length; i++) {
			scoKor[i] = random.nextInt(101);
			scoEng[i] = random.nextInt(101);
			scoMath[i] = random.nextInt(101);
		}
	}
	
	public void calculatorScore() {
		for (int i = 0; i < scoKor.length; i++) {
			scoSum[i] = scoKor[i];
			scoSum[i] += scoEng[i];
			scoSum[i] += scoMath[i];
		}
		
		int cSubject = 0;
		cSubject = 3;
		for (int i = 0; i < scoKor.length; i++) {
			scoAvg[i] = (float)scoSum[i] / cSubject;
		}
	}
	
	
	public void printScore() {
		System.out.println("==============================================");
		System.out.println(" 학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(int i = 0; i < scoKor.length; i++) {
			System.out.printf(" %03d\t%3d\t%3d\t%3d\t%3d\t%3.2f\t\n" // %03d하면 세자리빈곳 0채워짐
					, i+1, scoKor[i], scoEng[i], scoMath[i], scoSum[i], scoAvg[i]); 
		} // 여기 그냥 sysout여러번해서 하나씩 빼는 게 가독성 더 좋을 것 같다.
		System.out.println("==============================================");
	}
}

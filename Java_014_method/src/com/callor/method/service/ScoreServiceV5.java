package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected String[] subject;
	protected Integer[] scores;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;
	InputServiceV2 inService;
	int stdNum;
	int line;
	
	
	public ScoreServiceV5() {
		subject = new String[] {"국어", "영어", "수학"};
		scores = new Integer[subject.length];
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
		inService = new InputServiceV2();
		stdNum = 5;
		line = 50;
		
	}
	
	
	public void inputScore() {
		// TODO 5명 학생의 각 과목의 점수를 입력 받기
		
		for(int i = 0; i < stdNum; i++) {
			System.out.println("-".repeat(line));
			System.out.printf("[%d 번 학생]\n", i + 1);
			for(int j = 0; j < subject.length; j++) {
				scores[j] = inService.inputValue(subject[j], 0, 100);
				if(scores[j] == null) {
					System.out.println("종료");
					return;
				}
			}
			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);
		}
		this.printScore();
	}
	
	public void printScore() {
		// TODO 성적 리스트 출력
		
		System.out.println("=".repeat(line));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(line));
		for(int i = 0; i < stdNum; i++) {
			int sum = 0;
			float avg = 0.0f;
			sum = kors.get(i) + engs.get(i) + maths.get(i);
			avg = (float)sum / stdNum;
			System.out.printf("%d 번\t", i+1);
			System.out.printf("%d\t", kors.get(i));
			System.out.printf("%d\t", engs.get(i));
			System.out.printf("%d\t", maths.get(i));
			System.out.printf("%d\t", sum);
			System.out.printf("%5.2f\n", avg);

		}
	}
}

package com.callor.score.service.impl;

import com.soyeon.standard.InputService;
import com.soyeon.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected InputService inService;
	protected String[] subName;
	protected Integer[] subScore;
	protected

	public ScoreServiceImplV2() {
		inService = new InputServiceImplV1();
		subName = new String[] { "국어", "영어", "수학" };
		subScore = new Integer[subName.length];
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
		Integer intNum = inService.inputValue("학번", 1);
		String strNum = String.format("2021%03d", intNum);
		
		
		
		// 과목 3개 입력받기
		for (int i = 0; i < subName.length; i++) {
			Integer score = inService.inputValue(subName[i], 0, 100);
			if (score == null) {
				return;
			}
			subScore[i] = score;
		}
		
		// 이름, 학번, 과목점수 ArrayList에 추가하기
		
	}
}
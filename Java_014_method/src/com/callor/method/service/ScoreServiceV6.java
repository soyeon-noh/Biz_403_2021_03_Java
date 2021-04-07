package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreServiceV6 {

	protected String[] subject;
	protected List<ScoreVO> scoreList;
	protected InputServiceV2 inService;
	protected Integer[] scores;
	protected int stdNum;
	
	public ScoreServiceV6() {
		subject = new String[] {"국어", "영어", "수학"};
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV2();
		scores = new Integer[subject.length];
		stdNum = 5;
	}
	
	public void inputScore() {
		
		for(int i = 0; i < stdNum; i++) {
			for(int j = 0; j < subject.length; j++) {
				scores[j] = inService.inputValue(subject[j], 0, 100);	
				if(scores[j] == null) {
					return;
				}
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(scores[0]);
			scoreVO.setEng(scores[1]);
			scoreVO.setMath(scores[2]);
			
			scoreList.add(scoreVO);		
		}
		this.printScore();
	}
	
	public void printScore() {
		System.out.println("학번\t국어\t영어\t수학");
		for(int i = 0; i < scoreList.size(); i++) {
			System.out.print( (i+1) + "번\t");
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\n");
		}
	}
}



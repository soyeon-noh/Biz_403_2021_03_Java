package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class Score_01 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1(5);
		
		ssV1.inputNum();
		ssV1.makeSumAvg();
		ssV1.printScore();
	}
}

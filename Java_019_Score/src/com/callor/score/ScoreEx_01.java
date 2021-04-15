package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.Impl.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV1();
		sService.insertScore();
	}
}

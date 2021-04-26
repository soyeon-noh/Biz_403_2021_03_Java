package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
	}
	// 뭐.??? 뭔오류났음?
	// 아 상속받는거 private에서 protected 바꿔야한다
}

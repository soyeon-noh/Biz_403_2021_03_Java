package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV3Ex;

public class test {

	public static void main(String[] args) {
		ScoreService ssV3 = new ScoreServiceImplV3Ex();
		ssV3.selectMenu();
	}
}

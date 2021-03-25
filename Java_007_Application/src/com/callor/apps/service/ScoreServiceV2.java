package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV2 extends ScoreServiceV1 {
	
	// int members = 5
	// method의 괄호() 안에 선언된 변수
	// 매개변수, parameter 라고 부른다.
	// 누군가가 클래스를 객체로 만들때 생성하는 생성자에서 ... 매개체 연결되는 통로
	public ScoreServiceV2(int members) {
	
	scoKor = new int[members]; // 계속 같다면 length 를 사용해라
	scoEng = new int[scoKor.length];
	scoMath = new int[scoKor.length];
	
	scoSum = new int[scoKor.length];
	scoAvg = new float[scoKor.length];
	
	
	}
	
}

package com.callor.apps.service;

public class LinesService {

	/*
	 * 누군가 LinesService.dLines(10)형식으로 호출하면
	 * 		"=" 문자열을 10개 생성하여
	 * 		return 하라
	 * 
	 * LinesService.sLine(20) 으로 호출하면
	 * 		"-" 문자열을 20개 생성하여
	 * 		return 하라
	 */
	public static String dLines(int length) {
		String dLine= ""; //아무것도 없는 상태에서 
		for(int i = 0; i < length; i++) {
			dLine +="="; //length가 5라면 : =====
		}
		return dLine; // dLine 값을 return
						// 나를 호출하는 곳으로 보내라!
	}

	public static String sLines(int length) {
		String sLine = "";
		for(int i = 0; i < length; i++) {
			sLine += "-";
		}
		return sLine;
	}
}


// 줄을 변수로 만드는 것보다
// 메서드로 만드는 게 변경하기 쉬움


package com.callor.app;

import com.callor.app.model.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(90);
		scoreVO.setEng(88);
		scoreVO.setMath(77);
		
		System.out.println(scoreVO.toString());
		
		//toString() : 객체를 생성하면 자동으로 생성되는 메서드.
		// : com.callor.app.model.ScoreVO@26f0a63f
		//		com.callor.app.model.ScoreVO : 
		// 		@26f0a63f: 데이터를 저장한 heap 주소를 알려준다.
	}
}

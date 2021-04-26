package com.callor.fine;

import java.util.ArrayList;
import java.util.List;

import com.callor.fine.model.ScoreVO;

public class MainEx_06 {

	public static void main(String[] args) {
		
//		List<ScoreVO> scoreList = null;
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		for(int i = 0; i < 10; i++) {
			
//			ScoreVO scoreVO = null;
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
			// 이것도 실행하면 오류가난다. 왜일까!
		}
		System.out.println(scoreList.get(0));
	}
}

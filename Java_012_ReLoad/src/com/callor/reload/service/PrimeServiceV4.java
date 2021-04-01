package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> intList;

	public PrimeServiceV4() {
		rnd = new Random();
		intList = new ArrayList<Integer>();
	}

	public void primeNum() {
		// TODO 50~100 난수 발생, 소수판별, 소수 리스트에 추가
		int rndNum = 0;

		for(int i = 0; i < 50; i++) {
			rndNum = rnd.nextInt(51) + 50;

			int index = 0;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0)
					break;
			}

			if (index >= rndNum) { // ★ == 동등연산자보다 안전하다
				intList.add(rndNum);
			}
		}
	}

	public void printPrimeNum() {
		// TODO 소수 리스트 출력
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
	}
}

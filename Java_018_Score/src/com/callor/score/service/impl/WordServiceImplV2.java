package com.callor.score.service.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV2 extends WordServiceImplV2A {

	@Override
	public void viewWord() {
		Random rnd = new Random();
		int winCount = 0;
		int loseCount = 0;

		while (true) {
			WordVO word = this.getWord();
			String strEng = word.getEnglish();

			String[] strWords = strEng.split("");
			String[] originWords = strWords; // 섞기전 배열 저장

			String strInput = null;

			int retryCount = 0;

			for (int i = 0; i < 100; i++) {
				int index1 = rnd.nextInt(strWords.length);
				int index2 = rnd.nextInt(strWords.length);

				String temp = strWords[index1];
				strWords[index1] = strWords[index2];
				strWords[index2] = temp;
			}

			while (true) {
				System.out.println("=".repeat(50));
				System.out.println(word.toString());
				System.out.println("-".repeat(50));
				System.out.println("다음 단어를 올바르게 배열하시오(Quit: 게임종료)");
				System.out.println(Arrays.toString(strWords));
				System.out.println("-".repeat(50));
				System.out.print(">> ");
				strInput = scan.nextLine();

				if (strInput.equals("Quit")) {
					break;
				}

				if (strInput.equalsIgnoreCase(word.getEnglish())) {
					System.out.println("맞았습니다. 참 잘했어요");
					winCount++;
					break;
				} else {
					if (retryCount == 0) {
						System.out.println("힌트 : " + word.getKorea());
					} else if (retryCount == 1) {
						System.out.println("첫글자 : " + originWords[0]);
					} else if (retryCount == 2) {
						System.out.println("두번째까지 : " 
									+ originWords[0] + originWords[1]);
					} else if (retryCount == 3) {
						System.out.println("세번째까지 : " 
									+ originWords[0] + originWords[1] + originWords[2]);
					} else {
						System.out.println("기회를 모두 소진하여 틀렸습니다.");
						loseCount++;
						break;
					}
					System.out.println("다시한번 생각해 보세요");
					retryCount++;

					continue;
				}
			} // end while1

			if (strInput.equals("Quit")) {
				break;
			}
		} // end while2
		System.out.println("Game Over!!!");
		System.out.println("맞춘 문제 수 : " + winCount);
		System.out.println("틀린 문제 수 : " + loseCount);
	}
}

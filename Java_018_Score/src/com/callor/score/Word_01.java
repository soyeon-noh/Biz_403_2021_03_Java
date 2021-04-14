package com.callor.score;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName); // 파일 열기
			buffer = new BufferedReader(fileReader); // 버퍼에 저장
			
			System.out.println("=".repeat(50));
			while (true) {
				String word = buffer.readLine(); // 한줄씩 읽기
				if (word == null) { // 반복탈출 조건
					break;
				}
				String[] wordList = word.split(":");
				System.out.printf("%s\t%s\n", wordList[0], wordList[1]);
			}
			System.out.println("=".repeat(50));
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일을 찾을 수 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일을 읽을 수 없음");
		}

	}

}

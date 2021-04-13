package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(fileName);
			
			/*
			 * read() method를 실행하면 어떤 값을 읽어서
			 * int 형의 데이터를 return 하도록 만들어져 있다
			 * 
			 * 현재 (여기서는 fileReader로) 열린 파일에서 1byte를 읽어서
			 * ASCII 코드로 return 하는 method
			 */
			int result = fileReader.read();
			// 정수값에 해당하는 ASCII코드를 갖는 문자로 바꿔서 보여달라
			// ex) A -> 65 -> A, B -> 66 -> B
			System.out.printf("%c",result);
			
			fileReader.close();
			
		} catch (FileNotFoundException e) { // Exceptin1: 파일을 열려고했는데 없다
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // Exceptin2: 파일을 읽어들이는 도중에 오류
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

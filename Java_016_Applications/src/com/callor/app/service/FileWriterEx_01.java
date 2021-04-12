package com.callor.app.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		
		
		String filename = "src/com/callor/app/data.txt";
		FileWriter fileWriter = null;
		PrintWriter out = null;

		try {
			fileWriter = new FileWriter(filename);
			out = new PrintWriter(filename);

			out.println("=".repeat(40));
			out.printf("%d + % d = %d\n", num1, num2, num1 + num2);
			if(num1 > num2) {
				out.printf("%d - % d = %d\n", num1, num2, num1 - num2);
			}
			else out.printf("%d - % d = %d\n", num2, num1, num2 - num1);
			out.printf("%d * % d = %d\n", num1, num2, num1 * num2);
			if(num1 > num2) {
				out.printf("%d / % d = %d\n", num1, num2, num1 / num2);
			}
			else out.printf("%d / % d = %d\n", num2, num1, num2 / num1);
			out.println("=".repeat(40));
			
			out.flush();
			out.close();
			System.out.println("파일작성 완료");
		} catch (IOException e) {
			System.out.println("파일작성 실패");
		}
	}
}

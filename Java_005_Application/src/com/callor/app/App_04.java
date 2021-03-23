package com.callor.app;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] classStd = new int[5];
		int[] pizzaBox = new int[5];
		int[] pizzaPiece = new int[5];
		int totalBox = 0;
		
		for(int i = 0; i < 5; i++){
			classStd[i] = random.nextInt(10) + 50;
			
			pizzaBox[i] = classStd[i] / 6;
			
			pizzaBox[i] = pizzaBox[i] % 6 == 0 ? pizzaBox[i] : pizzaBox[i]++;
			
			classBox[i] * 6 
			
			System.out.println(classStd[i] +" " +  pizzaBox[i]);
			pizzaPiece[i] = pizzaBox[i] * 6;
			totalBox += pizzaBox[i];
		}
		
		
		
		System.out.println("==========================================");
		System.out.printf("인원수\t\t피자주문\t전체조각 수\n");
		System.out.println("------------------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d\t\t%d\t\t%d\n", classStd[i], pizzaBox[i], pizzaPiece[i]);
		}
		System.out.println("==========================================");
		System.out.println("전체 주문 BOX 수량: " + totalBox);
		
		
		
	
		
	}
}

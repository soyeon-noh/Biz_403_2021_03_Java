package com.callor.app;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random random = new Random();
		int[] classStd = new int[5];
		int[] pizzaBox = new int[5];
		int[] pizzaPiece = new int[5];
		int totalBox = 0;
		int pizzaPcs = 6;

		for (int i = 0; i < 5; i++) {
			classStd[i] = random.nextInt(10) + 50;

			pizzaBox[i] = classStd[i] / pizzaPcs;

			pizzaBox[i] = pizzaBox[i] % pizzaPcs == 0 ? pizzaBox[i] : pizzaBox[i]++;

			pizzaBox[i] = classStd[i] % (pizzaBox[i] * pizzaPcs) == 0 ? pizzaBox[i] : pizzaBox[i] + 1;
			// 여기 i++ 연산을하면 대입후에 ++ 되어서 효과가없다.
			
			pizzaPiece[i] = pizzaBox[i] * pizzaPcs;
			totalBox += pizzaBox[i];

		}

		System.out.println("==========================================");
		System.out.printf("인원수\t\t피자주문\t전체조각 수\n");
		System.out.println("------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d\t\t%d\t\t%d\n", classStd[i], pizzaBox[i], pizzaPiece[i]);
		}
		System.out.println("==========================================");
		System.out.println("전체 주문 BOX 수량: " + totalBox);

	}
}

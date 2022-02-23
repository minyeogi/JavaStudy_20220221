package a05_Input;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		/* 
		 * 세 수를 입력 받는다.
		 */
		int x, y, z = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 수를 입력받는다.");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
				
		System.out.println("세 수의 합은? : " + (x + y + z));
		
		System.out.print("세 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		
		System.out.println("세 수의 곱: " + x*y*z);
		
		System.out.print("세 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		
		System.out.println("앞의 두수의 곱에 세번째 수로 나눈 나머지: " + ((x*y) % z));
		
		scanner.close();

	}

}

package a06_Condition;

import java.util.Scanner;

public class IfElseEx6 {

	public static void main(String[] args) {

		int x, y = 0;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("x축을 입력하세요: ");
		x = scanner.nextInt();	
		System.out.print("y축을 입력하세요: ");
		y = scanner.nextInt();		
		
		if (x == 0 && y == 0) {
			System.out.println("원점입니다.");
		}else { 
		if (x > 0 && y >0) {
			result = 1;
		}else if (x < 0 && y >0) {
			result = 2;
		}else if (x < 0 && y < 0) {
			result = 3;
		}else if (x > 0 && y < 0) {
			result = 4;
		}
		System.out.println("제 " + result + "사분면입니다." );
		}
		
		scanner.close();
	}

}

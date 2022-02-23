package a06_Condition;

import java.util.Scanner;

public class IfElseEx4 {

	public static void main(String[] args) {

		int x, y, z =0;
		
		System.out.println("세 수를 입력해 주세요: ");
		
		Scanner scanner = new Scanner(System.in);
		x  = scanner.nextInt();
		y  = scanner.nextInt();
		z  = scanner.nextInt();
		
		if (x == y && y == z) {
			System.out.println("세 수는 모두 같습니다.");
		}else if (x >= y && x >= z) {
			System.out.println("가장 큰 수는 " + x + "입니다.");
		}else if (y >= z && y >= x) {
			System.out.println("가장 큰 수는 " + y + "입니다.");
		}else if (z >= x && z >= y) {
			System.out.println("가장 큰 수는 " + z + "입니다.");
		}	
		
		scanner.close();
	}

}

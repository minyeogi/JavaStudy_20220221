package a06_Condition;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		
		int x, y = 0;
		System.out.print("두 수를 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if (x == y) {
			System.out.println("두 수가 같습니다.");
		}else if (x > y){
			System.out.println("두 수중 큰 값은 " + x + "입니다.");
		}else {
			System.out.println("두 수중 큰 값은 " + y + "입니다.");		}
		
		scanner.close();
	}

}

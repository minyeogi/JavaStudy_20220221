package a06_Condition;

import java.util.Scanner;

public class IfElseEx3 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("하나의 수를 입력해 주세요: ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		if (num == 0) {
			System.out.println("0은 0입니다.");
		}else if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		
		scanner.close();
	}

}

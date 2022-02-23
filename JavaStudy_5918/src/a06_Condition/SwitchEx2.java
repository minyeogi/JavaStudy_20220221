package a06_Condition;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		int score = 0;
		
		System.out.print("점수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("올바른 점수가 아닙니다.");
		}else {
			switch (score / 10) {
				case 10 :
				case 9 :
					System.out.println("A");
						break;
				case 8 :
					System.out.println("B");
						break;
				case 7 :
					System.out.println("C");
						break;
				case 6 :
					System.out.println("D");
						break;
				default : 
					System.out.println("F");
			}
		}
		scanner.close();

	}

}

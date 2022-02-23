package a06_Condition;

import java.util.Scanner;

public class IfElseEx5 {

	public static void main(String[] args) {
		int score = 0;
		String result = null;
		System.out.print("학생의 점수를 입력해 주세요: ");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("점수는 0 ~ 100 사이만 입력이 가능합니다.");
		}else {
		if(score >= 90 ) {
			result = "A";
		}else if (score >= 80) {
			result = "B";
		}else if (score >= 70) {
			result = "C";
		}else if (score >= 60) {
			result = "D";
		}else {
			result = "F";
		}
		
		System.out.println("학생의 평점은 " + result + "입니다.");
		
		}
		
		scanner.close();
	}


}

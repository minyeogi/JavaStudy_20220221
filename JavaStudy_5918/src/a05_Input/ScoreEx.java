package a05_Input;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("성적을 입력해주세요: " );
		int score = scanner.nextInt();
		char result;
		result = score > -1 && score < 101 ? 
					score > 89 ? 'A' :
						score > 79 ? 'B' :
							score > 69 ? 'C' :
								score > 59 ? 'D' :
									score > -1 ? 'F' : ' '
													 : 'X';
									
		System.out.println("학생의 평점은 " + result + "등급입니다.");
		
		scanner.close();
		

	}

}

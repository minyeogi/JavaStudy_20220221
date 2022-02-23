package a03_Calc;

public class Operation04 {

	public static void main(String[] args) {
		
		
		/* 논리 연산자 (boolean)
		 * AND => && => 곱
		 * OR => || => 합
		 * NOT => ! => 부정 
		 * 
		 * true (1), false(0)
		 * 
		 * true && true => true
		 * true && false => false
		 * 하나의 조건이라도 false 면 false
		 * 
		 * true || true => true
		 * true || false => true
		 * 하나의 조건이라도 true면 true
		 * 
		 * !(true || false) => false
		 * !true || false => false
		 * 
		 */
		
		int score = -30;
		boolean result;
		result = (score > 0 && score < 100);
		System.out.println("결과: " + result);
		
		char grade = 'd';
		result = (grade =='A' || grade == 'a' || grade =='B' || grade == 'b' || grade == 'C' || grade == 'c');
		System.out.println("결과2 " + result);
		
		
		
		
		

	}

}

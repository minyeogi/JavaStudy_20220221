package ch4;

public class WhileExample {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num < 11) {
			
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
	}

}

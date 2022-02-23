package ch4;

public class ContinueExample {

	public static void main(String[] args) {
		int num = 0;
		int total = 0;
		
		for(num = 0; num <101; num++) {
			if (num % 2 == 1) {
				continue;
			}
			total += num;
		}
			System.out.println(total);
	}

}

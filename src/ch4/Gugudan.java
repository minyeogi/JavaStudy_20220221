package ch4;

public class Gugudan {

	public static void main(String[] args) {
		int dan, num;
		
		for(dan = 1; dan < 10; dan++) {
			if (dan % 2 == 1) {
				continue;
			}	
			System.out.println( "[" + dan + "단" + "]" );
			
			
			for(num = 1; num < 10; num++) {
				if (dan < num) {
					break;
				}
				System.out.println(dan + "X" + num + "=" + dan*num);
			}
				System.out.println();
		}
	}

}

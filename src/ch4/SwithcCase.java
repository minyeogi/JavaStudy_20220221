package ch4;

public class SwithcCase {

	public static void main(String[] args) {
		
		int rank = 1;
		char medalcolor;
		
		switch(rank) {
			case 1: medalcolor = 'G';
					break;
			case 2: medalcolor = 'S';
					break;
			case 3: medalcolor = 'B';
					break;
			default: medalcolor = 'A';
		}
			System.out.println(rank + "등 메달의 색깔은 " + medalcolor + " 입니다.");
		
	}

}

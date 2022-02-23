package a05_Input;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str);
		System.out.println(scanner.nextLine());
		
		
		
		scanner.close();
		
		
//		
//		int studentCode = scanner.nextInt();
//		System.out.println(studentCode + 10);
		

	}
	

}

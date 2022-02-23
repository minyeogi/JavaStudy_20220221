package a05_Input;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Username(아이디)
		 * password(비밀번호)
		 * year(년도)
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소)
		 * 
		 *  
		 */
		String Username, name, address = null;
		int password, year, month, day = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		Username = scanner.next();
		password = scanner.nextInt();
		year = scanner.nextInt();
		month = scanner.nextInt();
		day = scanner.nextInt();
		name = scanner.next();
		scanner.nextLine();
		address = scanner.nextLine();
		
		System.out.println("아이디: " + Username);
		System.out.println("비밀번호: " + password);
		System.out.println("생년월일: " + year +"/" + month + "/" + day);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		
		scanner.close();
	}

}

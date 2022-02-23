package ch3_assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		
		int num1= 5;
		int num2= 10;
		
		int result = num1 & num2;
		System.out.println(result);
		
		
		int result2 = num1 | num2;
		System.out.println(result2);
		
		int num3 = 15;
		System.out.println(num3 << 2);
		System.out.println(num3);
		System.out.println(num3 <<= 2);
		System.out.println(num3 >> 1);
	}

}

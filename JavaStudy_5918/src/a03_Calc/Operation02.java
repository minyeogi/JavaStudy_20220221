package a03_Calc;

public class Operation02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 40;
		
		
		System.out.println(num1 + ++num2);
		
		int dan = 2;
		int num = 1;
		int result = dan * num;
		
		System.out.println(dan + " x " + num + " = " + result);
		
		int year = 2022;
		int month = 2;
		int day = 21;
		
		System.out.println(++year + "년 " + ++month + "월 " + ++day + "일");
	}
}

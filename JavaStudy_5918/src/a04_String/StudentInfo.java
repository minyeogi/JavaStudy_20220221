package a04_String;

public class StudentInfo {

	public static void main(String[] args) {
		String name = "성민혁";
		int i_year = 2022;
		String year = "" + (++i_year);
		String month = "02";
		String day = "22";
		String academy = "코리아아이티아카데미 부산";
		System.out.println( year + "년 " + month + "월 " + day + "일 " + academy + "학생정보");
		System.out.println("학생이름: " + name);


		/*
		 * 문자열 형변환
		 * 문자열(String) -> Integer(int)
		 * Integer.parseInt();
		 * Integer.parseInt("100"); -> 숫자 100으로 변환
		 * Double.parseDouble("15.123"); -> 실수 15.123으로 변환
		 * Boolean.parseBoolean("true");
		 * 
		 * 정수, 실수 등을 문자열로 형변환
		 * Integer.toString(100); -> 문자열 100으로 변환
		 * Double.toString(3.41); -> 문자열 3.41로 변환
		 * Boolean.toString(true); -> 문자열 true로 변환
		 * 
		 */
		int num = Integer.parseInt("100");
		double dNum = Double.parseDouble("3.14");
		System.out.println(num + 20);
		System.out.println(dNum + 10);
		System.out.println(!Boolean.parseBoolean("true"));
		
		String num2 = Integer.toString(200);
		System.out.println(num2 + 200);
	}

}

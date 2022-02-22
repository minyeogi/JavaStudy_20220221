package a02_Variable;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번: StudentCode
		 * 이름: name1, name2. name3
		 * 학년: StudentYear
		 * 성적: score
		 * 평점:
		 * 성별:남성(true), 여성:(false)
		 * 
		 */
		int studentCode = 2019313209; 
		int studentYear = 2;
		char name1 = '성';
		char name2 = '민';
		char name3 = '혁';
		String grade = "A+";
		double score = 100;
		boolean gender = true;
		
		System.out.print("학번: ");
		System.out.println(studentCode);
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.print("성적: ");
		System.out.println(score);
		System.out.print("평점: ");
		System.out.println(grade);  
		System.out.print("성별: ");
		System.out.println(gender);
	}

}

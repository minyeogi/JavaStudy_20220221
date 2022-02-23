package ch5;

public class Stuudent {
	int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Stuudent() {
		korean = new Subject();
		math = new Subject();
		
	}
	public Stuudent(int id, String name) {
		studentID = id;
		studentName = name;
		
		korean = new Subject();
		math = new Subject();
		
	}
	
	public void setKorean(String name, int score) {
		korean.setSubjectName(name);
		korean.setScore(score);
	}
	
	public void setmath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korean.getScore() + math.getScore();
		System.out.println((studentName + "학생의 총점은 " + total + "입니다."));
	}
}

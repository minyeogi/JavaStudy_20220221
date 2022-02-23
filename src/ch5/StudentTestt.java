package ch5;

public class StudentTestt {

	public static void main(String[] args) {
		Stuudent studentJames = new Stuudent(100, "James");
		studentJames.setKorean("국어", 100);
		studentJames.setmath("수학", 100);
		
		Stuudent studentTomas = new Stuudent(100, "Tomas");
		studentTomas.setKorean("국어", 100);
		studentTomas.setmath("수학", 100);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}

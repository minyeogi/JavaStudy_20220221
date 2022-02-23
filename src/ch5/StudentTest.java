package ch5;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
		studentLee.address = "서울시 여의도";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudnetInfo();
		studentKim.showStudnetInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
}

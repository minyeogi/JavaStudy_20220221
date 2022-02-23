package a02_Variable;

public class Score {

	public static void main(String[] args) {
		double kor = 80.5;
		double eng = 90.5;
		double math = 75.3;
		
		double avg = 0;
		double total = 0;
		
		int iAvg = 0;
		int iTotal = 0;
		
		total = kor + eng + math;
		avg = total / 3;
		
		iTotal = ((int)kor + (int)eng + (int)math);
		iAvg = iTotal / 3;
		
		System.out.println("평균: " + avg);
		System.out.println("합계1: " + total);
		System.out.println("평균2: " + iAvg);
		System.out.println("합계: " + iTotal);
	}

}

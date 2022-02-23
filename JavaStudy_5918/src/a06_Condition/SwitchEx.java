package a06_Condition;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 6;
		
		switch(select) {
			case 1 : 
				System.out.println("1을 선택하셨습니다.");
			case 2 : 
				System.out.println("2를 선택하셨습니다.");
			case 3 : 
				System.out.println("3을 선택하셨습니다.");
			default : 
				System.out.println("해당 case는 없습니다. ");
		}
		
		String select2 = "성민혁";
		
		switch (select2) {
			case "성민혁" :
				System.out.println("선택하신 이름은 성민혁입니다.");
				break;
			case "성민현" :
				System.out.println("선택하신 이름은 성민현입니다.");
				break;
			case "성민혇" :
				System.out.println("선택하신 이름은 성민혇입니다.");
				break;
			default : 
				System.out.println("해당 case는 없습니다. ");
		}
		
		int num = 53;
		
		switch (num == 0 ? 2 : num % 2) {
			case 1 : 
				System.out.println("홀수입니다.");
					break;
			case 0 : 
				System.out.println("짝수입니다.");
					break;
			default : 
				System.out.println("0입니다.");
				
		}
		
		
	}

}

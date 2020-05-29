package sec01.exam02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		
		

		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		int totalSec = totalMinute*60 ;
		System.out.println("\"시간은\" " + hour + ", 분은" + minute + ", 초는" +totalSec);
		
		System.out.printf("시간은 ");
		
	}
}

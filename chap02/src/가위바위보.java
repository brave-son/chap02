import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		double ran = Math.random();
		int com = (int) (ran * 3);

		System.out.println(ran);
		System.out.println(com);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 중에 입력해주세요.");
		int player = 0;
		
		
		
		String player1 = "";
		
		
		
				
		
	

		if (player == com) {
			System.out.println("비김");

		} else if ((player + 1) %3 == com) {
			System.out.println("패");
			
		} else {System.out.println("승");

		 

		}
	}

}

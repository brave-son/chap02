package sec01.exam02;

public class Exam01_1 {
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;

		int result1 = a + b + c;
		int result2 = a*b*c*d*e;
		

		System.out.println("1 + 2 + 3 의 연산 결과는" +"'" +result1 +"'"  + "입니다.");
		System.out.println("1 + 2 + 3 의 연산 결과는 \"" + (1+2+3) + "\"입니다.");
		System.out.println("1 ~ 5 까지의 곱셈 결과는" + result2 + "입니다.");

		// 코드 작성
		// System.out.println("1 + 2 + 3 의 연산 결과는 '6' 입니다");
		// System.out.println("1 + 2 + 3 의 연산 결과는 \"6\" 입니다");
		// System.out.println("1 ~ 5 까지의 곱셈 결과는 120 입니다");
	}
}

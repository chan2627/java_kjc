package day2;

public class Ex3_Arithmetic {

	public static void main(String[] args) {
		/*	산술 연산자 주의 사항1 : 나누기할 때 소수점(실수이기때문에) 사라지는 현상 조심 
		 *  
		 * 정수 연산자 정수 => 정수
		 * 5 + 2 = 7
		 * 5 - 2 = -3
		 * 5 * 2 = 10
		 * 5 % 2 = 1
		 * 5 / 2 = 2.5 = 0.5 사라짐
		 * 정수 연산자 실수 => 실수가됨
		 * 실수 연산자 실수 => 실수
		 * 실수 연산자 실수 => 실수
		 * 결과값이 어떤 수 
		 **/
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 % 2);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		System.out.println(5 / (double)2);
		// 산술 연산자 주의사항2 : 0으로 나눈 경우 예외발생할수있다
		System.out.println(5 / 0.0); // 실수 , infinity = 무한대
		System.out.println(5 % 0); // 0인경우, % 0 인경우 예외발생
		System.out.println(5 / 0); // 정수인경우 예외발생 ( 프로그램 중단 및 종료)
		System.out.println("프로그램 종료"); // 위 같은 경우로인한 이미 종료상태 , 명령어 먹질않음
		
		
		
	}

}

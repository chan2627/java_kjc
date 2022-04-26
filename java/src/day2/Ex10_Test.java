package day2;

public class Ex10_Test {

	public static void main(String[] args) {
		/* num가 짝수인지 아닌지 확인하는 코드를 작성하세요.
		 * a성적 출력하는 예제를 활용*
		 * 짝수는 num를 2로 (나누었을 떄 나머지)가 0과 같다.
		 * num 2 % 0 ==
		 * num % 2 == 0
		 */
		int num = 4;
		
		System.out.println(num + "는 짝수인가?" + true);
		System.out.println(num + "는 홀수인가?" + ! true);
		System.out.println(num + "는 짝수인가?" + ! (num % 2 == 0));
		/* num가 짝수이면 num 짝수라고 출력하고,
		 * num가 짝수가 아니면 num 짝수가 아님이라고 출력하도록 코드를 작성해보세요.*/ 
		 String str = (num % 2 == 0)?"짝수" : "홀수";
		 System.out.println(num +"는 "+str);
	}

}

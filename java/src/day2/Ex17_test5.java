package day2;

public class Ex17_test5 {

	public static void main(String[] args) {
		/* num가 2의 배수이면 2의 배수라고 출력하고
		 * 2, 4, 6 ,8 , 10
		 * num가 3의 배수이면 3의 배수라고 출력하고,
		 * 3, 6, 9, 12, 15
		 * num가 6의 배수이면 6의 배수라고 출력하고,
		 * 6, 12, 18, 24 ,30
		 *
		 * num가 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력하는 코드를 작성하세요
		 * 단, num가 6이면 6의 배수라고 출력해야합니다. 2의배수, 3의배수, 출력이 나오면 안됩니다.
		 * 
		 * 
		 * n의 배수 : num n으로 나누었을때 나머지가 0 과 같다
		 * 
		 */
		int num = 6;
		if (num % 6 == 0) { System.out.println(num + "은 6의 배수");}
		else if (num % 2 == 0) {System.out.println(num + "은 2의 배수");}
		else if (num % 3 == 0)  {System.out.println(num + "은 3의 배수");}
		else {System.out.println(num + "은 2, 3,  6의 배수가 아님");}
		
		
		
				
		

	}

}

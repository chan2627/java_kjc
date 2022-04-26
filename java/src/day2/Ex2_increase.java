package day2;

public class Ex2_increase {

	public static void main(String[] args) {
		/* 증강 연산자 : 최종적으로 1증가 또는 1감수
		 * 전위형 : ++변수명, 증가 후에 동작
		 * 후위형 : 변수명++, 동작 후 증가
		 */
			int num1 = 10, num2 = 10;
			//num1 : 전위형, num2 : 후위형
			System.out.println(num1 + ", " + num2);
			System.out.println(++num1 + ", " + num2++);
			System.out.println(num1 + ", " + num2);
			
			int num3 = 10, num4 = 10;
			//num1 : 전위형, num2 : 후위형
			System.out.println(num3 + ", " + num4);
			num3++; //++num3; // //num3 = num 3 + 1;
			System.out.println(num3 + ", " + num4);
			num4++;//++num4; // num4 = 1;
			System.out.println(num3 + ", " + num4);
			
	}

}

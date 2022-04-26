package day2;

public class Ex8_BitLogic {

	public static void main(String[] args) {
		/* 3  	00000011
		 * 10 	00001010
		 * 3&10 00000010 => 2
		 * 3|10 00001011 => 11
		 * 3^10 00001001 => 9
		 * ~3   11111100 => 4
		 * */
		
		byte num1 = 3;
		byte num2 = 10;
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1 );

	}

}

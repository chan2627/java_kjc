package day2;

public class EX15_Test3 {

	public static void main(String[] args) {
		/* Month가 주어질 때 해당 달의 마지막 일을 출력하는 코드를 if문으로 작성
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * 그 외의 월은 잘못된 월입니다. 
		 */
		int month = 2;
		if (month < 1 || month < 12) {
			System.out.println(month + "월은 잘못된 월입니다.");
		} else if(month == 2 ) {
			System.out.println(month + "월은 28일까지 있습니다.");
		} else if(month == 4 ) {
			System.out.println(month + "월은 28일까지 있습니다.");}
			else if(month == 6 ) {
			System.out.println(month + "월은 28일까지 있습니다.");}
			else if(month == 9 ) {
			System.out.println(month + "월은 28일까지 있습니다.");}
			else if(month ==11 ) {
			System.out.println(month + "월은 28일까지 있습니다.");}
			else {
				System.out.println(month + "월은 31일까지 있습니다.");
			}
		


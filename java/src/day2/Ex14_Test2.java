package day2;

public class Ex14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A : 는 90이상 ~ 100 이하
		 * B : 80 이상 ~ 90 미만
		 * C : 70 이상 ~ 80 미만
		 * D : 60 이상 ~ 70 미만
		 * F : 0 이상 ~ 60 미만
		 * 0미만, 100초과인 경우 잘못된 성적이라고 출력하도록 수정하세요.
		 */
		int score = 75;
		if (score >= 90 && score <=100 ) {
			System.out.println(score + " 점은 잘못된 성적이다 ");	
		else if (score >= 90) 
			System.out.println(score + "는 a학점");}
		else if (score >= 80) 
			System.out.println(score + "는 b학점");}
	}
				
				


			



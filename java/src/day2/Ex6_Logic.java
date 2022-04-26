package day2;

public class Ex6_Logic {

	public static void main(String[] args) {
		/* AND는 &&, ~ 하고, ~이고 둘다 정답이면 정답, 하나라도 거짓이면 거짓
		 * OR: ||, ~하거나, ~이거나, 둘다 거짓이면 거짓, 하나라도 정답이면 정답 
		 * XOR : ^, 둘다같으면 거짓, 다르면 정답
		 * NOT : !, 정답은 거짓, 거짓은 정답
		 */
		 /* 성적이 A학점인가? A학점의 기준 90점 이상이고 100점이하
		  * score가 90점 이상이고, score가 100점이하다
		  * score가 90점 이상 && score가 100점이하
		  * score가 >= 90이상 이고, score <= 100이하 
		  */
			int score = 105;
			System.out.println(score + " 점은 A학점인가? " + (score >= 90 && score <= 100));
			/* 잘못된 성적인가? 유효한 성적은 성적이 0점이상 100점이하
			 * 잘못된 성적은 성적이 0점 미만이거나 100점 초과 
			 * 성적이 0점 미만 || 100점 초과
			 * 성적은 score < 0 || score > 100
			 **/
			System.out.println(score + " 점은 잘못된 성적인가? " + (score < 0 || score > 100));
			/* 유효한 성적인가? 잘못된 성적의 반대
			 */
			System.out.println(score + " 점은 유효한 성적인가? " + ! (score < 0 || score > 100));
			
			
			
	}

}

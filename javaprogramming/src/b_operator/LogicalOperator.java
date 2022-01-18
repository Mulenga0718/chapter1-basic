package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = 0<x &&  x <10 || x< y;//비교연산이 논리 연산보다 우선순위가 높다. 우선순위: 산술연산> 비교연산> 비교연산;
		
		b = !(x < y); // 조건식의 결과를 반대로 저장한다. 
		
		// 효율적 연산(왼쪽 값부터 확인)
		b = true && true; //true 
		b = true && false;//false
		b = false && true;//false
		b = false && false;//false

		b = true || true;//true
		b = true || false;//true
		b = false || true;//true
		b = false || false;//false
			
		int a = 10;
		b = a<5 && 0< a++;
		System.out.println(a); // 11이 출력되어야 하지만 10이 출력.
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		b = x>y && x<10;
		System.out.println(b);
		//2. x가 짝수이고 y보다 작거나 같다.
		b = x%2==0 && x<=y;
		System.out.println(b);
		//3. x가 3의 배수이거나 5의 배수이다. 
		b = x%3==0 || x%5==0;
		System.out.println(b);
	}
}
package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		
		// 비교 연산자
		/*- <, >, <=, >=, ==, !=
		 *- 문자열 비교: equals() - 문자열은 참조형이기 때문에 주소를 갖는다. 그렇기에 ==를 사용하면 주소를 비교하고, equals를 사용하면 문자를 비교 
		 * */
		int x = 10;
		int y = 20;
		boolean b = x<y;
		System.out.println(b);
		b = x <= y - 15;//산술 연산 우선! 그 다음 비교 연산.
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "ABC";
		b = str1 == str2;
		System.out.println(b);
		b = !str1.equals(str2);
		System.out.println(b);
		System.out.println("=================================================================");
		// 다음의 문장들을 코드로 작성해주세요. 
		// x는 y보다 작거나 같다. 
		b = x<=y;
		System.out.println(b);
		// x+5와 y는 같다.
		b = x+5 == y; 
		System.out.println(b);
		// y는 홀수이다.
		b = y%2 == 1;
		System.out.println(b);
		// "기본형"과 "참조형"은 다르다.
		
		b = !"기본형".equals("참조형");
		System.out.println(b);
	}
}

package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 	
	 *  산술 연산자
	 *  - 사칙연산: +, -, *, /, %(나머지)
	 *  - 복합연산: +=, -=, *=, /=. %=
	 *  - 증감연산: ++, --
	 *  
	 */	
	
		int result = 10 + 20 - 30 * 40 / 50 % 60;
//		
//		result = 10/3;
//		System.out.println(result);
//		result = 10%3;
//		System.out.println(result);
//		
		// 5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요. 
//		int a = 10 + 20;
//		int b = 10 - 15;
//		int c = 32*12;
//		int d = 0/3;
//		int e = 4%2;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);				
//		
		// 복합연산
		result = result +3; 
		
		result += 3;
		
		result -= 5;
		
		result *= 2;
		
		result /= 3;
		
		result /= 3+2; // 오른쪽 항의 연산이 끝난 후에 연산이 이루어짐.
		
		// 아래의 문장을 복합연사자를 사용한 문장으로 만들어 주세요.
		
//		result = result + 10;
//		result = result % 5;
//		result = result - 2*3;
		
		result += 10;
		result %= 5;
		result -= 2*3;
		
		// 증감연산
		//증감연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다. 
		
		int i = 0;
		
		++i; //전위형: 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형: 변수의 값을 읽어온 후에 1 증가된다. 
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		
		// 피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = (double)_int+ _double;
		System.out.println(result2);
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short;// byte와 short모두 4byte가 안되기 떄문에 int타입으로 형변환 
		System.out.println(_int);
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;//char 또한 4byte가 안되기 때문에 int타입으로 형변환.
		System.out.println(_int);
		
		//오버플로우(가장 큰 값을 벗어남), 언더플로우(가장 작은 값을 벗어남)
		//표현 범위를 벗어나는 값을 표현할때 발생하는 현상 
//		byte b = 127;
//		b++;
//		System.out.println(b);// 가장 큰 값을 벗어나면 가장 작은 값이 됨.
//		b--;
//		System.out.println(b);
//		
		// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요. 
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		
//		int a = 123456;
//		int b = 654321;
//		int c = a+b;
//		int d = c*a;
//		int e = d/a;
//		int f = e-b;
//		int g = f%a;
//		System.out.println(c);
		// 3개의 int타입 변수를 선언 및 초기화 후 합계와 편균을 구해주세요. 
		
		
		int a = 5;
		int b = 10;
		int c = 11;
		int sum = a+b+c;
		double avg = (double)sum/3;
		System.out.println(sum);
		// 반올림 
		avg = Math.round(avg*10)/10;// 반올림 메서드(첫째소수점에서 반올림) 만일 2째소수점에서 반올림하려면 10곱하고 10나눠야함.
		System.out.println(avg);
		
		// 랜덤: math.random() - 0.0~1.0미만
		int random = (int)(Math.random()*100)+1;
		System.out.println(random);
		
		
		
	}
}




package a_variable;

import java.util.Scanner;

// import 단축키: ctrl + shift + o
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형변환(데이터 타입을 다른 타입으로 변경하는 것)
		int _int = 10;
		long _long = 20l;
		
		_int = (int)_long;
		_long = _int;// 표현범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다. 
		// 변수 3개를 선언해 변수 타입과 다른 타입의 값으로 초기화 해 보세요.
		
		int a = 10;
		long b = 200;
		char c = 'c';
		byte d = 123;
		double e = 1.3;
		float f = 1.3f;

		b = a;
		a =(int) b;
		e = f;
		f = (float)e;
		c = (char)d;
		System.out.print(a);
		System.out.println("안녕");	
		System.out.printf("출력 포멧 지정"); //출력 포멧 지정
		//실행 단축키: 컨트롤 + f11
		// 탈출문자
		System.out.println("앱은 \t4칸에 맞춰 띄워즙니다."); //\t: 탭
		System.out.println("줄바꿈을 \n해줍니다.");// \n: 줄바꿈
		System.out.println("\"쌍따옴표를 넣어줍시다\"");// \뒤의 쌍따옴표를 출력
		System.out.println("\\역슬래시를 넣어줍시다."); 
		
		// 입력
		Scanner sc = new Scanner(System.in);// 입력받기 위한 클래스 
		
		
		System.out.print("아무 수를 입력해주세요>");
		int num = sc.nextInt();
		System.out.println("입력받은 내용: " + num);
		System.out.print("아무 문자열이나 입력해주세요>");
		String str = sc.nextLine();
		System.out.println("입력받은 내용: " + str);
		System.out.println("입력 끝!");
		//nextInt에 버그 존재; 숫자열을 받고 문자열을 입력받을 수 없다. 
		//그래서 nextLine으로 숫자를 입력한 후에 숫자열 타입으로 변환 
		//Integer.parseInt(sc.nextLine()); 메소드 사용 
		
		System.out.print("아무 수를 입력해주세요>");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("입력받은 내용: " + num1);
		System.out.print("아무 문자열이나 입력해주세요>");
		String str1 = sc.nextLine();
		System.out.println("입력받은 내용: " + str1);
	
	
	} 	
}


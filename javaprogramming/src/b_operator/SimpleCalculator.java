package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 숫자와 연사자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하십시오 >");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("연산자를 입렵하십시오>");
		String ope = sc.nextLine();

		System.out.print("두번째 숫자를 입력하십시오 >");
		int b = Integer.parseInt(sc.nextLine());

		System.out.println(ope.equals("-") ? a - b
				: ope.equals("+") ? a + b
						: ope.equals("*") ? a * b : ope.equals("/") ? a / b : ope.equals("%") ? a % b : "확인불가");
	}

}

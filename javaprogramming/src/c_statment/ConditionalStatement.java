package c_statment;

import java.util.Random;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 조건문 -if문 -switch문
		 * 
		 * if문 
		 * -if(조건식){}:조건식의 결과가 true이면 블럭안의 문장을 수행한다. 
		 * -else if(조건식){}:다수의 조건이 필요할때 if뒤에 추가한다; 필요한 만큼 추가할 수 있다. 
		 * -else{}:조건식 이외의 경우를 위해 추가한다. 
		 * -조건식에서 여러개의 true일수도 있지만 이 중에서 하나만 실행된다.(맨위에 있는 조건만 실행)
		 */

		int a = 1;

		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 1) {
			System.out.println("a==1");
		} else if (a == 2) {
			System.out.println("a==2");
		} else {
			System.out.println("else");
		}

		// 점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 80;
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 점수에 등급을 부여
		score = 90;
		String grade = null;

		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(score + "점: " + grade);
		// 기본값: 자동으로 저장되는 값;
		// null: 참조형 타입의 기본 값;
		// 0: 기본형 타입의 기본 값;
		// false: boolean형 타입의 기본 값;

		// 점수에 +와 -등급을 매겨보자

		score = 90;
		grade = null;
		if (score >= 90 && score <= 100) {
			grade = "A";
			if (score > 97) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}

		} else if (score >= 80) {
			grade = "B";
			if (score > 87) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score > 77) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score > 67) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점: " + grade);

		/*
		 * switch문
		 * - switch(int/String){case 1: break;} 
		 * - 조건식의 결과는 정수와 문자열만(jdk1.7부터 문자열허용) 허용한다. 
		 * - 조건신과 일치하는 case문 이후의 문장을 수행한다.
		 * - break를 만나면 switch문을 나온다.
		 */

		a = 30;
		switch (a) {
		case 10:
			System.out.println("a==10");
			break;
		case 20:
			System.out.println("a==20");
			break;
			default: 
				System.out.println("default"); //switch문에서 else와 같은 역할!
		}
		//월에 해당하는 계절을 출력
		int month = 1;
		String season = null;
		switch(month) {
		case 3: 
		case 4:
		case 5: season = "봄"; break;
		case 6: 
		case 7:
		case 8: season = "여름"; break;
		case 9:
		case 10:
		case 11:season = "가을"; break;
		case 12:
		case 1:
		case 2:	season = "겨울"; break;
		}
		System.out.println(month+ "월: "+ season);
		// switch문을 사용해서 점수의 등급을 매기시오/
		 score = 95;
		 grade = null;
		switch(score/10) {
		case 10:
		case 9: grade ="A"; break;
		case 8: grade ="B"; break;
		case 7: grade ="C"; break;
		case 6: grade ="D"; break;
		default: grade = "F";
		}
		System.out.println(month+ "월: "+ season);
	
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요. 
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해주십시오.");
//		int num = Integer.parseInt(sc.nextLine());
//		if (num == 0) {
//			System.out.println("0입니다.");
//		} else if (num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		//1~100 사이의 랜덤한 값을 3개 발생시키고 합계, 평균, 등급을 출력해주세요. 
		
		Random ran = new Random();
		int num1 = ran.nextInt(101);
		int num2 = ran.nextInt(101);
		int num3 = ran.nextInt(101);
		
		double sum = num1+num2+num3;
		double avg = Math.round(sum/3.0*10)/10.0;
		grade = null;
		
		if (avg >= 90 && avg <= 100) {
			grade = "A";
			if (avg > 97) {
				grade += "+";
			} else if (avg <= 93) {
				grade += "-";
			}

		} else if (avg >= 80) {
			grade = "B";
			if (avg > 87) {
				grade += "+";
			} else if (avg <= 83) {
				grade += "-";
			}
		} else if (avg >= 70) {
			grade = "C";
			if (avg > 77) {
				grade += "+";
			} else if (avg <= 73) {
				grade += "-";
			}
		} else if (avg >= 60) {
			grade = "D";
			if (avg > 67) {
				grade += "+";
			} else if (avg <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("합계:"+ sum);
		System.out.println("평균:"+ avg);
		System.out.println("등급:"+ grade);
		
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요. 
		num1 = ran.nextInt(101);
		num2 = ran.nextInt(101);
		num3 = ran.nextInt(101);
		int t;
		
		if(num1>num2) {
		t = num1; num1= num2; num2 = t;  	
		}
		if(num2>num3) {
		t= num2; num2 = num3; num3 = t;	
		}
		if(num1>num2) {
		t = num1; num1= num2; num2 = t;  		
		}
		System.out.println(num1 +","+num2+","+num3);
		
		int max = num1;
		if(num2>num1) {max =num2;}
		if(num3>num2) {max =num3;}
		System.out.println(max);
		
			}
}
// 정렬: ctrl + shift + f

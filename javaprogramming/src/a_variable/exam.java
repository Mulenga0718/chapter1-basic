package a_variable;

import java.util.Random;
import java.util.Scanner;

public class exam {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
//		System.out.print("이름을 입력해 주십시오: ");
//		String name = sc.nextLine();
//		System.out.print("나이를 입력하십시오: ");
//		int age = Integer.parseInt(sc.nextLine());
//		System.out.println("당신의 이름은 " + name + "입니다.");
//		System.out.println("당신의 나이는 " + age + "세 입니다.");

		// 이름과 나이를 출력해주세요.
		// 숫자 맞추기 게임에서 숫자의 범위를 0~99로 변경하고
//	플레이어가 입력할 수 있는 횟수를 제한하도록 프로그램을 수정하자.
//	제한 횟수 내에 맞추지 못한 경우네는 정답을 표시하고 게임을 종료할 것
//
		int a;
		int b = ran.nextInt(100);
		System.out.println(b);
		System.out.println("숫자를 입력하십시오.");
		int c = 0;
		do {
			
			 do { 
				 System.out.println("0에서 99 사이의 숫자를 입력하십시오.");
				 a = Integer.parseInt(sc.nextLine());
			}while (a < 0 || a >= 100); 
			 if(!(a==b))System.out.println("틀렸습니다. 다시입력해주십시오");	
			 for(int i =0; ; i++) {c =i;}
			 
		} while(!(a == b) || c < 9);
		
	}
	

		}


			
			
		

	


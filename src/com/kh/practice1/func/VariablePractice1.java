package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	

	public void test1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();

		System.out.printf("키 %fcm인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
	}
	
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		
		
		System.out.printf("더하기 결과 : %d \n", a+b);
		System.out.printf("빼기 결과 : %d \n", a-b);
		System.out.printf("곱하기 결과 : %d \n", a*b);
		System.out.printf("나누기 결과 : %d \n", a/b);
		
		
	}
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double a = sc.nextDouble();
		System.out.print("세로: ");
		double b = sc.nextDouble();
		
		System.out.printf("면적 : %.2f \n", a*b);
		System.out.printf("둘레 : %.1f \n", (a+b)*2);
		
	}
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine(); //한번만 입력받기
		
		
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
		
	}
	
	
	
}

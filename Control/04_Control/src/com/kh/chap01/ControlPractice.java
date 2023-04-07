package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		// int menu = sc.nextInt();

//		switch(menu) { 
//		case 1: 
//			System.out.print("입력 메뉴입니다.");
//			break;
//		case 2: 
//			System.out.print("수정 메뉴입니다.");
//			break;
//		case 3: 
//			System.out.print("조회 메뉴입니다.");
//			break;
//		case 4: 
//			System.out.print("삭제 메뉴입니다.");
//			break;
//		case 7: 
//			System.out.print("프로그램이 종료됩니다.");
//			break;
//		}

		String menu = "";
		int num = sc.nextInt();
		switch (num) {
		case 1:
			menu = "입력";
			break;
		case 2:
			menu = "수정";
			break;
		case 3:
			menu = "조회";
			break;
		case 4:
			menu = "삭제";
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			return;

		}
		System.out.println(menu + "메뉴입니다.");

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		String season = "";
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.println(month + "월은 " + season + "입니다.");

	}

	public void practice5() {
		// 아이디 : minmin
		// 비밀번호 : Min1234

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 : ");
		String pwd = sc.next();

		// 로그인 성공하는 케이스 -> 1) id값이 minmin과 일치하고
		// 2) pwd값이 Min1234 두가지 모두 일치할때만 로그인 성공

		if (id.equals("minmin") && pwd.equals("Min1234")) {
			System.out.println("로그인 성공");
		}
		// 비밀번호 틀린 케이스
		else if (!pwd.equals("Min1234")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		// 아이디가 틀린 케이스
		else if (id.equals("minmin")) {
			System.out.println("아이디가 틀렸습니다.");
		} // if 각각 따로 쓰면 둘다

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요: ");
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요: ");
		double kg = sc.nextDouble();

		double bmi = kg / (m * m);
		String result = "";
		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}

		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		if (!(num1 > 0 && num2 > 0)) {
			practice8(); // 잘못입력했을때 자기자신 다시 출력
			return;
		}

		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);

		double result = 0;
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / (double) num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.printf("%d %c %d = %f", num1, op, num2, result);
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int finals = sc.nextInt();

		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();

		System.out.print("출석 회수 : ");
		int atd = sc.nextInt();

		double mid_result = mid * 0.2;
		double finals_result = finals * 0.3;
		double hw_result = hw * 0.3;
		double atd_result = atd;

		String pn;

		if (atd_result <= (20 * 0.3)) {
			pn = "Fail";
		} else if (mid_result + finals_result + hw_result + atd_result >= 70) {
			pn = "PASS";
		} else {
			pn = "Fail";
		}

		System.out.println("===================결과=====================");

		if (pn.equals("PASS")) {
			System.out.println("중간 고사 점수(20) : " + mid_result);
			System.out.println("기말 고사 점수(20) : " + finals_result);
			System.out.println("과제 점수(20) : " + hw_result);
			System.out.println("출석 점수(20) : " + atd_result);
			System.out.println("총점 : " + (mid_result + finals_result + hw_result + atd_result));
			System.out.println(pn);

		} else {
			System.out.println(pn + " [출석 회수 부족 (" + atd + "/20)]");

		}

	}

	public void practice11() {

/*		Scanner sc = new Scanner(System.in);

		System.out.print("비밀번호 입력(1000~9999) : ");
		long m = sc.nextLong();

		if (m >= 1000 && m <= 9999) {
			String n = m + ""; // string이니까 문자 뒤에 추가해줌
			if (n.charAt(0) != n.charAt(1) && n.charAt(1) != n.charAt(2) && n.charAt(2) != n.charAt(3)) {
				System.out.println("생성 성공");
			} else {
				System.out.println("중복 값 있음");
			}

		} else {
			System.out.println("자리수 안맞음");*/
			
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		int num = sc.nextInt();
		//String str = num +"";
		
		int thousand = num / 1000; // 1234 -> 1(1000의자리수)
		int hundred = (num % 1000) / 100; // 1234 -> 234 -> 2(100의자리수)
		int ten = ((num % 1000) % 100) / 10;
		int one = ((num % 1000) % 100) % 10;

		System.out.println("" + thousand + hundred + ten + one);

		if (num < 1000 || num > 9999) {
			System.out.println("자리수 안맞음");
		} else if (!(one == ten || one == hundred || one == thousand || ten == hundred || ten == thousand
				|| hundred == thousand)) {
			System.out.println("생성 성공");
		} else {
			System.out.println("중복 값 있음");
		}

		}
		

}
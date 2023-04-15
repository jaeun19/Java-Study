package home;

import java.util.Scanner;

public class D_control {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String menu ="";
		switch(num) {
		case 1: menu = "입력";
				break;
		case 2: menu = "수정";
			break;
		case 3: menu = "조회";
			break;
		case 4: menu = "삭제";
			break;
		default: 
			System.out.println("프로그램이 종료됩니다.");
			return;
		
		}
		System.out.printf(menu +" 메뉴 입니다.");
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수다");}
			else if(num%1==0) {
				System.out.println("홀수다");
			}
		}else {
		System.out.println("양수만 입력해주세요");
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();		
		
		int sum = kor+math+eng;
		double mean = sum/3;
		
		if(kor>=40 &&math >=40 && eng>=40 && mean >=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + mean);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void method4(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		String season = "";
		
		switch(num) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			return;
		}
		
		System.out.println(num+"월은 "+season+"입니다.");
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals("minmin") && pw.equals("Min1234")) {
			System.out.println("로그인 성공");
		}else if(id.equals("minmin") && !pw.equals("Min1234")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(!id.equals("minmin")&& pw.equals("Min1234")) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String id = sc.nextLine();
		
//		String result = "";
	
		
//		switch(id) {
//		case "관리자" :
//			result = "회원관리, 게시글 관리";
//		case "회원" :
//			result = "게시글 작성, 댓글 작성";
//		case "비회원":
//			result = "게시글 조회";
//			
			
		switch(id) {
		case "관리자" :
			System.out.print("회원관리 게시글관리 ");
		case "회원" :
			System.out.print("게시글작성 댓글작성 ");
		case "비회원":
			System.out.print("게시글조회");


		}
		//System.out.println(result);
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
			System.out.print("몸무게(kg)를 입력해 주세요 ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		System.out.println(bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi<23) {
			System.out.println("정상체중");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else if(bmi<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%)");
		char op = sc.next().charAt(0);
		
		
		
		double result = 0;
		if(num1>0 && num2>0) {
			if(op =='+') {
				result = num1 + num2;
			}else if(op == '-') {
				result = num1 - num2;
			}else if(op == '*') {
				result = num1 * num2;
			}else if(op == '/') {
				result = num1 / (double)num2;
			}else if( op == '%') {
				result = num1 % num2;
			}
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		System.out.printf("%d %c %d = %f",num1,op,num2,result);
		
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble()*0.2;
		
		System.out.print("기말 고사 점수 : ");
		double finals = sc.nextDouble()*0.3;
		
		System.out.print("과제 점수 : ");
		double assign = sc.nextDouble()*0.3;
		
		System.out.print("출석 회수 : ");
		double attend = sc.nextDouble() ;
		
		System.out.println("===========결과=============");
		
		
		double sum = mid+finals+assign+attend;
		
		String result = "";
		
		if(attend < 14 || sum < 70) {
			result = "fail";
		}else {
			result = "pass";
		}
		
		if (result.equals("pass")) {
			System.out.println("중간 고사 점수(20) :"+mid);
			System.out.println("기말 고사 점수(30) :"+finals);
			System.out.println("과제 점수 (30) : "+assign);
			System.out.println("출석 점수 (20) : " + attend);
			System.out.println("총점 : " +sum);
			System.out.println(result);
		}else {
			System.out.printf("%s [출석 회수 부족 (%.0f/20)]",result,attend);
		}
		
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을선택하세요.");
		System.out.println("1. 메뉴 출력\r\n"
				+ "2. 짝수/홀수\r\n"
				+ "3. 합격/불합격\r\n"
				+ "4. 계절\r\n"
				+ "5. 로그인\r\n"
				+ "6. 권한 확인\r\n"
				+ "7. BMI\r\n"
				+ "8. 계산기\r\n"
				+ "9. P/F");
		System.out.println("선택 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1: method1();break;
		case 2: method2();break;
		case 3: method3();break;
		case 4: method4();break;
		case 5: method5();break;
		case 6: method6();break;
		case 7: method7();break;
		case 8: method8();break;
		case 9: method9();break;
		}
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("비밀번호 입력(1000~9999) : ");
		int num = sc.nextInt();

		boolean duplicate = false;

		if (num < 1000 || num > 9999) {
			System.out.println("자리수 안 맞음");
			return;
		}

		int[] arr = new int[4];
		arr[0] = num / 1000;
		arr[1] = (num % 1000) / 100;
		arr[2] = ((num % 1000) % 100) / 10;
		arr[3] = ((num % 1000) % 100) % 10;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (duplicate == true) {
				System.out.println("중복값있음");
			} else {
				System.out.println("성공");

			}
		}

	}
	

	public static void main(String[] args) {
		D_control c = new D_control();
		//c.method11();
	}

}

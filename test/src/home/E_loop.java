package home;

import java.util.Scanner;

public class E_loop {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			method1();
		}
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
		}
		
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			method2();
		}
		for(int i=num;i>=1;i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i != num) {
				System.out.print(i + " + ");
				sum += i;
			} else {
				sum += num;
				System.out.print(num + " = " + sum);
			}
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번쨰 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();
		//sc.nextLine();
		
		int min = 0;
		int max = 0;
		
		if(num1 <1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			method4();
			return;
			
		}else if (num1 > num2) {
			max = num1;
			min = num2;
		}else if(num2 > num1) {
			max = num2;
			min = num1;
		}
		
		for(int i=min;i<=max;i++) {
			System.out.print(i+" ");
		}
		
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			method5();
			return;
		}

		for (int i = num; i <= 9; i++) {
			System.out.println("====" + i + "단====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}

		}

	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		for(int i=start;i<=start+(9*num);i+=num) {
			System.out.print(i+" ");
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		if(op.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt(); 	
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		
		
		
		int result = 0;
		switch(op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				method7();
				return;
			}
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			method7();
			return;
			
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,result);
		
	}
	
	public void method8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num ;i > 0;i--) { // 4 3 4 1
			for(int j=0; j < i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 1234
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<=num;i++) { //1234
			for(int j=0 ; j < i ;j++) {
				System.out.print(" ");
			}
			for(int j=num;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		E_loop e = new E_loop();
		//e.method11();
	}

}

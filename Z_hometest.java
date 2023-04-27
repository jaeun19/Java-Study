package home;

import java.util.Scanner;

public class Z_hometest {
	public void method1(){
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("입력 ");
		int a = sc.nextInt();
		
		if(a >= 1) {
			for(int i = 1; i <=a; i++) {
				System.out.print(i);
			}
		}else {
			System.out.println("1 이상의 숫자를 입력");
			method1();
			
		}
		
		//왜안돼
	}
	
	public void method2(){
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("입력 ");
		int a = sc.nextInt();
		
		if(a >= 1) {
			for(int i = a; i >= 1; i--) {
				System.out.print(i);
			}
		}else {
			System.out.println("1 이상의 숫자를 입력");
			method2();
		}
	}
	
	public void method3() {
        Scanner sc = new Scanner(System.in);
	
		
		System.out.print("입력 ");
		int a = sc.nextInt();
		
	
		int sum = 0;
		
		for(int i =1; i<=a; i++) {
			if(i == a) {
				System.out.print(i + "=");
			}else {
				System.out.print(i + "+");
			}
			sum+=i;
		}
		System.out.print(sum);

		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("첫번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 || num2 >= 1) {
			for(int i= num1; i <= num2; i++) {
				System.out.print(i);
			}
		}else {
			System.out.println("1 이상의 숫자 입력해주세요");
			method4();
		}
		
		
	}
	
	public void method5(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("9 이하의 숫자 입력");
		int dan = sc.nextInt();
		
		if(dan>9) {
			System.out.println("다시입력해주세요");
			method5();
		}else {
			for(int i = dan; i <=9;i++) {
			System.out.printf("====%d단==== \n",i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,dan * j);
			}
		}
		}
		
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작숫자: ");
		int start = sc.nextInt();
		System.out.println("공차:");
		int gong = sc.nextInt();
		
		int count  = 1;
		for(int i = start; count <= 10; i+=gong ) {
			System.out.print(i);
			count ++;
		}
		
		
	}
	
	public void method7(){
		int[] arr = new int[10];
		
		for(int i =0;i<arr.length;i++) {
			arr[i]= 10-i;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		
		int[] arr = new int[size];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]+=1+i;
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public void method9() {
		int []arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		String []arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int a = sc.nextInt();
		
		String result = "";
		switch(a) {
		case 1: result=arr[0];break;
		case 2: result=arr[1];break;
		case 3: result=arr[2];break;
		case 4: result=arr[3];break;
		case 5: result=arr[4];break;
		case 6: result=arr[5];break;
		default: System.out.println("잘못입력하셨습니다.");
		}
		
		System.out.println(arr[a]+"요일");
		
		
	}
	
	public void method11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int size = sc.nextInt();
		
		int[]index = new int[size];
		int sum = 0;
		
		for(int i =0; i<size;i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			index[i]=sc.nextInt();
			sum += index[i];
		}
		for(int i=0;i<index.length;i++) {
			System.out.println(index[i]+" ");
			
			
		}
		System.out.println(sum);
		
		
		
	}
	public void method12() {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		String num = sc.nextLine();
	
		String result = "";
		switch(num) {
		case "일":
			result = "일,일";
		case "이":
			result = "이,이";
		case "삼":
			result = "삼,삼";
		}
		System.out.println(result);
		
	}
	public void method13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번쨰 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // num2 입력 후 개행문자 제거

		int min = 0;
		int max = 0;

		if(num1 < 1 || num2 < 1) {
		    System.out.println("1 이상의 숫자를 입력해주세요");
		    method4();
		} else if (num1 > num2) {
		    max = num1;
		    min = num2;
		} else if(num2 > num1) {
		    max = num2;
		    min = num1;
		}

		for(int i = min; i <= max; i++) {
		    System.out.print(i + " ");
		}

	}
	public void method14() {
		int[] arr = new int[3];
		System.out.println(arr);
		arr = new int[4];
		
		System.out.println(arr);
		System.out.println(arr.toString());
	
	}
	public void method15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("색깔을 입력하세요 : ");
		String color = sc.nextLine();
		//scr.paintColor(color);
		System.out.println("색이 수정되었습니다.");
		
	}
	
	public void method16() {
		
	}
	
	
	

	public static void main(String[] args) {
		Z_hometest h = new Z_hometest();
		//h.method15();

	}
	


}

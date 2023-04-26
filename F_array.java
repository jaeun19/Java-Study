package home;

import java.util.Scanner;

public class F_array {

	
	public void method1() {
		int[] arr= new int [10];
		
		
		for(int i=0;i<10;i++) {
			arr[i]=10-i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0;i<num;i++) { // 배열 인덱스
			arr[i]=i+1; // 값 넣는거 
		}
		for(int i=0;i<num;i++) { // 다시 꺼내야하니까 !
			System.out.print(arr[i]);
		}
		
		
	}
	public void method3() {
		int[] arr= new int[10];
			for(int i=0;i<arr.length;i++) {
				arr[i]=(int)(Math.random()*10+1);
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();	
		
		char arr[] =  {'월','화','수','목','금','토','일'};		
		
		if(num>=0 && num <=6) {
				System.out.println(arr[num] + "요일");
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		

	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int arr[] = new int[num];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("총 합 : " + sum);
		
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String word = sc.nextLine();
		char[] arr = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(i);
		}
		for (int i = 0; i < word.length(); i++) {

			if (i == word.length() - 1) {
				System.out.println(arr[i]);
			}else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println("문자 개수 : " + word.length());
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String word = sc.nextLine();
		
		System.out.println("문자 : ");
		char ch = sc.next().charAt(0);
		
		String []arr = new String[word.length()];
		int count = 0;
		
		//for(int i=0;i<arr.length;i++) {
			//if( == ch) {
				
		//	}
	//	}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		F_array a= new F_array();
		//a.method6();
	

	}

}

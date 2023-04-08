package com.kh.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 		ex) int a = 10;
	 * 		    a = 20;
	 * 			
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음(같은 자료형의 값으로만 가능)
	 * 		 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김(인덱스는 항상 0부터 시작)
	 * 		예) int[] a = new int[3]; // int형의 자료가 들어갈 수 있는 방을 3개 만든다.
	 * 								 // 방 [0][1][2]를 만든 것
	 * 								 // 인덱스는 항상 0부터 시작한다
	 * 								 // 배열의 크기 = 3, 마지막 인덱스 2
	 * 								 // 배열의 크기 = 5, 마지막 인덱스 4
	 * 								 // 문자열의 길이 = 5, 마지막 인덱스 4
	 * 								 // 항상 크기(길이) = n, 마지막 인덱스 = n-1
	 * 			a[0] = 1;
	 * 			a[1] = 2;
	 * 			a[2] = 3;
	 * 
	 */
	
	public void method1() {
		// 배열을 왜 써야 할까?
		// 변수만을 가지고 프로그래밍을 하게 되었을때.....
		// 0, 1, 2, 3, 4의 값을 기록하려고 함
		// 변수로 이용하면 각각의 데이터를 보관하고자 할때 각각의 변수를 만들어서 따로 관리해야함.
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		//저장된 값들을 출력하고자 할때, 반복문 사용 불가
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		

	
		// 만약 기록해야하는 변수가 100, 1000개로 늘어난다면?
		
		// 배열을 가지고 프로그래밍하기
		// 0, 1, 2, 3, 4 기록하기
		
		/*
		 * 1. 배열 선언
		 * [표현법] -> 선언방법이 또있음
		 * 자료형 [] 변수명;
		 * 자료형 변수명 [];
		 * 
		 * int a; //변수 선언
		 * int [] arr; //배열선언
		 * int arr [];
		 * 
		 * 
		 * 2. 배열 할당
		 * 이 배열에 몇 개의 값들을 보관할건지 배열의 크기를 지정해주는 과정이 필수.
		 * 지정한 갯수만큼 값이 들어갈 수 있는 방(인덱스)가 만들어진다. 
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 * 
		 * arr = new int[5];
		 * 
		 * 배열도 선언과 동시에 할당 
		 */
		int[] arr = new int[5];
		
		/*
		 * 3. 배열의 각 이덱스(방번호)자리에 값을 대입
		 * [표현법]
		 * 배열명[인덱스] = 값;
		 * 
		 * arr[0] = 0;
		 * arr[1] = 1;
		 * arr[2] = 2;
		 * ...
		 * arr[n] = x;
		 * 
		 * 배열의 가장 큰 장점 : 반복문을 활용할 수 있음.
		 */
		
		for (int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		// 배열의 출력(출력시에도 반복문 활용가능)
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번 인덱스의 값 : %d", i, arr[i]);
		}
		/*
		 * 각각의 인덱스값을 확인하기위해서 []블럭을 사용 해야함
		 * 그럼 arr안에 들어간 전체 값을 확인하고싶다면??
		 */
		System.out.println();
		System.out.println(arr); // 주소값 : [I@1888ff2c
		
	}
	public void method2() {
		
		int[] iArr = new int[5];
		
		System.out.println("iArr : " + iArr);
		System.out.println("iArr의 해시코드값 : " + iArr.hashCode()); //주소값 10진수 바꾸는거 
		
		double[] dArr = new double[3];
		System.out.println("dArr : " + dArr);
		System.out.println("dArr의 해시코드값 : "+ dArr.hashCode());
		
		/*
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)
		 * => 실제 값(리터럴)을 바로 담을 수 있는 변수 => 일반변수
		 * 
		 * 그 외 모든 자료형(int[], double[], short[],...String, Scanner,...)
		 * => 주소값을 담고 있는 변수 => 참조 변수(레퍼런스 변수)
		 * 
		 * String은 특이한놈 
		 */
	}
	
	public void method3() {
		
		int[] iArr = new int[5];
		double[] dArr = new double[3];
		// 배열선언 후 크기만 지정한 상태
		// 그럼 각각의 인덱스값 어떤식으로 값이 초기화 되어있나 확인
		
		for(int i = 0; i<3; i++) { //0, 1, 2
			System.out.println(iArr[0]);
		}
		for(int i = 0; i<3; i++) { //0, 1, 2
			System.out.println(dArr[0]);
		}
		// 내가 각 인덱스에 값을 초기화 하지 않았는데도 값들이 담겨있음.
		// 누가 담아주냐 ? jvm
		// heap이라는 영역에 절대로 빈공간이 존재할 수 없기 때문.
		// 따라서 jvm이 각 공간에 기본값으로 초기화(대입)를 해준다.

//		int i; 
//		System.out.println(i);  -> 에러남 
		
		// 배열의 크기를 아는 방법
		System.out.println("iArr배열의 크기 : " + iArr.length);
		System.out.println("dArr배열의 크기 : " + dArr.length);
		
		
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i]);
		}
	}
	public void method4() {
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		//arr[5] = 6;
		//ArrayIndexOutBoundsException : 5 index ~~ length 5
		// 배열의 인덱스 볌위를 벗어난 오류. 길이 5짜리 배열에는 5라는 인덱스가 존재하지 않음.
		
		// 값 대입을 위한 for문
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
 		//System.out.println(arr); //자바는 주소값 나옴. 다른건 안그럼
 		for(int i =0; i<arr.length; i++) { 
 			System.out.println(arr[i]);
 		}
	}
	
	public void method5() {
		
		int result = 0; //int형 자료형의 기본값 0
		
//		String str= null;
//		Scanner sc = null;
		int [] arr = null; // 주소값을 담을 수 있는 변수의 기본값은 null;
		
		System.out.println(arr);
		/*
		 * 기본값이 null인 변수를 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자한다면
		 * 무조건 오류발생 => NullPointerException
		 * ex) arr.hashcode(), arr.length, arr[0]....
		 * 
		 */
	}
	
	public void method6() {
		
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		//대입
		
		//출력 -> 한줄로 공백을 추가해서 출력해주기
		int value = 2;
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			//arr[i] = 2*(i+1);
			arr[i] = value;
			value+= 2;
			System.out.print(arr[i] + " ");
		}
	    
		//arr[5] = 6;
		/*
		 * 한번 지정한 배열의 크기는 변경불가
		 * =>배열의 크기를 변경해서 더 많은 값을 넣고자한다면, 어쩔수 없이 새로운 배열을 만들어줘야함
		 */
		System.out.println();
		System.out.println(arr.hashCode());
		
		arr = new int[7];// 0 0 0 0 0 0 초기화
		System.out.println("====arr 변경 후 ====");
		System.out.println(arr.hashCode());
		
		
		/*
		 * 항상 고유한 주소값 부여, 기존에 생성된 주소와 절대로 겹치지 않는다. 
		 * 기존의 참고하고 있던 연결이 끊기고 새로운 곳 참조.
		 * 
		 * 연결이 끊어진 기존의 배열은 ? heap영역 안에 둥둥 떠다님.
		 * 일정시간이 지나면 가바지 컬렉터(GC)가 삭제시켜줌 : 자동 메모리 관리
		 * => 자바에서 자동메모리관리 특징. 개발자가 코드에만 신경쓸수 있게 도와줌 
		 */
		
		// 현재 연결되어있는 연결고리를 끊고자 할때 
		
		arr = null; //null 아무것도 존재하지 않음을 의미.
		
	}
	
	public void method7() {
		
		// 배열 선언과, 크기지정(할당)과 초기화(값대입)까지 한방에 끝내는 방법
		
		// 방법 1.
		int [] arr1 = new int[] {1,2,3,4}; // 배열선언, 크기 4이면서 0번인덱스=1, 1번인덱스=2
		
		// 방법 2.
		int [] arr2 = {1,2,3,4};
		
		//배열 비교
		System.out.println(arr1 == arr2); //주소값과 주소값의 비교이기 때문에 항상 false가 나옴
	}
	
	public void method8() {
		//1. 크기 10짜리 정수배열 선언
		//2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값대입(값: 1~100 랜덤값)
		//3. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 배열에 담긴 값을 출력
		//출력예시) arr[x] : xx
		
		//1
		int []arr = new int[10];
		
		//2
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			
		//3
			System.out.println("arr["+i+"] :"+ arr[i]);
			
		}
	}
	
	public void method9() {
		// 1. 사용자에게 매번 배열의 길이의 정보를 입력받은 후, 해당크기만큼 문자열 배열 생성
		
		// 2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매 인덱스자리에 추가하시오.
		
		// 3. 입력완료 후 배열안에 저장되어있는 과일명을 출력
		
		
		Scanner sc = new Scanner(System.in);// while문 안에 넣으면 용량 비효율적
		
		while(true){
			System.out.print("배열의 길이를 입력 : ");
			int size = sc.nextInt(); 
			sc.nextLine();
			if(size==0) {//배열의 길이가 0이라면 반복문 종료.
				break;
		   }
			String []arr = new String[size];
			for(int i = 0; i <arr.length; i++) {
				System.out.print("과일명 : ");
				String fruit = sc.nextLine();
				arr[i] = fruit;
			}
			for(int i = 0; i < arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
	
	}
	public void method10() {
		// 사용자에게 문자열 하나 입력받은 후
		// 각각의 문자들을 char배열에 옮겨담기
		
		//1. 사용자에게 문자열 입력받기
		
		//2. char 배열 생성( 배열의 크기 == 문자열의 길이만큼)
		
		//3. 문자열에서 각 인덱스별로 문자를 뽑아서 char배열의 동일한 인덱스에 담아주기
		
		//4. char 배열의 각 인덱스에 값이 잘담겨있나 출력해보기
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String word = sc.nextLine(); // apple
		
		
		char[] arr = new char[word.length()]; //5 size
		
		for(int index=0; index<arr.length; index++) {
			arr[index]=word.charAt(index); // arr[0]= 'a'
		}
		
		for(int index=0; index<arr.length; index++) {
			System.out.print(arr[index] + " ");
			
		}
		
	}
	public void method11() {
		// 사용자에게 배열의 길이를 입력받은 후 해당 크기만큼의 정수배열 생성
		// 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입
		// 대입할 값은 매번 발생하는 랜덤값(1~100)
		// 반복문을 활용해서 0번 ~ 마지막 인덱스까지 배열에 담긴 값ㅇ르 출력함과 동시에 해당 인덱스에 담긴 값이
		// 짝수인 값들의 총 합을 구하기
		
		// 출력예시 : arr[x] : x
		
		// 총합 : xx
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 길이: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int sum = 0;
		for(int i= 0; i < size; i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.println("arr["+i+"] : " + arr[i]);
			if(arr[i] %2 == 0) {
				sum += arr[i]; // i = 01234  / arr[i] = 값
			}
		}
		System.out.println("총합 + " + sum);	
	}
	
}

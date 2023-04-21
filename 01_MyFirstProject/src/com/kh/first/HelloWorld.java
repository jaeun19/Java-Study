package com.kh.first; // 패키지 선언부
// 패키지 선언시 2단계까지는 도메인의 역순으로 작성한다.
// ex) kh.com => com.kh, naver.com => com.naver

public class HelloWorld {


	/*
	 * 주석으로 변경하고 싶으면 ctrl+shift+/
	 */

//	1 crtl+shift+c 두번째 방법
//	2
//	3 코드를 정렬시키는 방법은 ctrl+shift+f
	
	
	/*
	 * 메인 메소드는 자바애플리케이션, 자바 프로그램 실행시 시작되는 시작점이다(entry point)
	 * 
	 * 따라서 하나의 Java애플리케이션에는 반드시 1개 이상의 main메소드를 포함한 클래스가 있어야한다.
	 */

	
	public static void main(String[] args) {
		//출력문. 콘솔창 () 안에 들어간 값을 출력해주면서 한줄 엔터를 쳐준다.
		System.out.println("Hello world");
		System.out.println("한글도 되나? 되네");
	}

}



package com.kh.chap04_field;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;

public class Run {

	public static void main(String[] args) {
		//------------------1. FieldTest ------------------
		FieldTest1 ft1 = new FieldTest1();
		//객체생성시점에 global 필드할당 (heap)
		
		//ft1.test(5);
		//test메소드 호출시 생성되는 변수 : num, l, a (stack)
		//test메소드 호출 종료시 num, l, a라는 변수는 소멸 
		
		ft1 = null; // 객체 소멸사 global 필드도 소멸
		
		
		
		//System.out.println(ft1.pro); 같은 패키지가 아니므로 접근 불가. 만약 상속받았다면 접근가능
		//System.out.println(ft1.df);  같은 패키지가 아니므로 접근 불가.
		
		
		//----------------------------------------------
		//FieldTest2 ft2 = new FieldTest2(); //원래는 힙 메모리 안에 필드가 생성되어있어야함 		
		
		System.out.println(FieldTest2.sta); //그러나 static은 이미 스택에 생성되어있기 때문에 객체생성 필요없음 
		// sta 라는 static변수를 호출하기위해서는 객체 생성으 할필요가 없고
		// 다만 어느 클래스에 있는 sta변수인지 명화하게 클래스명만 기술해주면 됨.
		
		FieldTest2.test();
		
		
	
	
	}

}

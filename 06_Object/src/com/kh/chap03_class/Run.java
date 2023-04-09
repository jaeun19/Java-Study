package com.kh.chap03_class;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;
//com.kh.chap03_class.model.vo.Person p = new Person();

public class Run {

	public static void main(String[] args) {

		
		//Person이라는 클래스 == 나만의 자료형(여러개의 자료형의 여러개의 값들을 보관) == 사용자 정의 자료형
		
		//System.out.println(p);
		
		Person p = new Person();
		p .setMemberId("id");
		p.setMemberPwd("pass");
		p.setMemberName("자은");
		
		p.changeName("김자은");
		p.printName();
		
		
		//System.out.println(p);
	
		
		// 상품객체 생성
		
		//상품객체에 상품명 아이폰14로 초기화
		//상품객체의 가격을 1500000 초기화
		//브랜드: 애플
		
		//상품객체에 상품명 갤럭시z-plip4로 초기화
		//상품객체의 가격을 1000000원으로 초기화
		//브랜드: 삼성
		
		//초기화한 상품정보를 모두 출력
		
		Product i = new Product();
		Product s= new Product();
		
		
		i.setpName("아이폰14");
		i.setPrice(1500000);
		i.setBrand("애플");
	
		s.setpName("갤럭시z-plip4");
		s.setPrice(1000000);
		s.setBrand("삼성");
		
		System.out.println(i);
		System.out.println(s);
	
	
	
	
	}
	
	
	
	

}

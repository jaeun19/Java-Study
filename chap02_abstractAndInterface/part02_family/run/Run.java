package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// Person p = new Person(); // 객체생성 불가 - 추상클래스이기때문에   
		
		Person p1 = new Mother("ㅇㅇ", 50, 70, "입양");
		Person p2 = new Baby("응애",3.5,70);
		
//		p1.eat(); //엄마 : 몸무게 +10 건강도 -10
//		p2.eat(); //애기 : 몸무게 +3, 건강도 +1
//		p1.sleep(); // 엄마 : 건강도 +10
//		p2.sleep(); // 엄마 : 건강도 +5
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
		//인터페이스 적용 후
		Basic b1 = new Mother("ㅇㅇ",60,70,"입양");
		Basic b2 = new Baby("애기",3.4,55);
		
		System.out.println(b1);
		System.out.println(b2);
	
	
	
	}
	
	

}

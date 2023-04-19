package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Football extends Sports{
	
	@Override
	public void rule() { // 자식클래스에서 재정의 해줘야함 
		System.out.println("발로 공을 차서 골대에 넣어야 한다.");
	}
	

}

package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic{
	
	private String babyBirth; // 아기의 탄생여부 : 출산, 입양, 없음
	
	public Mother() {
		
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + "]";
	}
	
	@Override
	public void eat() { // 상속 받았으니 부모 클래스의 메소드 구현해야함 (몸통완성)
		 //엄마가 밥을 먹으면?
		// 몸무게가 기존의 몸무게에서 10 증가
		super.setWeight(super.getWeight()+10);
		//건강도는 기존의 몸무게에서 10 감소
		super.setHealth(super.getHealth()-10);
	}
	
	@Override
	public void sleep() {
		// 건강도 10 증가
	super.setHealth(super.getHealth()+10);

	}

	
}

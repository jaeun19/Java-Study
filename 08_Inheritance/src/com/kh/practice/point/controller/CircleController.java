package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	
	public String calcArea(int x, int y, int radius) {
		
		
		c = new Circle(x, y, radius);
		
		return "면적 : " + c.toString() + " / " + Math.PI * radius*radius; // string 
		// 프린트문에서 알아서 생성해주기때문에 toString을 여기서 써주고 넘겨주거나 안쓰건 상관없음 
	}
	
	
	
	public String calcCircum(int x, int y, int radius) {
		
		
		c = new Circle(x, y, radius);
		
		return c.toString() + " / " + Math.PI * radius*2;
		
		
	}
	

}

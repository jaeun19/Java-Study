package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		// 매개변수들을 이용하여 필드들을 초기화. 초기화한 정보와 면적 반환
		r =  new Rectangle(x,y,height,width); // 받아오는거 잘봐야함
		return r + " / " +( height*width);
	}
	
	public String calcPerimeter ( int x, int y, int height, int width) {
		r =  new Rectangle(x,y,height,width); // 받아오는거 잘봐야함
		return r + " / " + 2*(height+width);
		
	}

}

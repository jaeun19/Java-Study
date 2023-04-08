package com.kh.practice.dimension;

import java.util.Arrays;

public class DinensionPractice {
	
	public void practice4() {
		int[][]arr = new int[4][4];
		
		//0행 0열부터 2행 2열까지는 1~10사이의 임의의 정수값을 저장하시오
		
		for(int i = 0; i<3;i++) { //0행, 1행, 2행 반복
			for(int j = 0; j<3; j++) {
				arr[i][j]= (int)(Math.random()*10 +1);
				
				arr[i][3] += arr[i][j];
				arr[3][i] += arr[j][i];
				
				arr[3][3] += arr[i][j];
				
				
			}
		}
		

			for( int i=0; i<arr.length;i++) {
				System.out.println(Arrays.toString(arr[i]));
				
				
				//다시 풀어보기
				
			}
		
	
	
	}
	
	
	public void practice6() {
		String [][]strArr= new String[][]{{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};

			
			
			for(int i=0; i<strArr.length;i++) {
				for(int j=0;j<strArr[i].length;j++) {
					System.out.print(strArr[j][i]);
				}
				System.out.println();
			}
			
	}
	
	public void practice8() {
		
		
		String []arr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] class1 = new String[3][2];
		String[][] class2 = new String[3][2];
		
		int index = 0;
		System.out.println("== 1분단 ==");
		for(int i=0;i<class1.length;i++) {
			for(int j=0; j<class1[j].length;j++) {
				class1[i][j] = arr[index++];
				System.out.print(class1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0;i<class2.length;i++) {
			for(int j=0; j<class2[i].length;j++) {
				class2[i][j] = arr[index++];
				System.out.print(class2[i][j] + " ");
				
			}
			System.out.println();
				
		}
	
	}

}

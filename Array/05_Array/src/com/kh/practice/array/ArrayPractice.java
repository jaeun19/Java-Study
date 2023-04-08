package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	//6, 10, 12번 예제
	
	public void practice6() {
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char [] arr = new char[str.length()];
		for(int i=0; i<arr.length;i++) {
			arr[i] =str.charAt(i);
		}
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		
		
		for(int i=0;i<arr.length;i++) {
			
			boolean isDupiacate = false;
			for(int j = 0; j< i; j++) {
				if(arr[i] == arr[j]) {
					isDupiacate = true;
					break;
				}
			}
			if(!isDupiacate) {
				System.out.print(arr[i]+ (i == (arr.length-1)?"":", "));
				count++;
			}
			
		}
		System.out.println("\n문자개수 : " + count);		
	}

	
	public void practice10() {
		
		int [] arr = new int[10];
		int [] checkedArr = new int[11];
		
		for(int i = 0;i<arr.length;i++) {
			int random = (int)(Math.random()*10+1);
			if(checkedArr[random] == 1) {
				i--;
				continue;
			}
			arr[i] = random;
			checkedArr[random] = 1;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void practice12() {
		
		System.out.print("배열의 크기를 입력하세요");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		String[] copy = null;
		
		
		int i = 0;
		while(true){
			if( i == size) {
				System.out.print("더 값을 입력하시겠습니다?(Y/N) : ");
				char ch = sc.nextLine().charAt(0);
				if(ch =='y'||ch == 'Y') {
					System.out.print("더 입력하고 싶은 개수 : ");
					int num = sc.nextInt();
					sc.nextLine();
					
					//arr배열은 꽉 참. 카피본 배열 
					copy = new String[size + num];
					size += num;
					for(int j = 0; j<arr.length; j++) {
						copy[j] = arr[j]; //늘린거에 넣는거 
					}
					
					arr = copy; //원본 출력하고싶으니까 
					
				}else {
					break;
				}
			}
			arr[i] = sc.nextLine();
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}

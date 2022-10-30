package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		for(int i=9; i>=0; i--) {
			arr[i] = 10-i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
	public void practice4() {
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] str1 = new char[str.length()];
		for(int i =0; i<str1.length; i++) {
			str1[i] = str.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i=0; i<str1.length; i++) {
			if(str1[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num<0 || num>6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		for(int i=0; i<day.length; i++) {
			if(num == i) {
				System.out.println(day[i] + "요일");
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];
				
				/*
				 * 5입력시 => {1,2,3,2,1}		=> 2번 인덱스까지 증가 그 이후부터 감소
				 * 7입력시 => {1,2,3,4,3,2,1}	=> 3번 인덱스까지 증가 그 이후부터 감소
				 * 9입력시					=> 4번 인덱스까지 증가 그 이후부터 감소
				 * 							=> 배열의 길이 / 2 인덱스까지 증가 그 이후부터 감소
				 * 
				 */
				
				int value = 1;
				for(int i=0; i<arr.length; i++) {
					arr[i] = value;
					if(i<arr.length / 2) {
						value++;
					}else {
						value--;
					}
				}
				
				for(int i =0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}

		}
				
		
		
	}
	
}

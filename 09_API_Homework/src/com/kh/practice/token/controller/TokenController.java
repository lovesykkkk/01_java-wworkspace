package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	// 기본생성자
	public TokenController() {}
	
	// 매개변수로 받아온 str을 StringTokenizer를 이용하여
	// 띄어쓰기를 없애고 없앤 문자열 반환
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		int count = stn.countTokens();
		String newStr = "";
		for(int i=0; i<count; i++) {
			newStr += stn.nextToken();
		}
		return newStr;
	}
	
	
	// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input){
		String upper = input.substring(0,1).toUpperCase();
		String lower = input.substring(1,input.length()).toLowerCase();
		return upper + lower;
	}
	
	public int findChar(String input, char one){
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		char[] arr = input.toCharArray();
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		return count;
		
	}
	
	public int findChar2(String input, char one){
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		String sOne = one + "";
		char[] arr = input.toCharArray();
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			char ch = arr[i];
			String str = ch + "";
			
			if(str.contains(sOne)) {
				count++;
			}
			
			
		}
		return count;
		
	}

	
	

}

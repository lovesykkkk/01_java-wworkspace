package com.kh.chap03.branch;

public class A_Break {
	
	/*
	 * break; 	: 반복문 안에 사용 되는 분기문
	 * 			  break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 *  * 유의 사항 : switch문안의 break; 는 단지 switch문만을 빠져나가는 구문
	 */
	
	
	public void method1() {
		
		// 랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이과정 매번 반복)
		// 단, 발생된 랜덤값이 3의 배수 일 경우 (3으로 나눴을때 나머지가 0일 경우) 반복문을 빠져나와보자
		
		while(true) { //무한반복 시키고
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("random값 : " + random);
			
			if(random % 3 == 0) { //3의 배수일 경우
				break;
			}
		}
		
		
	}

}

package com.kh.chap03.branch;

public class B_Continue {
	
	/*
	 * continue;	: 반복문 안에 기술되는 구문
	 * 				  continue; 구문 실행시 그 뒤의 구문들 실행되지 않고 곧바로 현재 속해있는 반복문 위로올라감
	 */
	public void method1() {
		// 직접
		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9
		
		/*
		for(int i =1; i<=10; i++) { //i값이 1에서부터 10까지 매번 1씩 증가하는 동안 반복(10회 반복)
			if(i % 2 == 1) { // i값이 홀수일 경우
				System.out.print(i + " ");
			}
			
		}
		*/
		
		for(int i = 1; i<=10; i++) {
			if(i%2 == 0) { // i값이 짝수일 경우
				continue; // 건너뛰기라고 생각하자
				//반복문 실행안하고 반복문 위로 올라감 => 증감식으로 가라
			}
			System.out.print(i + " ");
		}
	}
	
	//ctrl + shift + f // 코드정렬
	//alt + 방향키 	   // 코드이동
	public void method2() {
		// 1부터 100까지의 총합계
		// 단, 6의 배수값은 빼고 덧셈연산 하겠다.

		// 1. 1부터 100까지의 총합계 먼저 for문 작성 해보기
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 6 == 0) { // 6의 배수일 때는 건너뛰기
				continue;
			}

			sum += i; // 누적합 공식
		}
		System.out.println("1부터 100까지의 총합계 : " + sum);
	}
	
	public void method3() {
		// 2~9단 까지 출력
		// 단, 3의 배수단은 빼고 출력
		
		for(int dan = 2; dan <=9; dan++ ){
			if(dan % 3 == 0) {
				continue;
			}
			System.out.println("===== "+dan+"단 =====");
			for(int i = 1; i<=9 ; i++) {
				System.out.printf("%d x %d = %d\n", dan, i , dan * i);
			}
		}
		
	}
}

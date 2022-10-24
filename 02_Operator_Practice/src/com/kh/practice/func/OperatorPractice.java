package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : (num == 0) ? "0이다" : "음수다";
		
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남은 사탕 개수 : " + (candy % people));
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int g = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int c = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M / F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		gender = (gender == 'M') || (gender == 'm') ? '남' : '여';
		
		System.out.println(g + "학년 " + c + "반 " + n + "번 " 
							+ name + " " + gender + "학생의 성적은 "
							+ score + "이다.");
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age > 19) ? "성인" : "청소년";
		
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (kor + eng + math)/ 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		String result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60) ? "합격" : "불합격";
		
		System.out.println(result);
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String number = sc.nextLine();
		char gender = number.charAt(8);
		
		String result = (gender == '2') ? "여자" :  "남자";
		System.out.println(result);
	}

}

package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		//1. 기본생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());
		
		// 각 필드에 JVM의 초기값들이 담겨있음!!
		
		// 회원가입시 필수 입력사항만 입력받는다면?
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pwd02");
		u2.setUserName("차은우");
		*/
		
		//2. 매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user02", "pwd02", "차은우");
		System.out.println(u2.information());
		
		//그럼 setter 안만들어도되지않을까... => 안됨
		u2.setUserName("차으누"); //개명
		System.out.println(u2.information());
		
		// getter는..?
		// 비번을 까먹은 경우에는 비번만 보여줘야함. 그때 getter 필요
		
		//3. 매개변수 6개짜리 생성자로 객체 생성
		User u3 = new User("user03", "pwd03", "장원영", 23, '여' );
		System.out.println(u3.information());
		
		// 과제는 없지만 그동안 만들었던 person, product 가서 매개변수 있는 생성자 작성해보기
		
		
		
	}

}

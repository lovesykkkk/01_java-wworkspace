package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class ClassRun {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		
		
		// 생성 후에 필드에 담긴값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("김시연");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-1234-5678");
		p.setEmail("siyeon@gmail.com");
		
		System.out.println("=== 값 대입후 ===");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());

		
		
	}

}

package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

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
		
		System.out.println();
		System.out.println("==========================");
		System.out.println();
		
		// 첫번째 방법 : 기본생성자로 생성 후 setter 메소드 이용해서 값 초기화
		/*
		Product p1 = new Product();
		p1.setpName("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		*/
		
		// 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		Product p1 = new Product("갤럭시", 1200000, "삼성");
		
		/*
		Product p2 = new Product();
		p2.setpName("아이폰");
		p2.setPrice(1300000);
		p2.setBrand("애플");
		*/
		
		//Product p2 = new Product("애플", 1300000, "아이폰"); 순서지켜서 전달해주기
		Product p2 = new Product("아이폰", 1300000, "애플");
		
		// pName : xxx, price : xxx, brand : xxx
		System.out.println("pName : " + p1.getpName() + ", price : " + p1.getPrice() + ", brand : " + p1.getBrand());
		System.out.println("pName : " + p2.getpName() + ", price : " + p2.getPrice() + ", brand : " + p2.getBrand());

		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		// 클래스 접근제한자 설명
		
		
		
	}

}






























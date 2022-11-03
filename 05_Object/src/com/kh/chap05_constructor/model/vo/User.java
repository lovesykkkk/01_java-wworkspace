package com.kh.chap05_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * * 생성자
	 * public 클래스명([매개변수, 매개변수, ...]) {
	 * 
	 * }
	 * 
	 * 이거왜써야됨?
	 * * 생성자를 작성하는 목적
	 * 
	 * 1. 객체를 생성해주기 위한 목적
	 * 
	 * * 생성자 작성시 주의사항
	 * 1. 반드시 생성자명은 클래스명과 동일해야됨 (대/소문자 구분) => 안그럼 오류남
	 * 2. 반환형이 존재하지 않음 (만일 반환형을 쓰게 되면 메소드로 인식해버림)
	 * 생성자 작성하고 3번 작성
	 * 3. 객체 생성과 동시에 매개변수로 전달받은 값들을 필드에 바로 초기화할 목적
	 * 
	 * 
	 */
	
	public User() {
		// 기본생성자 (매개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 사용
		// System.out.println("이거되나? +_+");
		// 기본생성자를 생략했을 경우 => "JVM"이 자동으로 만들어줬기 때문에 항상 객체 생성 가능!!
	}
	
	// 매개변수생성자
	// 객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적
	public User(String userId, String userPwd, String userName) {
		//setter 메소드 실행시 수행됐던 코드들
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// 이번에는 get- set  한쌍으로 만들어보기
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd 
				+ ", userName : " + userName + ", age : " + age + ", gender : " + gender;
	}
	
	
	
	

}

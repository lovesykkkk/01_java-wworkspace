package com.kh.chap04_field.model.vo;

/*
 * >> 변수 구분
 * 
 * - 전역 변수 : 클래스 영역에 바로 선언한 변수 --> 클래스 내에서면 어디서든 전역으로 다 사용 가능하다. (외우는 팁! 전체지역!!)
 * - 지역 변수 : 클래스 영역내에 어떤 특정한 구역 ({}) 에 선언한 변수 --> 선언된 해당 그 지역에서만 사용 가능하다.
 * 				* 특정한 구역 : 메소드 {}, 제어문(if, for) {} 등등...
 * 
 * 1. 전역변수
 * - 필드 == 멤버변수 == 인스턴스변수
 * 	 생성시점 : new 라는 연산자를 통해서 객체 생성시
 * 	 소멸시점 : 객체 소멸시 같이 소멸
 * 
 * - 클래스변수 == static 변수 =>예약어 쓸수있는데 static이라는걸 쓰면 클래스변수가 된다.
 * 	 생성시점 : 프로그램 실행(해당 객체 생성이 안돼도)과 동시에 무조건 메모리 영역에 할당 => static 영역에!!!
 * 	 소멸시점 : 프로그램 종료될때 소멸
 * 
 * 2. 지역변수
 * 	 생성시점 : 지역변수가 속해있는 특정한 구역({}) 실행(호출)시 메모리 영역에 할당
 * 	 소멸시점 : 특정한 구역 ({}) 종료시 소멸
 * 
 */

// 변수 선언 위치에 따른 구분을 보기 위한 클래스 (전역, 지역, 매개)

public class FieldTest1 { //클래스영역 시작
	
	/*
	private int a;
	
	public void method1() {
		int a = 10;
		
		if(true) {
			int b = 10;
		}
	}
	*/
	
	// 멤버변수 (인스턴스변수) -> 전역변수
	private int global;
	//private int global = 100;
	
	public void test(int num) { // test 메소드 영역 시작 
		//매개변수(일종의 지역변수 즉, 메소드 영역 내에서만 쓸 수 있음)
		
		//지역변수(메소드 영역내에 선언) => 지역변수에는 접근제한자 같은거 붙이는거 아님
		//int local; 
		int local = 10;
		
		// 멤버변수 출력 => 멤버변수는 해당 이 객체 생성시 JVM이 기본값으로라도 초기화
		System.out.println(global); //초기화 안돼있음. 근데 오류안남. heap영역에 생성될때 초기화됨.
		
		// 매개변수 => 매개변수는 해당 이 메소드 호출시 반드시 값이 전달될거기 때문에 초기화 안돼있어도됨.
		System.out.println(num); //초기화 안돼있음. 근데 오류안남. 매개변수로 무조건 하나는 넘겨야하니까 값이 들어감
		
		// 지역변수 출력
		System.out.println(local);//초기화 안돼있음. 이건 오류남
		 
	}// test 메소드 영역 끝
	

} // 클래스 영역 끝























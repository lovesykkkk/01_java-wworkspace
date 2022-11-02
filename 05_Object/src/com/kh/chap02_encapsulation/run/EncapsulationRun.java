package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	
	/*
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게끔!!
	 * 
	 * 	* 캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나로
	 * 			 클래스에서 가장 중요한 목적인 "데이터의 접근 제한"을 원칙으로
	 * 			 외부로부터 "데이터의 직접 접근을 막고"
	 * 			 대신에 "데이터를 간접적으로나마 처리(값을 대입, 값을 돌려준다거나)" 할 메소드들 클래스 내부에 작성해서 관리
	 * 
	 * 	1) 정보은닉 : private
	 * 		직접 접근을 막기위해 private 라는 접근제한자 사용
	 * 
	 * 
	 *  2) setter / getter 메소드 만들어야함!!!
	 *  	private 하는 순간 필드에 접근 불가
	 *  	setter 메소드 : 해당 필드에 대입시키고자 하는 값 전달받아 해당 필드에 대입시켜주는 메소드
	 *  	getter 메소드 : 해당 필드에 담긴값을 반환해주는 메소드
	 * 	
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Student woo = new Student(); //import 중요해!! chap02
		
		/*
		woo.name = "우영우";
		woo.age = 20;
		woo.age = 162.3;
		woo.korScore = 100;
		woo.mathScore = 90;
		*/
		
		//woo.method1(10); // 이거도 private 바꾸면 접근 불가능
				
		woo.setName("우영우");
		woo.setAge(20);
		woo.setHeight(162.3);
		woo.setKorScore(100);
		woo.setMathScore(90);
		
		//System.out.println(woo.name); //직접 접근 불가능함
		System.out.println(woo.getName());
		System.out.println(woo.getAge());
		System.out.println(woo.getHeight());
		System.out.println(woo.getKorScore());
		System.out.println(woo.getMathScore());
		
		// 수정하고 싶다면?
		System.out.println("== 수정 후 ==");
		woo.setAge(25);
		
		System.out.println(woo.getAge());

	}
	

}




















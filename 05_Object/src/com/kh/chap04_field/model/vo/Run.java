package com.kh.chap04_field.model.vo;

// FieldTest2랑 같은패키지에 있음!!
public class Run {

	// shitf + teb 뒤로탭
	public static void main(String[] args) {
		// ----- FieldTest2 -----
		FieldTest2 f2 = new FieldTest2();

		// public
		System.out.println(f2.pub);

		// protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속구조에서만 접근 가능
		System.out.println(f2.pro);

		// default : 오로지 같은 패키지 내에서만 접근 가능
		System.out.println(f2.def);

		// private : only 해당 클래스에서만 접근 가능!!
		// System.out.println(f2.pri);

	}
}

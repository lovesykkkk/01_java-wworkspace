package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 개념을 적용했을 때 !!
public class ElectronicShop2 {
	
	// 자리를 마련하자
	// 다형성 : 부모타입 레퍼런스 하나로 다양한 자식객체를 담을 수 있음!!
	
	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet
	
	//Parent[] arr = new Parent[4];
	//  Parent타입	
	//	arr[0] = new Child1(1, 2, 4); // 이런식으로 할꺼임
	
	// 부모타입 배열로 모든 자식 객체 다루기
	private Electronic[] elec = new Electronic[3];
	private int count = 0; // insert 짜면서 확인 // 전역변수로 선언!!
	
	// insert 함수 구현
	// 매개변수 => Desktop, NoteBook, Tablet 전부 다 받을 수 있는 부모 Electronic 으로 생성
	
	public void insert(Electronic any) { // elet[0] = new Desktop(~~) => 데땁, 놋북, 태블릿 다 가능
		//elec[?] = any;
		elec[count++] = any;
		
		// 맨처음 => count : 1 이였을 경우
		// es.insert(new Desktop("Samsung", "데땁", 1200000, "gtx1070"));  이거 실행됨
		
		// 그다음 => count : 2 이였을 경우
		// es.insert(new NoteBook("LG", "그램", 2000000, 4)); 이거 실행됨
		
		// 그다음 => count : 3 이였을 경우
		// es.insert(new Tablet("Apple", "아이패드", 800000, false)); 이거 실행됨
	}
	
	
	// 모르면 우선 void로 짜자 => 나중에 수정 가능
	public Electronic select(int index) { // 0 1 2
		//elec 배열에 있는 값들을 출력해야하니까 해당 인덱스를 받아와야함
		return elec[index]; // void는 안됨. 3개를 다 받을 수 있는 Electronic 으로 반환형 해줘야함
		
	}

}


















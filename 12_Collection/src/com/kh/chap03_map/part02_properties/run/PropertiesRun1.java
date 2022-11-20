package com.kh.chap03_map.part02_properties.run;

import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		// Properties : Map계열의 컬렉션 => 키 + 벨류 세트로 저장
		// HashMap과의 차이점 : Properties에는 키값도 String , 벨류값도 String으로 담음!
		
		Properties prop = new Properties();
		
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제")); // get메소드 이용 가능!
		
		// 하지만 properties 사용하는 경우는 주로 Properties에 담긴 것들을 파일로 출력 또는 입력 받아 올때 사용함!
		// 즉, Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서
		
		

	}

}

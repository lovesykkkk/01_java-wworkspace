package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		// 계층구조를 보면
		// List 계열, Set  계열의 클래스들은 Collection 구현한 클래스다.
		// => 객체를 추가하고자 할 때 공통적으로 add 메소드 이용!!
		
		
		// Map 계열은 Collection을 구현한 클래스가 아님!
		// => 추가하고자 할 때 put 메소드 이용 (이때 키 + 벨류 세트로 담아야됨!)
		
		// 1. put(K key, V value) : 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // {키 = 벨류, 케 = 벨류, ..}
		// 저장되는 순서 유지 안됨! value값이 중복되도 키 값이 중복안되면 잘 저장됨!
		
		hm.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어 씌워짐!! (중복된 키값 공존할 수 없음!! 키값이 식별자 같은 개념!)
		
		System.out.println(hm);
		
		// 2. get(Object key) : V => 컬렉션에서 해당 키값을 가지는 Value값을 반환시켜주는 메소드
		// Snack s = hm.get("다이제");제네릭 아님
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		// 3. size() : 컬렉션에 담겨있는 개겣들의 개수 반환
		System.out.println("몇 개있을까? : " + hm.size() + "개 있음");
		
		// 4. replace(K key, V value) => 컬렉션에서 해당 키값 찾아서 다시 전달한 value값으로 수정시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나 짠맛", 1000));
		System.out.println(hm);
		
		// 5. remove(Object key) => 컬렉션에서 해당 키값 찾아서 그 키-벨류 세트를 삭제시켜주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		System.out.println("==============================");
		
		// map 공간에 담긴 모든 키값과 벨류값다 출력하고자 할 때
		// for each문 안됨!
		/*
		for(Object o:hm) {
			
		}
		*/
		
		//ArrayList도 안됨!!
		//ArrayList list = new ArrayList(hm);
		
		//Iterator 반복자를 이용!
		//Iterator it = hm.iterator(); // 곧바로 iterator() 호출 못함!! 왜? iterator()는 List계열 또는 Set 계열에서만 쓸 수 있는 메소드!
		
		// Map을 Set으로 바꿔주는 메소드 제공함!! (게다가 2개나..!)
		// Map계열 => Set계열
		
		// 1. keySet() 이용하는 방법
		// 1) hm에 있는 키들만 Set에 담기(키들의 집합 형태)
		Set keySet = hm.keySet();
		
		// 2) 1번과정에서 작업된 keySet을 Iterator에 담기
		//	  keySet.iterator() : Iterator
		Iterator itKey = keySet.iterator();
		
		// 3) 반복문을 통해서 뽑기
		
		while(itKey.hasNext()) {
			String key = (String)itKey.next(); // 제네릭 설정 돼있지 않음. 강제형변환
			Snack value = (Snack)hm.get(key);
			System.out.println(key + "=" + value);
		}
		
		System.out.println("==============================");
		
	
		// 2. entrySet() 이용하는 방법
		
		// 1) hm.entrySet() : Set
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet.iterator() : Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 통해 가져오기
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /*(Entry)*/itEntry.next(); // 이 안에 key, value 다 담겨있음!!
			
			String key = /*(String)*/entry.getKey();
			Snack value = /*(Snack)*/entry.getValue(); 
			
			System.out.println(key + "=" + value);
		}
		
		

	}

}

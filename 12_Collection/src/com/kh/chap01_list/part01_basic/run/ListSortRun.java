package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListSortRun {

	public static void main(String[] args) {
		
		// ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		{// 초기화 블럭
			list.add("C");
			list.add("A");
			list.add("B");
			list.add("a");
		}
		
		System.out.println("원본 : " + list);
		
		// 오름차순으로 정렬
		//Collections.sort(list);
		list.sort(Comparator.naturalOrder());
		System.out.println("오름차순 : " + list);
		
		// 내림차순으로 정렬
		//Collections.sort(list,Collections.reverseOrder());
		list.sort(Comparator.reverseOrder());
		System.out.println("내림차순 : " + list);

		 // 대소문자 구분없이 오름차순
        //Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("대소문자 구분없이 오름차순 : " + list); // [a, A, B, C]
 
        // 대소문자 구분없이 내림차순
        //Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("대소문자 구분없이 내림차순 : " + list); // [C, B, a, A]
	}

}

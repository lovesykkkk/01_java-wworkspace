package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class Map2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<>();
		//put 메소드를 활용해 키-값의 형태로 데이터를 저장한다.
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//while 내부에 true를 써 무한루프를 만듬
		while(true) {
			System.out.print("찾고 싶은 단어는? :");
			String eng = sc.nextLine();
			//if문을 활용해 조건을 만족하면 while문을 탈출하고 종료
			if(eng.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			//영문명(키)을 통해 조회해 맞는 것이 있으면 한글(값)로 출력
			//eng값을 가져왔는데 dic데이터에 없으면 null값이 kor에 저장됨.
			String kor = dic.get(eng); 
			if(kor == null)
				System.out.println(eng + "는 없는 단어입니다.");
			else System.out.println(kor);
		}
	}

}

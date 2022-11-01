package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		//배열선언
		int[] arr = new int[10];
		
		//값 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		//배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		//배열선언
		int[] arr = new int[10];
		
		//값 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = 10-i;
		}
		
		// 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		// 정수입력받기
		System.out.print("양의정수 : ");
		int num = sc.nextInt();
		
		// 배열 선언 및 할당
		int[] arr = new int[num];
		
		// 값 대입
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		// 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
	public void practice4() {
		//배열 생성 및 값 대입
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
		// 귤일때만 출력
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
			}
		}
	}
	
	public void practice5() {
		// 문자열 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 배열생성
		char[] str1 = new char[str.length()];
		
		// 값 대입
		for(int i =0; i<str1.length; i++) {
			str1[i] = str.charAt(i);
		}
		
		// 문자 입력
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 인덱스 찾기 + count 증가
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i=0; i<str1.length; i++) {
			if(str1[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
		
	}
	
	public void practice5_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine(); //apple
		System.out.print("문자 : "); // p
		char ch = sc.nextLine().charAt(0);
		
		// 배열 생성
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " "); // 1 2 
				count ++;
			}
		}
		System.out.println();
		System.out.println(ch + "개수 : " + count);
		
		sc.close();
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성 및 초기화
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 숫자 입력
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 출력조건 설정
		if(num<0 || num>6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		for(int i=0; i<day.length; i++) {
			if(num == i) {
				System.out.println(day[i] + "요일");
			}
		}
	}
	
	public void practice7() {
		//배열 길이 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		// 배열 생성 및 할당
		int[] arr = new int[num];
		
		// 값 대입
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		//출력 및 누적합 구하기
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		// 조건맞을때까지 반복 => while문
		while(true) {
			// 정수 입력
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) { // num이 3이상 홀수일때만 작동
				int[] arr = new int[num];
				
				/*
				 * 5입력시 => {1,2,3,2,1}		=> 2번 인덱스까지 증가 그 이후부터 감소
				 * 7입력시 => {1,2,3,4,3,2,1}	=> 3번 인덱스까지 증가 그 이후부터 감소
				 * 9입력시					=> 4번 인덱스까지 증가 그 이후부터 감소
				 * 							=> 배열의 길이 / 2 인덱스까지 증가 그 이후부터 감소
				 * 
				 */
				
				int value = 1;
				for(int i=0; i<arr.length; i++) {
					arr[i] = value;
					if(i<arr.length / 2) {
						value++;
					}else {
						value--;
					}
				}
				
				for(int i =0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				
				break;
			}else { // 아닌경우 다시입력하게 한다.
				System.out.println("다시 입력하세요.");
			}

		}
				
		
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		// 배열 생성
		String[] chickens = { "황금올리브", "허니콤보", "뿌링클", "고추바사삭" };

		System.out.print("치킨 이름을 입력하세요 :");
		String chicken = sc.nextLine();

		int count = 0;
		for (int i = 0; i < chickens.length; i++) {
			if (chicken.equals(chickens[i])) {
				count ++;
			}
		}
		if(count == 1) {
			System.out.println(chicken + "치킨 배달 가능");
		}else {
			System.out.println(chicken + "치킨 배달불가");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		
		char[] arr = new char[idNum.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = idNum.charAt(i);
		}
		char[] arrCopy = arr.clone();
		
		for(int i=8; i<arrCopy.length; i++) {
			arrCopy[i] = '*';
		}
		
		for(int i=0; i<arrCopy.length; i++) {
			System.out.print(arrCopy[i]);
		}
		System.out.println();
		sc.close();
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random() *10 + 1);
			arr[i] = random;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " " );
			
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		
		
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random() *10 + 1);
			arr[i] = random;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice12_1() {
		int[] arr = new int[10];
		
		
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random() *10 + 1);
			arr[i] = random;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		
		//배열 정렬
		Arrays.sort(arr);
		min = arr[0];
		max = arr[arr.length-1];
		
		//최소값 출력
		System.out.println("최소값은 : " + min);
		System.out.println("최대값은 : " + max);
		
		
	}
	
	public void practice13() {
		int[] arr = new int[10];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() *10 +1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 +1);
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	// 새로운 개념 배우고 풀이
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		int count = 0;

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
			boolean flag = true;
		
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i])
					flag = false;
			}
			
			if (flag) {
				if (i == 0)
					System.out.print(arr[i]);
				else
					System.out.print(", " + arr[i]);
	                
				count++;
			}
		}

		System.out.println("\n문자 개수 : " + count);
		
		sc.close();
	}
	
	public void practice16() {

	      Scanner sc = new Scanner(System.in);

	      System.out.print("배열의 크기를 입력하세요 : ");
	      int num = sc.nextInt();
	      sc.nextLine();

	      String[] origin = new String[num];

	      // 배열 복사
	      String[] copy = origin;
	      // String[] copy = origin.clone();
	      // String[] copy = Arrays.copyOf(origin, origin.length);

	      for (int i = 0; i < origin.length; i++) {
	         System.out.printf("%d번째 문자열 : ", i + 1);
	         origin[i] = sc.nextLine();
	      }

	      while (true) {

	         System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
	         char ch = sc.next().charAt(0);

	         if (ch == 'y') {
	            System.out.print("더 입력하고 싶은 개수 : ");
	            num = sc.nextInt();
	            sc.nextLine();

	            copy = Arrays.copyOf(origin, origin.length + num);

	            for (int i = origin.length; i < copy.length; i++) {
	               System.out.printf("%d번째 문자열 : ", i + 1);
	               copy[i] = sc.nextLine();
	            }
	            
	            origin = copy;

	         } else if (ch == 'n') {
	            System.out.print("[");
	            for (int i = 0; i < copy.length; i++) {
	               if (i == copy.length - 1) {
	                  System.out.printf("%s", copy[i]);
	               } else {
	                  System.out.printf("%s, ", copy[i]);
	               }
	            }
	            System.out.print("]");
	            break;
	         }

	      }

	   }
	
}

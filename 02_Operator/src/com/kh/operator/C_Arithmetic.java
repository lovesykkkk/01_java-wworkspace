package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 * * 산술연산자 (이항연산자 == 두개의 값을 가지고 연산)
	 * + - * / % 
	 * 
	 * * / %  >  + -
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		// System.out.println("num1 + num2 = " + num1 + num2); //103 나옴..
		System.out.println("num1 + num2 = " + (num1 + num2)); //13
		//System.out.println("num1 - num2 = " + num1 - num2); //에러 발생 우선순위때문에 : 문자-숫자 불가
		System.out.println("num1 - num2 = " + (num1 - num2)); //7
		System.out.println("num1 * num2 = " + (num1 * num2)); // 곱셈연산은 우선순위 먼저! 가독성위해 ()
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기했을때 몫 <int 나누기 int> 
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기했을때 나머지 <짝홀>
		
		// 값 % 2 == 0 라는 건 짝수란 소리
		// 값 % 2 == 1 라는 건 홀수란 소리
		
		// 값 % 5 == 0 라는건 5의 배수란 소리
		// 값 % 3 == 0 라는건 3의 배수란 소리
		
	}
	
	public void quiz() {
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; // a=6, b=10, c=16
		int d = c / a;	// a=6, b=10, c=16, d=2
		int e = c % a;	//a=6, b=10, c=16, d=2, e=4
		
		int f = e++;	//a=6, b=10, c=16, d=2, e=4(5), f=4
		
		int g = (--b) + (d--);	//a=6, b=9, c=16, d=2(1), e=5, f=4, g=11
		int h = 2; //a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
		
		// a=6(7), b=9, c=15, f=4, g=11(10), d=1, e=6, h=2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// 		  6	  + 9 / (15  / 4) * (11  - 1) % (6   + 2)
		//		  6	  + 9 / 	3     *     10	  %      8
		//		  6   +     3		  *     10    %      8
		// 	      6   +              30	          %      8
		//        6   +            				  6
		//		  12	
	
		System.out.println("a : " + a); //7
		System.out.println("b : " + b); //9
		System.out.println("c : " + c);	//15
		System.out.println("d : " + d);	//1
		System.out.println("e : " + e);	//6
		System.out.println("f : " + f);	//4
		System.out.println("g : " + g);	//10
		System.out.println("h : " + h);	//2
		System.out.println("i : " + i);	//12
		
	}
	
	public void quiz1(){
		int a = 5;
		int b = 10;
		int c = (++a) + b; 
		int d = c / a;	
		int e = c % a;	
		int f = e++;	
		int g = (--b) + (d--);
		int h = 2; 
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	
	
		System.out.println("a : " + a); 
		System.out.println("b : " + b); 
		System.out.println("c : " + c);	
		System.out.println("d : " + d);	
		System.out.println("e : " + e);	
		System.out.println("f : " + f);	
		System.out.println("g : " + g);	
		System.out.println("h : " + h);	
		System.out.println("i : " + i);	
	}

}



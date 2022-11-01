package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	public void upDown() {
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random() * 100 + 1); //90
		int count =0;
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int guess = sc.nextInt();
			
			
			if(guess>0 && guess<101) {
				if(num>guess) {
					System.out.println("UP!");
					count++;
				}else if(num<guess) {
					System.out.println("Down !");
					count++;
				}else {
					count++; // 이게핵심
					System.out.println("정답입니다!!");
					System.out.println(count + "회만에 맞추셨습니다.");
					break;
				}
			}else {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			}
			
			
	
		}
	}
}

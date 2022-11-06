package com.kh.practice.comp.func;

import java.util.Scanner;

public class Rps {
	public void rps() {
		Scanner sc = new Scanner(System.in);
		int total = 0; // 전 => 잘 입력했을 경우
		int win = 0; // 승
		int lose = 0; // 패
		int tie = 0; // 무
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		while(true) { // 계속 반복
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine(); //exit
			
			int random = (int)(Math.random() *3 +1); //1 2 3
			String com = " ";
			
			switch(random) { // 1 2 3
			case 1:
				com = "가위";
				break;
				
			case 2:
				com = "바위";
				break;
				
			default: // 3일때
				com = "보";
				break;
			}
			
			if(rps.equals("exit")) { // exit를 입력한 경우에는 종료
				// 전 승 무 패 => 이따가
				System.out.println(total + "전 " + win + "승 " + tie + "무 " + lose + "패");
				return; // method 밖으로 나가는 구문
			}else if(rps.equals("가위") || rps.equals("바위") || rps.equals("보")) { //입력을 잘 한 경우
				total++;
				System.out.print("컴퓨터 : ");
				System.out.println(com); // 컴퓨터 : 가위(랜덤한값)
				System.out.print(name + " : ");
				System.out.println(rps); // 김시연 : 보(내가입력한값)
				
				if(com.equals("가위")) { // 컴퓨터가 가위를 낸 경우
					switch(rps) {
					case "가위" :
						System.out.println("비겼습니다.");
						tie++;
						break;
					case "바위" :
						System.out.println("이겼습니다! ");
						win++;
						break;
					case "보" :
						System.out.println("졌습니다! ㅠㅠ");
						lose++;
						break;
					}
				}
				
				if(com.equals("바위")) { // 컴퓨터가 바위를 낸 경우
					switch(rps) {
					case "가위" :
						System.out.println("졌습니다! ㅠㅠ");
						lose++;
						break;
					case "바위" :
						System.out.println("비겼습니다.");
						tie++;
						break;
					case "보" :
						System.out.println("이겼습니다! ");
						win++;
						break;
					}
				}
				
				if(com.equals("보")) { // 컴퓨터가 바위를 낸 경우
					switch(rps) {
					case "가위" :
						System.out.println("이겼습니다! ");
						win++;
						break;
					case "바위" :
						System.out.println("졌습니다! ㅠㅠ");
						lose++;
						break;
					case "보" :
						System.out.println("비겼습니다.");
						tie++;
						break;
					}
				}
				
				
				
				
			}else { //잘못입력한경우
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

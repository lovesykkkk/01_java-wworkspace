package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPrcatice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(" + " + i);
			}
			sum += i;
		}
		System.out.print(" = " + sum);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("첫번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
					break;
				} else {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
					break;
				}

			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		System.out.println("===== " + num + "단 =====");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for (int dan = num; dan < 10; dan++) {
				System.out.println("===== " + dan + "단 =====");
				for (int su = 1; su < 10; su++) {
					System.out.println(dan + " * " + su + " = " + dan * su);
				}
			}
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} else {
				for (int dan = num; dan < 10; dan++) {
					System.out.println("===== " + dan + "단 =====");
					for (int su = 1; su < 10; su++) {
						System.out.println(dan + " * " + su + " = " + dan * su);
					}
				}
				break;
			}
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();

		System.out.print("공차 : ");
		int gap = sc.nextInt();

		int count = 0; // 총 10번이 되었는지 세어주는 변수 , 10번을 셀수있는 변수를 하나 만들자.
		for (int i = start;; i += gap) { // 카운트로 셀거기때문에 어디까지라는 조건을 넣지 않음. i=i+gap
			System.out.print(i + " "); // 한번 출력1 , 두번 출력 2, ...출력 10
			count++;

			if (count == 10) { // 만약 카운트가 10번 되었다면 브레이크 걸어준다는 뜻.
				break;
			}
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 1
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();

			// 3
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 1-1
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();

			// 2 나눗셈이면서

			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue;
			}
			// 4

			switch (op) {
			case "+":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 + num2));
				break;
			case "-":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 - num2));
				break;
			case "*":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 * num2));
				break;
			case "/":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 / num2));
				break;
			case "%":
				System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 % num2));
				break;
			// 5
			default:
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.\n");
			}
		}

	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 1에서 4까지 늘어난다.
			for (int j = 1; j <= i; j++) { // 1에서 4까지 늘어나며 돈다
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 1에서 4까지 늘어난다.
			for (int j = num; j >= i; j--) { // 4에서 1까지 줄어들며 돈다.
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

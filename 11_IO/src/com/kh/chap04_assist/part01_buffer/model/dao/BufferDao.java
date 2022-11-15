package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	
	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 * 			 기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상 시킴 + a
	 *		>> 외부매체와 직접적으로 연결되는 스트림 아님!!
	 *			단독사용 불가(반드시 기반스트림과 함께 사용)
	 */
	
	// 프로그램 -> 파일 (출력)
	public void fileSave() {
		// FileWriter 기반스트림 가지고 해보자! (기반스트림 필수)
		// 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림
		
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도향상) : 기반스트림이랑 이름 맞춰야함
		
		// BufferedWriter bw = new BufferedWriter("c_buffer.txt"); // 단독사용 불가
		
		
		// 1. 기반스트림 먼저 생성
		//FileWriter fw = new FileWriter("c_buffer.txt"); //일단 예외처리 하지말기
		// 2. 보조스트림 생성시 기반스트림 객체를 전달하면서 생성
		//BufferedWriter bw = new BufferedWriter(fw);
		
		// 위의 두줄을 한줄로 작성
		
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 추가적인 메소드 활용 가능
			bw.write("저리가세요");
			// 버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력해줌 => 속도 향상에 좋다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		}
		*/
		
		
		// try~with~resource 구문으로 자원반납까지 더 간단하게 작업할 수 있음
		// jdk7 버전 이상부터
		
		/*
		 * try(try블럭 내에서 사용할 스트림 객체 생성구문) { //알아서 try 다 끝나면 해당스트림 반납까지 해줌
		 * 
		 * } catch(예외클래스 e) {
		 * 
		 * }
 		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 추가적인 메소드 활용 가능
			bw.write("저리가세요");
			// 버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력해줌 => 속도 향상에 좋다.
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원반납 구문 안써도됨! 자동으로 반납까지 해줄꺼임!
		
	}

}

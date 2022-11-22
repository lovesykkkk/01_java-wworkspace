package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ClientProgram {

	// 클라이언트용 프로그램 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		Socket socket = null;
		
		// 요청하고자 하는 서버 IP : 192.168.35.118
		// 포트번호 : 3000
		
		int port = 3000;

		String serverIP;
		
		try {
			serverIP = "192.168.35.118";
			
			// 1) 서버에 연결 요청 보내는 구문( 요청하고자 하는 서버의 IP 주소와 지정된 포트번호를 제시하면서 소켓 객체 생성)
			socket = new Socket(serverIP, port); 
			// 서버꺼져있거나 못찾으면 (통신실패) null이 담긴다.
			
			if(socket!=null) {// 서버와 잘 연결됐을 경우
				System.out.println("서버와 연결 성공!!");
				
				// 2) 서버와 입출력 기반스트림 생성
				// 3) 보조스트림 통해서 성능개선
				
				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					// 4) 스트림을 통해 읽고 쓰기
					System.out.print("서버에게 보낼 내용 :");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine(); // 한 줄단위로 읽어들인다.
					System.out.println("서버로부터 전달받은 메세지 : " + message);
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				// 5) 통신 종료
				pw.close();
				br.close();
				
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

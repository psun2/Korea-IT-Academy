package com.lec.spring.beans;

// log in / log out 동작과 같은
// 공통기능 / 관심기능 (concern) 이 담긴 객체
public class Logger {

	public void logIn() {
		System.out.println("## 로그인 처리 ##");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void logOut() {
		System.out.println("## 로그아웃 처리 ##");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

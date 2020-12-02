package com.lec.sts18_security;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/sample/*")
public class SampleController {

	// 인증 (Authentication : 자신을 증명)
	// 내가 (스스로) 자신을 증명말 만한 자료를 제시 하는 것.

	// 인가 (Authorizatoin : 권한부여)
	// 남에 의해서 ‘자격’ 이 부여된것.

	@GetMapping("/all")
	public void doAll() {
		log.info("doAll(): 누구나 접근 가능");
	}

	@GetMapping("/member")
	public void doMember(HttpServletRequest request) {
		HttpSession session = request.getSession();
//		Enumeration list = session.getAttributeNames();
//		while (list.hasMoreElements()) {
//			log.info("세션명: {}", list.nextElement().toString());
//			log.info("session 정보: {}", session.getAttribute(list.nextElement().toString()));
//		}
		log.info("doMember() : 로그인한 member 만 접근가능");
	}

	@GetMapping("/admin")
	public void doAdmin(HttpServletRequest request) {
		HttpSession session = request.getSession();
//		Enumeration list = session.getAttributeNames();
//		while (list.hasMoreElements()) {
//			log.info("세션명: {}", list.nextElement().toString());
//			log.info("session 정보: {}", session.getAttribute(list.nextElement().toString()));
//		}
		log.info("doAdmin() : admin 만 접근가능");
	}
}

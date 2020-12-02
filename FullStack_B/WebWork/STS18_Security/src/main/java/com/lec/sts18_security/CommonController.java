package com.lec.sts18_security;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CommonController {

	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model, HttpServletRequest request) {
		log.error("access Denied : {}", auth);

		HttpSession session = request.getSession();
//		Enumeration list = session.getAttributeNames();
//		while (list.hasMoreElements()) {
//			log.info("세션명: {}", list.nextElement().toString());
//			log.info("session 정보: {}", session.getAttribute(list.nextElement().toString()));
//		}
		log.info("doMember() : 로그인한 member 만 접근가능");

		model.addAttribute("msg", "접근 권한 거부");
	}

	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model, HttpServletRequest request) {
		log.info("[/customLogin]");
		log.info("error: {}", error);
		log.info("logout: {}", logout);

		HttpSession session = request.getSession();
//		Enumeration list = session.getAttributeNames();
//		while (list.hasMoreElements()) {
//			log.info("세션명: {}", list.nextElement().toString());
//			log.info("session 정보: {}", session.getAttribute(list.nextElement().toString()));
//		}
		log.info("doMember() : 로그인한 member 만 접근가능");

		if (error != null) { // 에러가 있다면
			model.addAttribute("error", "Login Error Check Your Accout");
		}

		if (logout != null) {
			model.addAttribute("logout", "Logout!!");
		}
	}

	@GetMapping("/customLogout")
	public void logoutGet(HttpServletRequest request) {
		log.info("[/customLogout: GET]");
		HttpSession session = request.getSession();
//		Enumeration list = session.getAttributeNames();
//		while (list.hasMoreElements()) {
//			log.info("세션명: {}", list.nextElement().toString());
//			log.info("session 정보: {}", session.getAttribute(list.nextElement().toString()));
//		}
		log.info("doMember() : 로그인한 member 만 접근가능");
	}

	@PostMapping("/customLogout")
	public void logoutPost(HttpServletRequest request) {
		log.info("[/customLogout: POST]");
		HttpSession session = request.getSession();
//		Enumeration list = session.getAttributeNames();
//		while (list.hasMoreElements()) {
//			log.info("세션명: {}", list.nextElement().toString());
//			log.info("session 정보: {}", session.getAttribute(list.nextElement().toString()));
//		}
		log.info("doMember() : 로그인한 member 만 접근가능");
	}
}

package com.lec.sts18_security.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {

	// 로그인 성공
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		log.info("[로그인 성공]");
		
		// Authentication 객체를 이용해서 사용자가 가진 모든 권한을 문자열로 확인 가능
		List<String> roleNames = new ArrayList<String>();
		
		authentication.getAuthorities().forEach((authority) -> {
			roleNames.add(authority.getAuthority());
		});

		log.info("ROLES NAMES : {}, roleNames size: {}", roleNames, roleNames.size());
		
		// 로그인한 사용자가 ROLE_ADMIN 권한을 가졌으면 /sample/admin 으로 이동
		if(roleNames.contains("ROLE_ADMIN")) {
			response.sendRedirect(request.getContextPath() + "/sample/admin");
			return;
		}
		
		// ROLE_MEMBER 권한을 가졌으면 /sample/member 로 이동
		if(roleNames.contains("ROLE_MEMBER")) {
			response.sendRedirect(request.getContextPath() + "/sample/member");
			return;
		}
		
		// 둘다 아니면 / 로 이동
		response.sendRedirect("/");
		
	}

}

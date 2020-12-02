package com.lec.sts18_security.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomNoOpPasswordEncoder implements PasswordEncoder {

	// 주어진 rawPassword 를 인코딩하여 리턴, 일반적으로 SHA-1 혹은 그 이상의 알고리즘 활용
	@Override
	public String encode(CharSequence rawPassword) {
		log.info("encode 전 : {}", rawPassword);
		return rawPassword.toString();
	}

	// 주어진 rawPassword 가 인코딩된 비번(encodedPassword) 와 동일한지 판정
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		log.info("marches 수행 : {} :: {}", rawPassword, encodedPassword);
		return rawPassword.toString().equals(encodedPassword);
	}

}

package com.lec.sts19_rest;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Test implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("resources/**").addResourceLocations("classpath:/static/")
				.setCachePeriod(60 * 60 * 24 * 365);

		// 기존에는 모든 정적 자원에 1년의 cache period를 줬었다.

	}

}

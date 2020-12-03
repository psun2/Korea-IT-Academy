package com.lec.junit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemberTests {

	@Test
	@DisplayName("회원생성")  // test에 대한 이름 부여
	void create_new() {

		// 예외가 발생해야 성공
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Member(-1));

		assertEquals("나이는 0 보다 커야 합니다.", ex.getMessage());

	}

	@Test
	@DisplayName("회원 생성 시간") // test에 대한 이름 부여
	void create_new_time() {
		assertTimeout(Duration.ofMillis(100), () -> {
			for (int i = 0; i < 10; i++) {
				new Member(i);
				Thread.sleep(100);
			}
		});
	}
	
	@Test
	@DisplayName("AssertJ 사용")
	void test3() {
		Member child = new Member(3); // 0, 15 에러 
		
		assertThat(child.getAge())
		.isGreaterThan(0) // 0보다 큰가? (0 초과)
		.isLessThan(15); // 15보다 작은가 ? (15 미만)
	}

}

package com.lec.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/* JUnit5 의 기본 애노테이션

@Test
    테스트를 진행하고자 하는 메소드를 구현할 때 사용한다.
@BeforeAll
    @Test를 모두 실행하기 전에 딱 한번만 호출 되는 것이다.
@AftereAll
    @Test를 모두 실행한 후에 딱 한번만 호출 되는것이다.
@BeforeEach
    @Test를 모두 실행할 때 각각의 @Test가 실행되기 전에 호출되는 것이다.
@AfterEach
    @Test를 모두 실행할 때 각각의 @Test가 실행된 후에 호출되는 것이다.
@Disabled
    테스트를 진행하지 않은 @Test가 있을 시 해당 애노테이션을 붙이면 테스트를 진행하지 않을 수 있다.
    현재 운영에 사용되어지지는 않은데 추후 사용될 수도 있으니! 지우지 않고 냅두는 상황이 매우 많다.
    
*/

@Slf4j
class JunitTest2 {

	@Test
	void create1() {
		log.info("create1");
	}

	@Test
	void create2() {
		log.info("create2");
	}

	@Test
	static void create3() {
		log.info("create3");
	}

	@BeforeAll // 반드시 static 이여야 합니다.
	static void beforeAll() {
		log.info("[beforeAll]");
	}

	@BeforeEach // 매 test 전에 수행됩니다.
	void beforeEach() {
		log.info("brefore each");
	}

	@AfterAll
	static void afterAll() {
		log.info("[AfterAll]");
	}

	@AfterEach
	static void afterEach() {
		log.info("after each");
	}

}

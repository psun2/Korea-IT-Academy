package com.lec.sts19_rest.domain;

import lombok.Data;

@Data
public class AjaxWriteResult {
	
	private int count; // 데이터 개수
	private String status; // 처리 결과
	private String message; // 결과 메시지

}

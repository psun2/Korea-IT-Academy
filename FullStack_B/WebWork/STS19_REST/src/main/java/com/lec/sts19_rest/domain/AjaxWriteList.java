package com.lec.sts19_rest.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AjaxWriteList extends AjaxWriteResult {

	@JsonProperty("data")
	private List<WriteDTO> list; // 데이터 목록
	
	@JsonProperty("totalpage")
	private int page; // 현재 페이지
	
	@JsonProperty("totalcnt")
	private int totalPage; // 총 몇 '페이지' 분량인가?
	
	@JsonProperty("totalcnt")
	private int totalCnt; //글은 총 몇개 인가?
	
	@JsonProperty("writepages")
	private int writePages; // 한 [페이징] 에 몇개의 '페이지' 를 표현할 것인가?
	
	@JsonProperty("pagerows")
	private int pageRows; // 한 '페이지' 에 몇개의 글을 리스트 할 것인가?
}
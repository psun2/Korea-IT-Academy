package com.lec.sts19_rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lec.sts19_rest.domain.AjaxWriteList;
import com.lec.sts19_rest.domain.AjaxWriteResult;
import com.lec.sts19_rest.domain.WriteDTO;
import com.lec.sts19_rest.service.AjaxService;

@RestController
@RequestMapping("/board")
public class AjaxController {

	@Autowired
	AjaxService ajaxService;

	// 글 목록 (페이징)
	@GetMapping("/{page}/{pageRows}")
	public AjaxWriteList list(@PathVariable int page, // 현재 페이지
			@PathVariable int pageRows) { // 한 '페이지' 에 몇개의 글을 리스트

		// response 에 필요한 값들
		StringBuffer message = new StringBuffer();
		String status = "FAIL";

		// 페이징 관련 세팅 값들
		int writePages = 10; // 한 [페이징] 에 몇개의 '페이지'를 표현할 것인가?
		int totalPage = 0; // 총 몇 '페이지' 분량인가?
		int totalCnt = 0; // 글은 총 몇개인가?

		List<WriteDTO> list = null;

		try {
			// 글 전체 개수 구하기
			totalCnt = ajaxService.count();

			// 총 몇 페이지 분량?
			totalPage = (int) Math.ceil(totalCnt / (double) pageRows);

			// from: 몇번째 row 부터?
			int from = (page - 1) * pageRows + 1; // ORACLE 은 1부터 시작
//			int from = (page - 1) * pageRows;  // MySQL 은 0부터 시작

			list = ajaxService.list(from, pageRows);

			if (list == null) {
				message.append("[리스트할 데이터가 없습니다]");
			} else {
				status = "OK";
			}

		} catch (Exception e) {
			e.printStackTrace();
			message.append("[트랜잭션 에러:" + e.getMessage() + "]");
		}

		AjaxWriteList result = new AjaxWriteList();
		result.setStatus(status);
		result.setMessage(message.toString());

		if (list != null) {
			result.setCount(list.size());
			result.setList(list);
		}

		result.setPage(page);
		result.setTotalPage(totalPage);
		result.setWritePages(writePages);
		result.setPageRows(pageRows);
		result.setTotalCnt(totalCnt);

		return result;
	}

	// 글 읽기
	@GetMapping("/{uid}") // URI : /board/{uid}
	public AjaxWriteList view(@PathVariable("uid") int uid) {
		List<WriteDTO> list = null;

		StringBuffer message = new StringBuffer();
		String status = "FAIL";

		try {
			list = ajaxService.viewByUid(uid); // 조회수 증가 + 읽기
			if (list.size() == 0) {
				// 나중에 상수화 시켜 관리 하는 것도 방법입니다.
				// Ex) C.java
				message.append("[해당 데이터가 없습니다.]");
			} else {
				status = "OK";
			}
		} catch (Exception e) {
			e.printStackTrace();
			message.append("[트랜잭션 에러: " + e.getMessage() + "]");
		}

		AjaxWriteList result = new AjaxWriteList();
		result.setStatus(status);
		result.setMessage(message.toString());

		if (list != null) {
			result.setCount(list.size());
			result.setList(list);
		}

		return result;
	}

	// 글작성
	@PostMapping("") // url : /board
	public AjaxWriteResult writeOk(WriteDTO dto) {

		StringBuffer message = new StringBuffer();
		String status = "FAIL";

		int cnt = 0;

		try {
			cnt = ajaxService.write(dto);
			if (cnt == 0) {
				message.append("[트랜잭션 실패 : 0 insert]");
			} else {
				status = "OK";
			}
		} catch (Exception e) {
			message.append("[트랜잭션 에러: " + e.getMessage() + "]");
		}

		AjaxWriteResult result = new AjaxWriteResult();
		result.setStatus(status);
		result.setMessage(message.toString());
		result.setCount(cnt);
		return result;
	}

	// @ResponseBody // jackson 을 사용중이기때문에 굳이 필요 없습니다.
	// 톰캣은 내부적으로 보안상의 이유료 PUT 과 DELETE, POST 메소드의 제한이 있습니다. // 글수정
	@PutMapping("")
	public AjaxWriteResult updateOk(@RequestBody WriteDTO dto) { // 반면 prameter 에는 @RequestBody 꼭 사용 되여야 body 를 받을 수
																	// 있습니다.
		// @PutMapping이나 @DeleteMapping을 통해 리소스 id를 @PathVariable로 받고 // 그 외의
		// 변수들은 @RequestParam으로 받으려고 했을 때, query string이 // 아닌 body에 데이터를 넣고 전송하려하면
		// 정상적으로 작동하지 않는다.

		// server.xml => <Connector URIEncoding="UTF-8"
		// parseBodyMethod="POST,PUT,DELETE" connectionTimeout="20000" port="8080"
		// protocol="HTTP/1.1" redirectPort="8443"/>

		// System.out.println(dto); // 이부분에서 자꾸 nullpoint Error
		// 톰캣의 내부적으로 dto를 받지 않지만 어디선가 mapping을 해주는 부분이
		// 이쪽보다 더 뒤인듯 합니다.
		// 그래서 자꾸 Error 이 발생하는 듯 합니다.
		// 내부적으로 Mapping 시켜줄뿐 저 dto는 아무래도 껍데기인듯 합니다.

		// 아 ....timestamp 부분이 셋팅이 안되는데 내부적으로 getter가 적용되여
		// timestamp 부분이 계속 에러....
		System.out.println(dto.getUid()); // 이곳은 mapping이 되는데...
		System.out.println(dto.getSubject());
		System.out.println(dto.getContent());

		int cnt = 0;

		StringBuffer message = new StringBuffer();
		String status = "FAIL";

		try {
			cnt = ajaxService.update(dto);
			status = "OK";

			if (cnt == 0) {
				message.append("[트랜잭션 실패: 0 update]");
			}
		} catch (Exception e) {
			e.printStackTrace();
			message.append("[트랜잭션 에러: " + e.getMessage() + "]");
		}

		AjaxWriteResult result = new AjaxWriteResult();
		result.setStatus(status);
		result.setMessage(message.toString());
		result.setCount(cnt);

		// System.out.println(dto); => 여기서도 에러....
		// 내부적으로 Mapping 시켜줄뿐 저 dto는 아무래도 껍데기인듯 합니다.

		return result;
	}// 글삭제

	@DeleteMapping("")
	public AjaxWriteResult deleteOk(@RequestParam("uid") int[] uids) {

		System.out.println(Arrays.toString(uids));

		int cnt = 0;

		StringBuffer message = new StringBuffer();
		String status = "FAIL";

		try {
			if (uids != null)
				cnt = ajaxService.deleteByUid(uids);

			status = "OK";

		} catch (Exception e) {
			e.printStackTrace();
			message.append("[트랜잭션 에러: " + e.getMessage() + "]");
		}

		AjaxWriteResult result = new AjaxWriteResult();
		result.setStatus(status);
		result.setMessage(message.toString());
		result.setCount(cnt);
		return result;
	}

}

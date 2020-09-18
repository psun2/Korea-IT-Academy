package jdbc_service;

import java.util.ArrayList;
import java.util.Date;

import jdbc_p.ResExamDAO;
import jdbc_p.ResExamDTO;

public class ResExamMain {

	public static void main(String[] args) {

		// 구룹함수 max 사용
		System.out.println(new ResExamDAO().insert(new ResExamDTO("eee", "중간", new Date(), 27, 57)));

		ResExamDTO bbb = new ResExamDTO("ccc", "기말", "2020-05-05", 27, 57);
		System.out.println(bbb);
		System.out.println(new ResExamDAO().insert(bbb));

		System.out.println();

		// 시퀀스 사용 - insert All 에 약점이 있음.....
		System.out.println(new ResExamDAO().insert2(new ResExamDTO("eee", "중간", new Date(), 213, 213)));

		System.out.println();
		
		// insetAll 이 아닌 insetList 사용
		ArrayList<ResExamDTO> list = new ArrayList<ResExamDTO>();
		
		list.add(new ResExamDTO("ddd", "중간", new Date(), 77, 57));
		list.add(new ResExamDTO("ddd", "중간", new Date(), 77, 57));
		list.add(new ResExamDTO("ddd", "중간", new Date(), 77, 57));
		list.add(new ResExamDTO("ddd", "중간", new Date(), 77, 57));
		
		new ResExamDAO().insertList(list);

		for (ResExamDTO dto : new ResExamDAO().list(1)) {
			System.out.println(dto);
		}

	}

}

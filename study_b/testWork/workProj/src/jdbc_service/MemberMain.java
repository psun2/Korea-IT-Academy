package jdbc_service;

import jdbc_p.MemDAO;
import jdbc_p.MemDTO;

public class MemberMain {

	public static void main(String[] args) {

		for (MemDTO mem : new MemDAO().list()) {
//			System.out.println(mem.getId());

			System.out.println(mem);
		}
		
		

		MemDTO dto = new MemDTO();
		dto.setId("ggg");
		dto.setNo(22);
		dto.setName("이호호");
		dto.setHeight(80.17);
		dto.setBirthStr("2998-12-18");
		dto.setRegdateStr("3017-05-04");
		dto.setHobby("qwer");
		// new MemDAO().insert(dto);
		// System.out.println(new MemDAO().insert(dto)); // 1 => 실행된 갯수를 반환 // 추가

		// id 가 겹쳐서 어떤것을 삭제해야 될지 몰라 무한 루프에 빠지게 되었습니다. => ggg 가 3개 였습니다.
		// System.out.println(new MemDAO().modify(dto)); // 1 => 실행된 갯수를 반환 // 수정

		// System.out.println(new MemDAO().delete("hhh")); // 삭제

		for (MemDTO mem : new MemDAO().list()) { // 목록
//			System.out.println(mem.getId());

			System.out.println(mem);
		}

		System.out.println("-------------------------------------------------------------");
		System.out.println(new MemDAO().detail("aaa"));

	}

}

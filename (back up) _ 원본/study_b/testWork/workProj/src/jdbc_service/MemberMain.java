package jdbc_service;

import jdbc_p.MemDAO;
import jdbc_p.MemDTO;

public class MemberMain {

	public static void main(String[] args) {
		
		
		MemDTO dto = new MemDTO();
		dto.setId("zxcdfgtg");
		dto.setNo(22);
		dto.setName("이호호");
		dto.setHeight(171.17);
		dto.setBirthStr("1988-12-18");
		dto.setRegdateStr("2019-06-14");
		dto.setHobby("삼리");
		//System.out.println(new MemDAO().insert(dto)); 추가
		
		//System.out.println(new MemDAO().modify(dto)); //수정
		
		//System.out.println(new MemDAO().delete("erwvfdgtreuhert")); //삭제
		
		for (MemDTO mem : new MemDAO().list()) {  //목록
			//System.out.println(mem.getId());
			System.out.println(mem);
		}
		System.out.println("------------------------------");
		//상세
		System.out.println(new MemDAO().detail("wefmoewfjewmof"));

	}

}

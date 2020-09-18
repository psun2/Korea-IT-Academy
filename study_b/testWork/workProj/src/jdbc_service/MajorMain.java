package jdbc_service;

import java.util.ArrayList;

import jdbc_p.MajorDAO;
import jdbc_p.MajorDTO;

public class MajorMain {

	public static void main(String[] args) {

		// new MajorDAO().insert(new MajorDTO("tb", "화공"));

		// 누구는 성공하고 누구는 실패하면 안됨
		ArrayList<MajorDTO> list = new ArrayList<MajorDTO>();
//		list.add(new MajorDTO("music", "음악"));
//		list.add(new MajorDTO("art", "미술"));
//		list.add(new MajorDTO("art", "행위예술"));
		list.add(new MajorDTO("judo", "유도"));
		list.add(new MajorDTO("taekwondo", "태권도"));
		list.add(new MajorDTO("yeouido", "여의도"));

		// new MajorDAO().insertList_1(list);
		new MajorDAO().insertList_2(list);

		for (MajorDTO dto : new MajorDAO().list()) {
			System.out.println(dto);
		}

		// MajorDTO [id=tb, name=화공]
		// MajorDTO [id=com, name=컴퓨터공학]
	}

}

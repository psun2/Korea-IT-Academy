package jdbc_p;

import java.util.ArrayList;

public class ExamMain {

	public static void main(String[] args) {

		ArrayList<ExamDTO> arr = new ArrayList<ExamDTO>();
		arr.add(new ExamDTO(55, "중간", "aaa", "2019-05-08", 62,64,68));
		arr.add(new ExamDTO(56, "기말", "ccc", "2019-05-08", 52,54,58));
		arr.add(new ExamDTO(57, "소말", "ddd", "2019-05-08", 92,94,98));
		arr.add(new ExamDTO(58, "중간", "eee", "2019-05-08", 72,74,78));
		//new ExamDAO().insert_2(arr);
		
		//int res = new ExamDAO().insertOne(new ExamDTO("기말", "fff",  22,34,48));
		
		ExamDTO dto = new ExamDTO("기말", "fff",  22,34,48);
		new ExamDAO().insertOne(dto);
		System.out.println(dto);
//		for (ExamDTO dto: new ExamDAO().list()) {
//			System.out.println(dto);
//		}
		
		System.out.println("--------------------");
		

	}

}

package oops_p;

import java.util.Arrays;

class Stud{
	
	String name;
	
	int [] jum;
	
	int tot;
	
	double avg;
	
	
}

public class StudMain {

	public static void main(String[] args) {
		
		//System.out.println(st1);
		
		//Stud [] arr = {new Stud(), new Stud(), new Stud()};
		
		Stud [] arr = new Stud[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Stud();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		arr[0].name = "이효리";
		arr[0].jum = new int[]{77,79,71};
		
		arr[1].name = "삼효리";
		arr[1].jum = new int[]{97,99,91};
		
		arr[2].name = "사효리";
		arr[2].jum = new int[]{87,89,81};
		
		
		for (Stud s : arr) {
			for (int j : s.jum) {
				s.tot += j;
			}
			s.avg = (double)s.tot/s.jum.length;
		}
		
		
		
//		System.out.println(arr[0].name);
//		System.out.println(Arrays.toString(arr[0].jum));
//		System.out.println(arr[0].tot);
//		System.out.println(arr[0].avg);
		
		for (Stud s : arr) {
			String ttt = s.name+"\t";
			for (int j : s.jum) {
				ttt += j+"\t";
			}
			ttt += s.tot+"\t";
			ttt += s.avg;
			
			System.out.println(ttt);
		}

	}
	
	//직사각형 클래스를 완성하세요

	   //멤버변수 : 도형 이름,가로,세로, 넓이, 둘레

	  // 직사각형 5개 입력받아 출력하고
	  //넓이, 둘레의 전체 합계, 평균
	  //              최대, 최소
	
	

}


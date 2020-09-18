package oops_p;

import java.util.Arrays;

class MethodStud{
	
	String name;
	
	int [] jum;
	
	int ban,tot, avg, rank, pos;
	
	
	///1. 초기화
	void init(int ban,String name, int kor, int eng, int mat) {
		this.ban = ban;
		this.name = name;
		jum = new int[] {kor,  eng,  mat};
		
		calc();
		//ppp();
	}
	
	//2.1 연산부
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	//2.2 등수계산
	void rankCalc(MethodStud [] studs, int kind) {
		rank=1;
		
		
		for (MethodStud you : studs) {
			boolean [] chk = {
					avg < you.avg
					,avg < you.avg && ban == you.ban};
			
			if(chk[kind])
				rank++;
		}
	}
	
	//pos 위치 선정
	void posSet(int [] banCnt) {
		pos = rank;
		
		for (int i = 0; i < ban; i++) {
			pos+=banCnt[i];
		}
	}
	
	//3. 출력부
	void ppp() {
		String ttt = ban+"\t"+name+"\t";
		for (int i : jum) {
			ttt += i+"\t";
		}
		ttt+= tot +"\t"+ avg+"\t"+ rank+"\t"+ pos;
		
		System.out.println(ttt);
	}
	
}

public class MethodStudMain {

	public static void main(String[] args) {
		MethodStud [] arr = new MethodStud[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new MethodStud();
		}
		
		arr[0].init(1,"현빈", 77,79,71);
		arr[1].init(4,"원빈", 67,69,61);
		arr[2].init(2,"박현빈", 97,99,91);
		arr[3].init(2,"김우빈", 57,59,51);
		arr[4].init(4,"장희빈", 87,89,81);
		arr[5].init(2,"골빈", 74,71,71);
		arr[6].init(2,"미스터빈", 62,69,61);
		arr[7].init(4,"젤리빈", 93,99,91);
		arr[8].init(1,"커피빈", 52,59,51);
		arr[9].init(4,"자바빈", 38,89,81);
		
		int max = 0;
		for (MethodStud me : arr) {
			if(max<me.ban)
				max=me.ban;
			me.rankCalc(arr, 1);
		}
		
		int [] banCnt = new int[max+1];
		
		//반 인원수 세기
		for (MethodStud me : arr) {
			banCnt[me.ban]++;
			
		}
		
		//반 표시 위치 배열
		int [] indexPos = new int[max+1];
		
		//반 표시 위치 설정
		for (int i = 0; i < indexPos.length; i++) {
			for (int j = 0; j < i; j++) {
				indexPos[i]+= banCnt[j];
			}
		}
		System.out.println(Arrays.toString(banCnt));
		System.out.println(Arrays.toString(indexPos));
		/*
		[0, 2, 4, 0, 4]
		    1  2  3  4
		    
		    2반 3등  - 5  0->1 인원수 + 등수
		    4반 2등  - 8  0->3 인원수 + 등수 
		*/
		for (MethodStud me : arr) {
			me.posSet(banCnt);	
		}

		for (int j = 1; j <= arr.length; j++) {
			
			for (int i = 1; i < indexPos.length; i++) {
				if(indexPos[i]==j-1)
					System.out.println(i+"반>>>>>");
			}
			
			for (MethodStud me : arr) {
				if(j==me.pos)
					me.ppp();
			
			}
		}
		// -- 반클래스를 이용하여 학생 정보를 생성해 주세요
		// -- 반별로 구분하여 출력해 주세요 
		// 반별로 등수순서대로 출력해 주세요(등수는 1.  반별등수, 2. 전체등수)

	}

}

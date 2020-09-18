package oops_p;

class ReturnStud{
	
	String name;
	
	int [] jum;
	
	int ban,tot, avg,pos;
	              //반, 전체
	int [] rank = { 1,  1};
	
	
	
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
	void rankCalc(ReturnStud [] studs, int rr) {
		
		for (ReturnStud you : studs) {
			System.out.println(name+":"+you.name);
			if(avg < you.avg)
				rank[rr]++;
		}
		System.out.println("#####");
	}
	
//	void rankTotCalc(ReturnBan [] bans) {
//		for (ReturnBan ban : bans) {
//			rankCalc(ban.arr,1);
//		}
//		
//	}
	
	//pos 위치 선정
	void posSet(int [] banCnt) {
		pos = rank[0];
		
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
		ttt+= tot +"\t"+ avg+"\t";
		
		for (int i :rank) {
			ttt+=i+"\t";
		}
		ttt+= pos;
		
		System.out.println(ttt);
	}
	
}


class ReturnBan{
	
	int ban;
	
	ReturnStud [] arr = new ReturnStud[0];
	
	void addStud(ReturnStud rs) {
		ReturnStud [] buf = new ReturnStud[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			buf[i]= arr[i];
		}
		buf[arr.length] = rs;
		arr= buf;
	}
	
	void makeStud(String name, int kor, int eng, int mat) {
		ReturnStud rs = new ReturnStud();
		rs.init(ban, name, kor, eng, mat);
		addStud(rs);
	}
	
	void rankCal(ReturnBan [] bans) {
		for (ReturnStud rs : arr) {
			
			System.out.println(rs.name+" 반별 >>>>>");
			
			rs.rankCalc(arr,0);  //   ---- 반별등수
			//rs.rankTotCalc(bans);
			
			System.out.println(rs.name+" 전체 >>>>>>");
			 //전체등수
			for (ReturnBan ban : bans) { 
				//자기네 반만이 아닌 전체 반의 학생을 반복문으로 실행 
				rs.rankCalc(ban.arr,1);
			}
			
		}
	}
	
	void ppp() {
		System.out.println(ban+"반 >>>>>");
		for (ReturnStud rs : arr) {
			rs.ppp();
		}
	}
	
}


public class ReturnStudMain {

	public static void main(String[] args) {
		ReturnBan [] arr = {
				new ReturnBan(),
				new ReturnBan(),
				new ReturnBan(),
				new ReturnBan()
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].ban = i+1;
		}
		
		
		arr[0].makeStud("현빈", 77,79,71);
		arr[1].makeStud("원빈", 67,69,61);
		arr[1].makeStud("박현빈", 97,99,91);
		arr[3].makeStud("김우빈", 57,59,51);
		arr[2].makeStud("장희빈", 87,89,81);
		arr[2].makeStud("골빈", 74,71,71);
		arr[3].makeStud("미스터빈", 62,69,61);
		arr[1].makeStud("젤리빈", 93,99,91);
		arr[2].makeStud("커피빈", 52,59,51);
		arr[2].makeStud("자바빈", 38,89,81);
		
		
		for (ReturnBan bb : arr) {
			System.out.println(bb.ban+"반 등수계산");
			
			bb.rankCal(arr);
		

		}

		System.out.println("-----------------------");
		for (ReturnBan bb : arr) {
			//bb.ppp();
		

		}

	}

}

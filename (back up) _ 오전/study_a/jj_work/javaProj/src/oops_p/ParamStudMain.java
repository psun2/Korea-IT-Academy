package oops_p;

class ParamStud{
	
	String name, kind;
	
	int [] jum;
	
	int tot, avg, rank ,kk;
	
	void init(String name, int... jum) {
		this.name = name;
		this.jum = jum;
		kk= jum.length-3;
		cal();
	}
	
	void cal() {
		
		kind = new String[] {"일반","예체능"}[kk];
		
		for (int i : jum) {
			tot += i;
		}
		
		avg = tot / jum.length;
		
	}
	void rankCal(ParamStud [] arr) {
		rank=1;
		for (ParamStud you : arr) {
			
			if(avg <you.avg)
				rank++;
			
		}
	}
	
	void ppp() {
		String ttt = kind +"\t"+name+"\t";
		
		for (int i : jum) {
			ttt += i+"\t";
		}
		
		if(kind =="일반")
			ttt += "\t";
		
		ttt += tot+"\t"+avg+"\t"+rank;
		
		System.out.println(ttt);
	}
	
}

class ParamBan{
	
	ParamStud [][] arr = new ParamStud[2][0];
	
	
	void addArr(ParamStud ret) {
		ParamStud [] buf = new ParamStud[arr[ret.kk].length+1];
		
		for (int i = 0; i < arr[ret.kk].length; i++) {
			buf[i] = arr[ret.kk][i];
		}
		buf[arr[ret.kk].length] = ret;
		
		arr[ret.kk] = buf;
	}
	
	ParamStud makeSt(String name, int... jum) {
		ParamStud ret = new ParamStud();
		ret.init(name, jum);
		addArr(ret);
		return ret;
	}
	
	void rankCalc() {
		for (ParamStud[] pp : arr) {
			
			for (ParamStud st : pp) {
				st.rankCal(pp);
			}
		}
	}
	
	
	void ppp(){
		
		String [] title = {"일반","예체능"};
		
		
		for (int i = 0; i < title.length; i++) {
			
			System.out.println(title[i]+">>>>");
			
			for (ParamStud st : arr[i]) {
				st.rankCal(arr[i]);
				st.ppp();
			}
			
		}
			
			
			
		
	}
	
}


public class ParamStudMain {

	public static void main(String[] args) {
		ParamBan pb = new ParamBan();
		
		
				
		pb.makeSt("현빈", 77,79,71,78);
		pb.makeSt("원빈", 67,69,61);
		pb.makeSt("박현빈", 97,99,91,98);
		pb.makeSt("김우빈", 57,59,51);
		pb.makeSt("장희빈", 87,89,81);
		pb.makeSt("골빈", 74,71,71);
		pb.makeSt("미스터빈", 62,69,61);
		pb.makeSt("젤리빈", 93,99,91);
		pb.makeSt("커피빈", 52,59,51,52);
		pb.makeSt("자바빈", 38,89,81,71);
		
		
		//pb.rankCalc();
		pb.ppp();
		
/*
		 까페를 구현하세요

  (커피이름, 옵션...) 을 넣어 커피를 리턴해주세요
      
    커피이름 : 
    아메리카노 2000  아시아노 2300  아프리카노 2700
    
    아이스 +300  , 휘핑크림 + 400
    
    샷추가 +200 , 사이즈업+1000, 
    
  1. 커피 : 커피이름, 가격
 
  2. 리턴을  커피종류별로 할것
  
  3. 커피종류별 가격합계, 건수 출력할 것
		 * 
*/

	}

}

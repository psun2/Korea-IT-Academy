package class_p;


enum Type{
	
	//"WALKING"
	WALKING, RUNNING, TRACKING, HIKING;
	
	
}

public class EnumMain {

	public static void main(String[] args) {
		//System.out.println(Type);
		
		System.out.println(Type.WALKING);
		System.out.println(Type.RUNNING);
		System.out.println(Type.TRACKING);
		System.out.println(Type.HIKING);
		
		System.out.println("Type.values():"+Type.values());  //Type 배열

		System.out.println("Type.values().length:"+Type.values().length);
		
		for (int i = 0; i < Type.values().length; i++) {
			System.out.println(i+":"+Type.values()[i]);
		}
		System.out.println("ordinal()------------");
		
		System.out.println(Type.WALKING+":"+Type.WALKING.ordinal());
		System.out.println(Type.RUNNING+":"+Type.RUNNING.ordinal());
		System.out.println(Type.TRACKING+":"+Type.TRACKING.ordinal());
		System.out.println(Type.HIKING+":"+Type.HIKING.ordinal());
		
		System.out.println("valueOf(str)------------");
		String str = "WALKING";
		System.out.println(str+":"+Type.valueOf(str)+","+Type.valueOf(str).ordinal());
		
		String sss = "WALKING,HIKING,RUNNING,WALKING";
		System.out.println(sss);
		
		for (String s : sss.split(",")) {
			System.out.println(s+":"+Type.valueOf(s).ordinal());
		}
		
		
		System.out.println("누적 합계 >>>>>>>>>>>");
		int [] cnt = new int[Type.values().length];
		
		for (String s : sss.split(",")) {
			cnt[Type.valueOf(s).ordinal()]++;
		}
		
		for (Type tt : Type.values()) {
			System.out.println(tt+":"+cnt[tt.ordinal()]);
		}
		
		
		/*
		커피를 주문하세요

		아메리카노:2000
		아시아노:2300
		아프리카노:2700
		
		주문서1 : AMERICANO_2,ASIANO_3,AFRICANO_1
		주문서2 : AFRICANO_2,ASIANO_1
		주문서3 : AFRICANO_2,AMERICANO_1,ASIANO_2
		
		출력
		주문서1 : AMERICANO_2(4000), ASIANO_3(6900), AFRICANO_1(2700) : ?
		주문서2 : AMERICANO_0(0),    ASIANO_1(2300), AFRICANO_2(5400) : ?
		주문서3 : AMERICANO_1(2000), ASIANO_2(4600), AFRICANO_2(5400) : ?
		-------------------------------------------------------------
		합계 : AMERICANO_3(6000)
			 ASIANO_6(13800)
			 AFRICANO_5(13500)
			 ----------------------
			      ?
		*/
		
	}

}



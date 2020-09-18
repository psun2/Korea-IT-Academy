package class_p;
class OuterPhone{
	String name;
	int cnt;
	public OuterPhone(String name) {
		super();
		this.name = name;
	}
	
	void sale(int cnt) {
		this.cnt += cnt;
		System.out.println(
				name+" 본사 핸드폰 팔아요:"+cnt+"("+this.cnt+")");
	}
	
	@Override
	public String toString() {
		return "본사 [name=" + name + ", cnt=" + cnt + "]";
	}
	
	class InnerPhone{
		String name;
		int cnt;
		public InnerPhone(String name) {
			
			this.name = name;
		}
		
		void sale2(int cnt) {
			OuterPhone.this.cnt += cnt;
			this.cnt+=cnt;
			System.out.println(
			OuterPhone.this.name+" "+this.name+" 대리점 핸드폰 팔아요:"+
					cnt+"("+this.cnt+"/"+OuterPhone.this.cnt+")");
		}
		
		@Override
		public String toString() {
			return "대리점 [name=" + name + ", cnt=" + cnt + "]";
		}
		
	}
}
public class InnerPhoneMain {

	public static void main(String[] args) {
		OuterPhone kt = new OuterPhone("kt");
		OuterPhone lg = new OuterPhone("lg");
		
		OuterPhone.InnerPhone [] ip = {
				kt.new InnerPhone("강남"), 
				kt.new InnerPhone("서초"),
				kt.new InnerPhone("송파"),
		
				lg.new InnerPhone("강동"),
				lg.new InnerPhone("노원")
		};
		
		
		kt.sale(1);
		ip[0].sale2(2);
		ip[1].sale2(1);
		ip[4].sale2(3);
		ip[3].sale2(2);
		lg.sale(2);
		ip[4].sale2(3);
		kt.sale(3);
		ip[2].sale2(2);
		ip[4].sale2(4);
		lg.sale(1);
		ip[3].sale2(1);
		
		System.out.println("----------------");
		for (OuterPhone.InnerPhone oi : ip) {
			System.out.println(oi);
		}
		System.out.println(kt);
		System.out.println(lg);
		

		/*
		 커피 전문점을 구현하세요
		 
		 별다방, 커피콩
		 
		 지역별로 커피전문점이 존재
		 별다방 - 역삼,종로,신촌
		 커피콩 - 역삼,구로,청량리
		
		               별다방,  커피콩
		아메리카노:2000	2100
		아시아노:2300		2500
		아프리카노:2700	2200
		
		
		
		각 지점이 커피를 주문받으세요(각 지점에서만 주문가능)
		각 지점별 커피 판매내역과
		전체 지점 커피 판매 내역을 출력하세요
		 
		별다방역삼 주문(아메리카노) -> 별다방 역삼 아메리카노 2000 주문 			
		 커피콩청량리 주문(아시아노)
		 별다방종로 주문(아메리카노)
		 커피콩역삼 주문(아프리카노)
		 
		 -----------------------------
		 판매내역
		 별다방 역삼:
		 아메리카노 : ? - ?
		 아시아노 : ? - ?
		 아프리카노 : ? - ?
		  별다방 종로:
		 아메리카노 : ? - ?
		 아시아노 : ? - ?
		 아프리카노 : ? - ?
		 ...
		 커피콩 역삼:
		 아메리카노 : ? - ?
		 아시아노 : ? - ?
		 아프리카노 : ? - ?
		---------------------------------
		별다방 :
		 아메리카노 : ? - ?
		 아시아노 : ? - ?
		 아프리카노 : ? - ?
		
		 커피콩 :
		 아메리카노 : ? - ?
		 아시아노 : ? - ?
		 아프리카노 : ? - ?
		 
		 */
		
		
	}

}


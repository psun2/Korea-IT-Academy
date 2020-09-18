package oops_p;

//직사각형 클래스를 완성하세요
//멤버변수 : 도형이름, 가로, 세로, 넓이, 둘레
// 직사각형 5개 입력받아 출력하고
//넓이, 둘레의 전체 합계, 평균
// 최대 최소

class RectangleCla{
	String name;
	int w, h, area, border;
}

public class RectangleMain {

	public static void main(String[] args) {

		//1. 입력부
		RectangleCla [] arr = new RectangleCla[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new RectangleCla();
		}
		
		arr[0].name = "직일각형";
		arr[0].w = 24;
		arr[0].h = 35;
		
		arr[1].name = "직이각형";
		arr[1].w = 156;
		arr[1].h = 1;
		
		arr[2].name = "직삼각형";
		arr[2].w = 18;
		arr[2].h = 19;
		
		arr[3].name = "직사각형";
		arr[3].w = 10;
		arr[3].h = 20;
		
		arr[4].name = "직오각형";
		arr[4].w = 30;
		arr[4].h = 40;
		
		RectangleCla [] res = {
				new RectangleCla(),new RectangleCla()
				,new RectangleCla(),new RectangleCla()};
		
		
		res[0].name = "합계";
		res[1].name = "평균";
		res[2].name = "최대";  ///초기값 0, 0
		res[3].name = "최소";
		
		
		
		
		//2.1  개별 연산부
		for (RectangleCla rec : arr) {
			
			rec.border = (rec.w+rec.h)*2;
			rec.area = rec.w*rec.h;
		}
		
		
		//2.2 통계 연산부
		res[3].border=arr[0].border; //계산된 맨 처음 도형의 둘레를 기본값으로 가져감
		res[3].area=arr[0].area;     //계산된 맨 처음 도형의 크기를 기본값으로 가져감
		
		for (RectangleCla rec : arr) {
			
			res[0].w +=rec.w;
			res[0].h +=rec.h;
			res[0].border +=rec.border;
			res[0].area +=rec.area;
			
			if(res[2].border<rec.border) {
				res[2].border=rec.border;
			}
			if(res[2].area<rec.area) {
				res[2].area=rec.area;
			}
			
			if(res[3].border>rec.border) {
				res[3].border=rec.border;
			}
			if(res[3].area>rec.area) {
				res[3].area=rec.area;
			}
			
		}
		
		res[1].w =res[0].w/arr.length;
		res[1].h =res[0].h/arr.length;
		res[1].border =res[0].border/arr.length;
		res[1].area=res[0].area/arr.length;
		
		//3. 출력부
		
		for (RectangleCla rec : arr) {
			String ttt = rec.name+"\t"
					+rec.h+"\t"
					+rec.w+"\t"
					+rec.area+"\t"
					+rec.border;
			System.out.println(ttt);
		}
		System.out.println("-------------------------------------");
		for (RectangleCla rec : res) {
			String ttt = rec.name+"\t"
					+rec.h+"\t"
					+rec.w+"\t"
					+rec.area+"\t"
					+rec.border;
			System.out.println(ttt);
		}

	}

}

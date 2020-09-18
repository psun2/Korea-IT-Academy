package lang_p;



abstract class ClaShape{
	double area, border;
	
	String name;
	
	
	public ClaShape(String name) {
		super();
		this.name = name;
	}

	abstract void calc();

	@Override
	public String toString() {
		calc();
		return "ClaShape [name=" + name + ", area=" + area + ", border=" + border + "]";
	}
	
}
class ClaRec extends ClaShape{
	int w, h;

	/// 매개변수의 갯수가 여러개로 지정가능하기 때문에 필요한 매개변수를 직접 정의 :typeArr 방식
	public ClaRec(Integer w, Integer h) {
		super("직사각형");
		this.w = w;
		this.h = h;
	}
	
	//배열원소를 한개를 받아 처리하는 방식 때문에 배열 형태의 매개변수 필요 : typeOne 방식
	public ClaRec(Integer ... i) {
		super("직사각형");
		this.w = i[0];
		this.h = i[1];
	}
	
	@Override
	void calc() {
		area = w*h;
		border = (w+h)*2;	
	}
	
}

class ClaCir extends ClaShape{
	int r;

	/// 매개변수의 갯수가 여러개로 지정가능하기 때문에 필요한 매개변수를 직접 정의 :typeArr 방식
	public ClaCir(Integer r) {
		super("원");
		this.r = r;
	}
	
	//배열원소를 한개를 받아 처리하는 방식 때문에 배열 형태의 매개변수 필요 : typeOne 방식
	public ClaCir(Integer ... i) {  
		super("원");
		this.r = i[0];
	}
	
	@Override
	void calc() {
		area = Math.PI*Math.pow(r,2);
		border = Math.PI*r*2;	
	}
	
}


class BindCla{
	String claName;
	
	Class [] typeArr;   ///getConstructor 의 매개변수로  Class를 여러개로 받아 처리
	Class typeOne;		///getConstructor 의 매개변수로 배열형.Class로 한개로 처리
	Integer [] init;

	//// 1. Class 타입 여러개 받기 처리  - typeArr
	public BindCla(String claName, Class[] type, Integer ... init) {
		super();
		this.claName = claName;
		this.typeArr = type;
		this.init = init;
	}

	
	//  2. Class 배열로 한개 받기 처리 1 - typeOne
	public BindCla(String claName,  Integer ... init) {
	// public BindCla(String claName,Class[] type,  Integer ... init) {
//                                      이러한 형태로 받아서
		//this.typeOne = type[].class; 와 같은 처리 방식은 불가
		super();
		this.claName = claName;
		this.typeOne = Integer[].class;
		this.init = init;
	}
	
	
	// 3. Class 배열로 한개 받기 처리 2 - typeOne (type을 매개변수로 받음)
	public BindCla(String claName, Class typeOne, Integer ... init) {
		
			super();
			this.claName = claName;
			this.typeOne = typeOne;
			this.init = init;
		}
	
	
}

public class ClassShapeMain {

	public static void main(String[] args) throws Exception{
		//// 생성자 하나씩 지정하여 geConstructor 직접 처리 
		System.out.println("getConstructor 직접처리---------------------------------");
		ClaShape [] arr = {
				(ClaShape)Class.forName("lang_p.ClaRec").
				getConstructor(Integer.class, Integer.class).newInstance(5,6),
				(ClaShape)Class.forName("lang_p.ClaCir").
				getConstructor(Integer.class).newInstance(5)
		};
		
		for (ClaShape sh : arr) {
			System.out.println(sh);
		}
		
		System.out.println("typeArr --------------------------------------------");

		
		/// 생성자 타입 배열로 묶어 여러개로 알게 처리 : typeArr
		BindCla [] bbArr = {
				new BindCla("lang_p.ClaRec", 
						// 클래스를 배열로 묶어서 보내기 처리
							new Class[] {Integer.class, Integer.class}, 
							7,8),
				new BindCla("lang_p.ClaCir", 
							new Class[] {Integer.class}, 
							9)
		};
		
		for (BindCla bc : bbArr) {
			System.out.println(bc.typeArr);
			System.out.println((ClaShape)Class.forName(bc.claName).
				getConstructor(bc.typeArr).newInstance(bc.init));
			// 클래스 클래스를 받아 처리하여 생성자에 여러개의 매개변수를 인지
			// 생성시 매개변수를 여러개로 처리하는 것이 가능
			
		}
		
		System.out.println("typeOne ---------------------------------");
		
		
		/// 생성자 타입 배열.class 로 한개로 알게 처리 : typeOne
		BindCla [] bbArr2 = {
				/// 한개로 넣기 위해서는 가변 매개변수를 사용할 수 없고 배열의 주로 형태로 받도록 처리되었다.
				
				new BindCla("lang_p.ClaRec", 
							new Integer[] {7,8}),
				new BindCla("lang_p.ClaCir",
						Integer[].class,  //자료형배열형태의 클래스로 보내어 처리(한개 짜리) 
						new Integer[] {9})
		};
		
		for (BindCla bc : bbArr2) {
			System.out.println(bc.typeOne);
			System.out.println((ClaShape)Class.forName(bc.claName).
				getConstructor(bc.typeOne).newInstance((Object)bc.init));
			// 생성자의 매개변수가 한개(배열.클래스)로 되어 있어
			/// 생성시 한개로 받아 처리하는 경우는 객체를 한개로 넣는걸로 인지해야하기 때문에 
			//  생성시 매개변수 배열은 Object로 형변환 해야 한다.
		}
		
		///학생 ---> 보기, 쓰기, 삭제
	}

}

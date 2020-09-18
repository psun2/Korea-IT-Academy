package oops;

class RecursiveCall{
	
	String pre="";
	int meth(int no) {
		
		String my = pre;
		pre+="\t";
		
		no-=no%2;
		int res = no;
		
		System.out.println(my+"시작:"+no+","+res);
		
		if(no>0)
			res+=meth(no-2);//증감
		
		System.out.println(my+"끝:"+no+","+res);
		return res;
	}
}

public class RecursiveCallMain {

	public static void main(String[] args) {
		RecursiveCall rc = new RecursiveCall();
		
		int rr = rc.meth(10);  //초기값
		System.out.println("메인:"+rr);

	}

}

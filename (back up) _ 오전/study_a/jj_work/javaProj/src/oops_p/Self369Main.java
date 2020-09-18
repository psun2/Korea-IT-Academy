package oops_p;

class Self369{
	
	
	String ppp(int i) {
		
		String res = "";
		
		if(i>10)
			res+=ppp(i/10);
		
		int one = i%10;
		if(one%3==0 && one!=0)	
			res += "¦";
		
		
		return res;
	}
	
	void gogo(int i) {
		
		if(i>0)
			gogo(i-1);
		
		String res = "";
		
		res = ppp(i);
		
		if(res.equals(""))
			res += i;
		
		System.out.println(res);
		
	}
}
public class Self369Main {

	public static void main(String[] args) {
		
		new Self369().gogo(8000);
	}

}

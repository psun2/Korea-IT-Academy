package control_p;

public class ForStar2 {

	public static void main(String[] args) {
		
		int line = 10;
		int halfLine = line/2;
		for (int i = 0; i <line-1; i++) {
			int hi = i;
			if(hi >= halfLine)
				hi = line-2-i;
			
			for (int j = 0; j <=line; j++) {
				String ch = "*";
				
				if(halfLine - hi <=j && halfLine + hi >=j)
					ch = " ";
				
				System.out.print(ch);
			}
			
			
			System.out.println(i+":"+halfLine+":"+hi);
		}

	}

}

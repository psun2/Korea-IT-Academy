package util_p;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {

		String ttt = "¹Ú½ÃÇö,ÀÌÁÖÇõ,,±è¿¬¼·$±èÇöÁØ.¿À¹Î¼®,ÀåÁ¤È£";
		
		String [] arr = ttt.split("[$.,]");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+":"+arr[i]);
		}
		
		System.out.println("----------------------------");
		
		StringTokenizer stk = new StringTokenizer(ttt,"$.,");
		
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
		

	}

}

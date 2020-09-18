package array_p;

import java.util.Arrays;

public class PrimeNumberMain {

	public static void main(String[] args) {
		int [] arr = {78,11,45,67,9,62,13,26,38,17,61,94,5};
		
		String [] title= {"ÀÏ¹Ý","¼Ò¼ö"};
		int [][] res = new int[title.length][0];  
		/*
		 {
		 	{},
		 	{}
		 }
		*/

		
		for (int i : arr) {
			//System.out.println(i);
			int cnt =1;
			for (int j = 2; j <i; j++) {
				if((cnt=i%j)==0) {
					break;
				}
			}
			
			//System.out.println(i+":"+cnt);
			
			int [] buf = new int[res[cnt].length+1];
			
			for (int j = 0; j < res[cnt].length; j++) {
				buf[j] = res[cnt][j];
			}
			buf[res[cnt].length] = i;
			res[cnt] = buf;
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(title[i]+":"+Arrays.toString(res[i]));
			int tot = 0;
			for (int j : res[i]) {
				tot+=j;
			}
			System.out.println(title[i]+" ÃÑÁ¡:"+tot+", Æò±Õ:"+tot/res[i].length);
		}
	}

}

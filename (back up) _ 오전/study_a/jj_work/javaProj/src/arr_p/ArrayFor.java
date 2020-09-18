package arr_p;

public class ArrayFor {

	public static void main(String[] args) {

		int [] jum = {89,87,84,78,45};
		
		int tot = jum[0]+jum[1]+jum[2]+jum[3];
		
		System.out.println(tot);
		
		tot=0;
		for (int i = 0; i < jum.length; i++) {
			tot+=jum[i];
			System.out.println(i+":"+jum[i]);
		}
		
		int avg = tot/jum.length;
		
		System.out.println(tot+":"+avg);
		
		System.out.println(jum.length); //배열 원소의 갯수
		
		
		
		int [] num = {87,65,82,46,98,65,72,34,91,79,45,67};
		
		int ttt =0;
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]>=70) {
				ttt+=num[i];
				cnt++;
			}
		}
		
		System.out.println(ttt+":"+ttt/cnt);
		
	}

}

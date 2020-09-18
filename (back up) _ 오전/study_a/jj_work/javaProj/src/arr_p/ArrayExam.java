package arr_p;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		
		//1. 입력부  
		String [] name = {"원빈","현빈","골빈","미스터빈","커피빈"	};
		String [] grade = {"가","가","가","가","가","가","양","미","우","수","수"};
		
		int [] kor = {	71,69,90,58,89	};
		int [] eng = {	76,65,92,53,82	};
		int [] mat = {	72,60,91,55,87	};
		
		int [] tot = new int[name.length];
		int [] avg = new int[name.length];
		int [] rank = new int[name.length];
		
		//2. 연산부
		// 2.1 기본 정보 계산
		for (int i = 0; i < tot.length; i++) {
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3;
		}
		
		//2.2 통계계산
		for (int me = 0; me < rank.length; me++) {
			rank[me] = 1;
			
			for (int you = 0; you < rank.length; you++) {
				if(avg[me] < avg[you]) 
					rank[me]++;
			}
			
		}
		
		
		//3. 출력부
		for (int i = 0; i < name.length; i++) {
			
			String res = name[i]+"\t"+
					kor[i]+"\t"+
					eng[i]+"\t"+
					mat[i]+"\t"+
					tot[i]+"\t"+
					avg[i]+"\t"+
					grade[avg[i]/10]+"\t"+
					rank[i];
			
			System.out.println(res);
		}
		
		///등급, 등수
		
		
		System.out.println("원소가 한개인 것만 찾는 배열");
		int [] arr1 = {78,12,45,67,78,12,67,5,78,12,56,78,78,9};
		int [] cntArr = new int[arr1.length];
		int cnt = 0;
		
		for (int me = 0; me < cntArr.length; me++) {
			for (int you = 0; you < cntArr.length; you++) {
				if(arr1[me] == arr1[you]) {
					cntArr[me]++;
				}
			}
			if(cntArr[me]==1)
				cnt++;
			
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(cntArr));
		System.out.println(cnt);
		
		int [] res = new int[cnt];
		int no=0;
		for (int i = 0; i < cntArr.length; i++) {
			if(cntArr[i]==1) {
				res[no] = arr1[i];
				no++;
			}
		}
		System.out.println(Arrays.toString(res));
		
		System.out.println("중복 없이 원소 배열 1");
		
		int [] arr = {78,12,45,67,78,12,67,5,0,12,56,78,78,9};
		int [] newArr = new int[arr.length];
		
		cnt = 0;
		
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(newArr));
		
		

		for (int me = 0; me < arr.length; me++) {
			
			boolean chk = false;

			for (int you = 0; you <cnt; you++) {
				
				//System.out.println(newArr[you]+" : "+(arr[me]==newArr[you]));
				chk = arr[me]==newArr[you];
				
				if(chk) {
					break;
				}
			}
			
			if(!chk) {
				newArr[cnt] = arr[me];
				/*
			78
			newArr[0] = arr[0] : 78
			
			          ^  ^  ^  ^
			newArr = {78,12,45,67,0,0,0,0,0,0,0,0,0,0};
			
			
			 */
				cnt++;
			}
			//System.out.println(Arrays.toString(newArr));
		}
		
		int [] res1 = new int[cnt];
		for (int i = 0; i < res1.length; i++) {
			res1[i] = newArr[i];
		}
		//System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(res1));
		
		
		
		System.out.println("중복 없이 원소 배열 2");
		int [] arr2 = {78,12,45,67,78,12,67,5,0,12,56,78,78,9};
		int [] res2 = new int[0];
		
		for (int me = 0; me < arr2.length; me++) {
			boolean chk = false;
			
			for (int you = 0; you < res2.length; you++) {
				if(chk= arr2[me]==res2[you]) {
					break;
				}
			}
			
			if(!chk) {
				int [] buf = new int[res2.length+1];
				for (int i = 0; i < res2.length; i++) {
					buf[i] = res2[i];
				}
				buf[res2.length] = arr2[me];
				res2 = buf;
			}
		}
		System.out.println(Arrays.toString(res2));

	}

}

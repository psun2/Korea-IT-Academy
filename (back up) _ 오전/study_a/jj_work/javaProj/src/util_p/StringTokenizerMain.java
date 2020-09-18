package util_p;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		String str = "허하영,이성웅,,박현.최준희,강현구";
		
		String [] arr = str.split(",");
		
		for (String s : arr) {
			System.out.println(s);
		}
		System.out.println("------------------");
		
		StringTokenizer stk = new StringTokenizer(str,",.");
		
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}
		
		System.out.println("------------------");
		
		
		str = "자바";
		StringBuffer buffer = new StringBuffer(str);
		StringBuilder builder = new StringBuilder(str);
		str+=" 취업반";
		buffer.append(" 취업반");
		builder.append(" 취업반");
		System.out.println(str);
		System.out.println(buffer);
		System.out.println(builder);
		
		
		long tt;
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			str+="미니프로젝트";
		}
		System.out.println("String:"+(System.currentTimeMillis()-tt));
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			buffer.append("미니프로젝트");
		}
		System.out.println("StringBuffer:"+(System.currentTimeMillis()-tt));
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			builder.append("미니프로젝트");
		}
		System.out.println("StringBuilder:"+(System.currentTimeMillis()-tt));
		
		System.out.println("------------------");
		
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			buffer.append("미니프로젝트");
		}
		System.out.println("StringBuffer:"+(System.currentTimeMillis()-tt));
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			builder.append("미니프로젝트");
		}
		System.out.println("StringBuilder:"+(System.currentTimeMillis()-tt));
	}

}

package util_p;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		String str = "���Ͽ�,�̼���,,����.������,������";
		
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
		
		
		str = "�ڹ�";
		StringBuffer buffer = new StringBuffer(str);
		StringBuilder builder = new StringBuilder(str);
		str+=" �����";
		buffer.append(" �����");
		builder.append(" �����");
		System.out.println(str);
		System.out.println(buffer);
		System.out.println(builder);
		
		
		long tt;
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			str+="�̴�������Ʈ";
		}
		System.out.println("String:"+(System.currentTimeMillis()-tt));
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			buffer.append("�̴�������Ʈ");
		}
		System.out.println("StringBuffer:"+(System.currentTimeMillis()-tt));
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			builder.append("�̴�������Ʈ");
		}
		System.out.println("StringBuilder:"+(System.currentTimeMillis()-tt));
		
		System.out.println("------------------");
		
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			buffer.append("�̴�������Ʈ");
		}
		System.out.println("StringBuffer:"+(System.currentTimeMillis()-tt));
		
		tt = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			builder.append("�̴�������Ʈ");
		}
		System.out.println("StringBuilder:"+(System.currentTimeMillis()-tt));
	}

}

package lang_p;

public class StringMain {

	public static void main(String[] args) {

		String a = "�Ʊ���";
		String b = "�Ʊ���";
		String c = "�������";
		String d = new String("�Ʊ���");
		String e = a;
		char [] arr = {'��','��','��','��'};
		String f = new String(arr);
		
		System.out.println("a==\"�Ʊ���\":"+(a=="�Ʊ���"));
		System.out.println("a==b:"+(a==b));
		System.out.println("a==c:"+(a==c));
		System.out.println("a==d:"+(a==d));
		System.out.println("a==e:"+(a==e));
		System.out.println("a==f:"+(a==f));
		
		System.out.println("�Ʊ���.hashCode():"+"�Ʊ���".hashCode());
		System.out.println("a.hashCode():"+a.hashCode());
		System.out.println("b.hashCode():"+b.hashCode());
		System.out.println("c.hashCode():"+c.hashCode());
		System.out.println("d.hashCode():"+d.hashCode());
		System.out.println("e.hashCode():"+e.hashCode());
		System.out.println("f.hashCode():"+f.hashCode());
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		
		System.out.println("a.equals(\"�Ʊ���\"):"+a.equals("�Ʊ���"));
		System.out.println("a.equals(b):"+a.equals(b));
		System.out.println("a.equals(c):"+a.equals(c));
		System.out.println("a.equals(d):"+a.equals(d));
		System.out.println("a.equals(e):"+a.equals(e));
		System.out.println("a.equals(f):"+a.equals(f));
		System.out.println("�Ʊ���".equals(a));
	}

}

package lang_p;

public class StringMain {

	public static void main(String[] args) {

		String str1 = "ȫ���� ���� ����";
		String str2 = "ȫ���� ���� ����";
		String str3 = new String("ȫ���� ���� ����");
		char [] arr = {'ȫ','��','��',' ','��','��',' ','��','��'};
		String str4 = new String(arr);
		String str5 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("ȫ���� ���� ����");
		System.out.println("toString()---------------");
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str3.toString());
		System.out.println(str4.toString());
		System.out.println(str5.toString());
		System.out.println("ȫ���� ���� ����".toString());
		System.out.println("hashCode()---------------");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println("ȫ���� ���� ����".hashCode());
		System.out.println("==");
		System.out.println("str1==str2:"+(str1==str2));
		System.out.println("str1==str2:"+(str1==str3));
		System.out.println("str1==str2:"+(str1==str4));
		System.out.println("str1==str2:"+(str1==str5));
		System.out.println(".equals()-------------------------------");
		System.out.println("str1.equals(str2):"+str1.equals(str2));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		System.out.println("str1.equals(str4):"+str1.equals(str4));
		System.out.println("str1.equals(str5):"+str1.equals(str5));
		System.out.println("str1.equals(\"ȫ���� ���� ����\"):"+str1.equals("ȫ���� ���� ����"));

	}

}

package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;



class RegexMo{
	
	String [] pp;
	String qq, an;
	RegexMem mem;
	
	int error;
	public RegexMo(RegexMem mem, String qq, int error, String ...pp) {
		super();
		this.mem = mem;
		this.qq = qq;
		this.pp = pp;
		this.error = error;
	}
	
	void inputData() throws MyExcep {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(qq+":");
		
		an = sc.nextLine();
		
		for (String ss : pp) {
			if(!Pattern.matches(ss, an.toLowerCase()))
				throw new MyExcep(qq, error);
		}
		
		
		mem.input(qq, an);
	}
	
	
}

class MyExcep extends Exception{
	
	int i;
	String str;
	
	String [] arr = {"���� ����ġ","���� ����ġ"};
	
	public MyExcep(String str, int i) {
		super();
		this.str = str;
		this.i = i;
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return str+" "+arr[i];
	}
	
	
	
}

class RegexMem{
	
	String [] title = {"id","pw","email","tel","name","jumin","img","zipcode"};
	
	String [] data = new String[title.length];
	
	void input(String name, String data) {
		for (int i = 0; i < this.title.length; i++) {
			if(title[i].equals(name)) {
				this.data[i] = data;
			}
		}
	}
	void zipSch() {
		String [] seoul = {"������","������","���ϱ�","������","���Ǳ�","������","���α�",
				"��õ��","�����","������","���빮��","���۱�","������","���빮��",
				"���ʱ�","������","���ϱ�","���ı�","��õ��","��������","��걸",
				"����","���α�","�߱�","�߶���"}; 
		String [] jaeum = {"[��-��]","[��-��]","[��-�L]","[��-��]","[��-�J]","[��-��]",
				"[��-��]","[��-��]","[��-��]","[��-��]","[ī-�i]","[Ÿ-�M]",
				"[��-��]","[��-�R]","[��-��]","[¥-��]","[��-��]","[��-��]","[��-��]"};
		
		String index = "��������������������������������������";
		
		String pp = ".*";
		for (char ch : data[7].toCharArray()) {
			
			int pos = index.indexOf(ch);
			if(pos>=0)
			{
				pp += jaeum[pos];
			}else {
				pp += ch; 
			}
		}
		pp += ".*";
		
		String res = "";
		
		for (String str : seoul) {
			if(Pattern.matches(pp, str)) {
				res+=str+",";
			}
		}
		
		data[7]+=":"+res;
	}
	void ppp() {
		zipSch();
		
		System.out.println("ȸ������ ���� >>>>>>>>>>>>");
		for (int i = 0; i < this.title.length; i++) {
			System.out.println(title[i]+":"+data[i]);
		}
	}
}


public class RegexJoinMain {

	public static void main(String[] args) {
		
		RegexMem mem;
		
		/*
		 //// ȸ�� ���� ��ȿ�� �˻縦 �ǽ��ϼ���
1. ���̵� : ���� ���� ����
2. ��� , ���Ȯ�� 
3. �̸���  -  ���̵�:����,����   @  ������ : ���� ��
4. ��ȭ��ȣ - ���� :  ###-####-####,   ##(#)-###-####
5. �̸� (�ѱ۸� ����)
6. �ֹι�ȣ 
7. ���� ÷��-->����,����.�̹��� Ȯ����
�̹���(jpg, jpeg, bmp, png, gif)  --  ��ҹ��� ���о���
8. �����ȣ �˻� - ������ (�ʼ��˻�)
����ó���� ó���� �� 
		 */
		
		
		
		while(true) {
			mem = new RegexMem();
			RegexMo [] arr = {
				new RegexMo(mem, "id", 0, "[0-9a-zA-Z]{2,}",".*[0-9].*",".*[a-zA-Z].*"),
				new RegexMo(mem, "pw", 0, ".{2,}"),
				new RegexMo(mem, "pwȮ��", 1, ".{2,}"),
				new RegexMo(mem, "email", 0, 
						"[0-9a-zA-Z]{2,}@[a-zA-Z]{2,}.(([a-zA-Z]{2,})|([a-zA-Z]{2,}.[a-zA-Z]{2,}))"),
				new RegexMo(mem, "tel", 0, "((\\d{3}-\\d{4})|(\\d{2,3}-\\d{3}))-\\d{4}"),
				new RegexMo(mem, "name", 0, "[��-�R]{2,}"),
				new RegexMo(mem, "jumin", 0, "\\d{6}-\\d{7}") ,
				new RegexMo(mem, "img", 0, "[0-9a-zA-Z]{1,}.(jpg|jpeg|bmp|png|gif)"),
				new RegexMo(mem, "zipcode", 0, "[��-�R��-��]{1,}")
			};
			
			try {
				for (RegexMo regexMo : arr) {
					regexMo.inputData();
					
					if(regexMo.qq.equals("pwȮ��") && !mem.data[1].equals(regexMo.an)) {
						throw new MyExcep(regexMo.qq, 1);
					}
				}
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		mem.ppp();

	}

}

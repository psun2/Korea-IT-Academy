package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
////ȸ�� ���� ��ȿ�� �˻縦 �ǽ��ϼ���
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


class RegexData{
	String [] index ="id,pw,email,tel,pname,jumin,img,zipcode".split(",");
	String [] data = new String [index.length];

	void ppp() {
		String res = "�������� \n";
		for (int i = 0; i < data.length; i++) {
			res += index[i]+" : "+data[i]+"\n";
		}
				
		
		System.out.println(res);
	}
	
	void input(String qq, String answer) {
		for (int i = 0; i < index.length; i++) {
			if(qq.equals(index[i])) {
				data[i] = answer;
				break;
			}
		}
	}
	
}

class RegexQQ{
	Scanner sc = new Scanner(System.in);
	
	String qq, answer;
	String [] pp;
	RegexData data;
	boolean chk=false;

	public RegexQQ(RegexData data, String qq,  String... pp) {
		super();
		this.qq = qq;
		
		this.pp = pp;
		this.data = data;
	}
	
	void go()throws Exception {
		System.out.print(qq+":");
		answer = sc.nextLine();
		String ansOri = answer;
		if(chk)
			ansOri = answer.toLowerCase();
		for (String p : pp) {
			if(!Pattern.matches(p, ansOri)) 
				throw new Exception(qq+" ����");
		}
		data.input(qq, answer);	
	}
	
	void go(boolean bb)throws Exception {
		chk = bb;
		go();
	}
	
}

class RegexPw extends RegexQQ{

	public RegexPw(RegexData data, String qq) {
		super(data, qq);
	}
	
	void go()throws Exception {
		System.out.print(qq+":");
		answer = sc.nextLine();
		
		if(!data.data[1].equals(answer)) 
				throw new Exception(qq+" ����");
		
		
	}
}

public class RegexRegisterMain {

	public static void main(String[] args) {
		RegexData data;
		
		while(true) {
			try {
				data = new RegexData();
				RegexQQ [] qqArr = {
						new RegexQQ(data, "id",  "[a-zA-Z0-9]{5,}",".*[a-zA-Z].*",  ".*[0-9].*"), 
						new RegexQQ(data, "pw",  ".{5,}"),
						new RegexQQ(data, "email",  
					"[a-zA-Z0-9]{5,}@(([a-zA-Z]{2,}.[a-zA-Z]{2}.[a-zA-Z]{2})|([a-zA-Z]{2,}.[a-zA-Z]{3}))"),
						new RegexQQ(data, "tel",  
					"(\\d{3}-\\d{4}-\\d{4})|(\\d{2,3}-\\d{3}-\\d{4})"), 
						new RegexQQ(data, "pname",  "[��-�R]{2,6}") ,
						new RegexQQ(data, "jumin",  "\\d{6}-\\d{7}"),
						new RegexQQ(data, "img",  "[a-zA-Z0-9]{1,}\\.(jpg|jpeg|bmp|png|gif)"),
						new RegexQQ(data, "zipcode",  "[��-�R��-��0-9]{1,}")
				};
				
				for (int i = 0; i < qqArr.length; i++) {
					if(i!=6)
						qqArr[i].go();
					else
						qqArr[i].go(true);
					
					
					if(i==1) {
						new RegexPw(data, "pwȮ��").go();
					}
				}
				
				String zipSch=".*";
				String [] index = {
						"��������������������������������������",
						"�����ٶ󸶹ٻ������īŸ���Ϻ�¥�����",
						"�����L���J����磠���i�M���R���������"
				};
				for (char ch : data.data[7].toCharArray() ) {
					int pos = index[0].indexOf(ch);
					if(pos>=0) {
						zipSch+="["+index[1].charAt(pos)+"-"+index[2].charAt(pos)+"]";
					}else {
						zipSch+=ch;
					}
				}
				zipSch+=".*";
				//System.out.println(zipSch);
				
				String [] gu = {
					"������","������","���ʱ�","���ʱ�","�ϳ���",
					"����1��","������","����2��","������",
					"�׷�������","������","�������","�ɽ��ϱ�"	
				};
				
				for (String gg : gu) {
					if(Pattern.matches(zipSch, gg))
						data.data[7]+=","+gg;
				}
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		data.ppp();
		

	}

}

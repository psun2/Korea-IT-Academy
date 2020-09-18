package excep_p;

import java.util.Scanner;

//ȸ������ ���α׷��� �ۼ��ϼ���
//�Է»��� - id, pw, pwȮ��, ����, �̸���, ���, Ư��, ��ȭ��ȣ, �ڵ���, ����
//�ʼ� �Է»��� - id, pw, pwȮ��, ����, ��ȭ��ȣ, ���� (���� ������ ���� �߻�)
//��ȿ�� �˻� - ���� : 1980 ���� ����ڸ� ���� ����
//          ��й�ȣ, ��й�ȣ Ȯ���� ���� ���ƾ߸� ����
//����� ���� ���� Ŭ������ Ȱ���Ͽ� �۾��� ��

class LoginRes{
	
	int birth;
	
	String [] index = {"id","pw","����","�̸���", "���", "Ư��", "��ȭ��ȣ", "�ڵ���", "����"};
	String [] strData = new String[index.length];
	
	void strInput(String inputData,String qq) {
		for (int i = 0; i < index.length; i++) {
			if(index[i].equals(qq))
				strData[i] = inputData;
		}
	}
	
	String strFind(String title) {
		
		for (int i = 0; i < index.length; i++) {
			if(index[i].equals(title))
				return strData[i];
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		String res = "\n\n<<<<ȸ�����ԿϷ�>>>>\n\n";
		
		for (int i = 0; i < 3; i++) {
			res += index[i]+":"+strData[i]+"\n";
		}
		res += "�������:"+birth+"\n";
		for (int i = 3; i < index.length; i++) {
			res += index[i]+":"+strData[i]+"\n";
		}
		
		return res;
	}
}

class LoginQQ{
	
	LoginRes  res;
	Scanner sc = new Scanner(System.in);
	
	boolean notNull = false, isNum = false, isEqual=false;
	int isNumCut, inputNum;
	String equalTitle, qq, inputData;
	
	
	//�ʼ� �Է»��� �ľ�
	public LoginQQ(LoginRes  res,String qq, boolean notNull) {
		super();
		this.res = res;
		this.qq = qq;
		this.notNull = notNull;
	}

	public LoginQQ(LoginRes  res,String qq, int isNumCut) {
		super();
		this.res = res;
		this.qq = qq;
		this.isNumCut = isNumCut;
		isNum = true;
	}

	public LoginQQ(LoginRes  res,String qq, String equalTitle) {
		super();
		this.res = res;
		this.qq = qq;
		this.equalTitle = equalTitle;
		isEqual=true;
	}
	
	
	void input() throws LoginUserExcep {
		
		if(!isNum)
			strInput();
		else
			numInput();
	}
	
	void strInput() throws LoginUserExcep {
		System.out.print(qq+":");
		inputData = sc.nextLine();
		if(notNull && inputData.equals("")) {
			throw new LoginUserExcep(qq,0);
		}
		if(isEqual && !res.strFind(equalTitle).equals(inputData)) {
			throw new LoginUserExcep(qq,1);
		}
		res.strInput(inputData,qq);
	}
	void numInput() throws LoginUserExcep {
		System.out.print(qq+":");
		inputNum = sc.nextInt();
		sc.nextLine();
		if(inputNum>19800000) {
			throw new LoginUserExcep(qq,2,1980);
		}
		res.birth = inputNum;
	}
	
	
}

class  LoginUserExcep extends Exception{

	int i, cut;
	
	String [] title = {
			" �ʼ��Դϴ�.",
			" ��ġ���� �ʽ��ϴ�.",
			" ���� �����͸� �Է°����մϴ�."
	};
	
	public LoginUserExcep(String message, int i) {
		super(message);
		this.i = i;
	}
	
	
	public LoginUserExcep(String message,int i, int cut) {
		super(message);
		this.i = i;
		this.cut = cut;
	}


	void ppp() {
		String ttt = getMessage();
		
		if(i==2)
			ttt+= " "+cut;
		ttt+= title[i];
		System.out.println(ttt);
	}
}



public class LoginClassMain {

	public static void main(String[] args) {
		LoginRes res = null;
		//�Է»��� - id, pw, pwȮ��, ����, �̸���, ���, Ư��, ��ȭ��ȣ, �ڵ���, ����
		//�ʼ� �Է»��� - id, pw, pwȮ��, ����, ��ȭ��ȣ, ���� 
		
		
		while(true) {
			try {
				res = new LoginRes();
				
				LoginQQ [] loginQQs = {
						new LoginQQ(res,"id", true),
						new LoginQQ(res,"pw", true),
						new LoginQQ(res,"pwȮ��", "pw"),
						new LoginQQ(res,"����", true),
						new LoginQQ(res,"�������", 1980),
						new LoginQQ(res,"�̸���", false),
						new LoginQQ(res,"���", false),
						new LoginQQ(res,"Ư��", false),
						new LoginQQ(res,"��ȭ��ȣ", true),
						new LoginQQ(res,"�ڵ���", false),
						new LoginQQ(res,"����", true)
				};
				
				for (LoginQQ lqq : loginQQs) {
					lqq.input();
				}
				
				break;
			}catch (LoginUserExcep e) {
				e.ppp();
			}
		}
		
		System.out.println(res);

	}

}

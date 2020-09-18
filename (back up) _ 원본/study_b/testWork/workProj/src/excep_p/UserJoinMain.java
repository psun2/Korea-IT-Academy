package excep_p;

import java.util.Scanner;

//����
//ȸ������ ���α׷��� �ۼ��ϼ���
//�Է»��� - id, pw, pwȮ��, ����,�������, �̸���, ���, Ư��, ��ȭ��ȣ, �ڵ���, ����
//�ʼ� �Է»��� - id, pw, pwȮ��, ����, ��ȭ��ȣ, ���� (���� ������ ���� �߻�)
//��ȿ�� �˻� - ���� : 1980 ���� ����ڸ� ���� ����
//       ��й�ȣ, ��й�ȣ Ȯ���� ���� ���ƾ߸� ����
//����� ���� ���� Ŭ������ Ȱ���Ͽ� �۾��� ��
//===================================================================
//ȸ������ ���α׷��� �ۼ��ϼ���
//�Է»��� - id, pw, pwȮ��, ����, �̸���, ���, Ư��, ��ȭ��ȣ, �ڵ���
//�ʼ� �Է»��� - id, pw, pwȮ��, ����, ��ȭ��ȣ
//       ��й�ȣ, ��й�ȣ Ȯ���� ���� ���ƾ߸� ����
//����� ���� ���� Ŭ������ Ȱ���Ͽ� �۾��� ��

class UserData{
	String [][] data;

	public UserData() {
		String [] index = {"id","pw","����","�������","�̸���","���","Ư��","��ȭ��ȣ","�ڵ���","����"};
		
		data = new String [][] {
				index,
				new String[index.length]
		};
	}
	
	void input(UserQQ qq) {
		
		//System.out.println(qq.qq+">>"+qq.answer);
		for (int i = 0; i < data[0].length; i++) {

			if(qq.qq.equals(data[0][i])) {
				data[1][i]=qq.answer;
				//System.out.println(data[0][i]+">>"+qq.qq+":"+data[1][i]);
			}
		}
	}
	
	void ppp() {
		System.out.println("\t<<<< ȸ���������� >>>>");
		for (int i = 0; i < data[0].length; i++) {
			System.out.println(data[0][i]+":"+data[1][i]);
		}
	}
	
	
}

class UserQQ{
	UserData data;
	
	String qq, answer;
	boolean notNull = false;
	int eqNum=-1, year=0, birth;
	
	public UserQQ(UserData data, String qq, boolean notNull) {
		super();
		this.data = data;
		this.qq = qq;
		this.notNull = notNull;
	}
	
	
	
	public UserQQ(UserData data, String qq, int year) {
		super();
		this.data = data;
		this.qq = qq;
		this.year = year;
	}



	public UserQQ(UserData data, String qq, boolean notNull, int eqNum) {
		this(data, qq,  notNull);
		this.eqNum = eqNum;
	}



	void input() throws MyMyExcep {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(qq+":");
		if(year>0) {
			birth = sc.nextInt();
			if(birth>=year)
				throw new MyMyExcep(qq, 2);
			
			answer = ""+ birth;
		}
		else {
			answer = sc.nextLine();
			
			if(notNull && answer.equals(""))
				throw new MyMyExcep(qq, 0);
			
			if(eqNum>=0 && !data.data[1][eqNum].equals(answer)) {
				throw new MyMyExcep(qq, 1);
			}
		}
			
	}
	
}

class MyMyExcep extends Exception{
	String name;
	int i;
	public MyMyExcep(String name, int i) {
		super();
		this.name = name;
		this.i = i;
	}
	
	void ppp() {
		
		String [] arr = {
				"�� �ʼ��Դϴ�.", "�� ��ġ���� �ʽ��ϴ�.", "��ȿ���� �ʴ� ���Դϴ�."
		};
		
		System.out.println(name+" "+arr[i]);
	}
}


public class UserJoinMain {

	public static void main(String[] args) {
		UserData data;
		
		while(true) {
			
			data = new UserData();
			//id, pw, pwȮ��, ����, ��ȭ��ȣ, ���� (���� ������ ���� �߻�)
			UserQQ [] arr = {
					new UserQQ(data, "id", true),
					new UserQQ(data, "pw", true),
					new UserQQ(data, "pwȮ��", true, 1),
					new UserQQ(data, "����", true),
					new UserQQ(data, "�������", 19800000),
					new UserQQ(data, "�̸���", false),
					new UserQQ(data, "���", false),
					new UserQQ(data, "Ư��", false),
					new UserQQ(data, "��ȭ��ȣ", true),
					new UserQQ(data, "�ڵ���", false),
					new UserQQ(data, "����", true)
			};
			try {
				
				for (UserQQ qq : arr) {
					qq.input();
					
					data.input(qq);
				}
				data.ppp();
				break;
			}catch (MyMyExcep e) {
				e.ppp();
			}
			
			
		}

	}

}

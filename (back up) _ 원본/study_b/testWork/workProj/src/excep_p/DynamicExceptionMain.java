package excep_p;

class MyExcep extends Exception{
	
	String name;
	
	
	
	public MyExcep() {
		super("�׸� ����");
	}
	
	public MyExcep(int i) {
		super(new String [] {"����","��������","���","ǳ���̿�","�罿������","����"}[i]);
		String [] arr = {"����","��������","���","ǳ���̿�","�罿������","����"};
		name = arr[i];
	}
	
	public MyExcep(int i, String str) {
		
		String [] arr = {" ���� �����ϴ�.", " ���� �ٸ��ϴ�."," ��ȿ�� ������ ���� �ƴմϴ�."};
		name = str+" "+arr[i];
	}
	
	public MyExcep(String msg) {
		super(msg);
		name = msg;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return "������ �϶�";
		return name;
	}
	
	void printMsg() {
		System.out.println(super.getMessage());
	}
	
	String ttt() {
		return "�Ʊ��� �ѷ�� �ѷ�";
	}
}


public class DynamicExceptionMain {

	public static void main(String[] args) {

		try {
			//throw new MyExcep();
			//throw new MyExcep("�����Ӱ�");
			//throw new MyExcep(1);
			//throw new MyExcep(0,"id");
			//throw new MyExcep(1,"pw");
			throw new MyExcep(2,"����⵵");
		//} catch (Exception e) {
		} catch (MyExcep e) {

			//System.out.println(e.ttt());
			System.out.println(e.getMessage());
			e.printMsg();
		}

	}

}


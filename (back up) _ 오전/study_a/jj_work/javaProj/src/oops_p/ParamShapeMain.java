package oops_p;

class ParamShape{
	
	String name;
	double area, border;
	
	void init(int ... line) {
		name = new String[] {"","��","���簢��","�����ﰢ��"}[line.length];
		
		switch(line.length) {
			case 1:
				area = 3.14*line[0]*line[0];
				border = 3.14*2*line[0];
				break;
			case 2:
				area = line[0]*line[1];
				border = 2*(line[0]+line[1]);
				break;
			case 3:
				area = line[0]*line[1]/2;
				border = line[0]+line[1]+line[2];
				break;
		}
		
		
	}
	
	void ppp() {
		System.out.println(name+" , "+area+" , "+border);
	}
	
}
public class ParamShapeMain {

	public static void main(String[] args) {
		ParamShape ps = new ParamShape();
		ps.init(5);
		ps.ppp();
		
		ps.init(5,6);
		ps.ppp();
		
		ps.init(5,6,8);
		ps.ppp();
		
		

	////�л�Ŭ������ ����, ����, ����, ȣ�� �Ͽ� �л������� ����ϼ���

	 ///  �̸�,  , ����, ��� , ��ü���
		
	// �Ϲ� - ���� [����, ����, ����]
	// ��ü�� - ���� [����, ����, ����, ��ü��]
		
	//1. ���о��� ���
	//2. �����Ͽ� ���
		

	}

}

package control_p;

public class Switch_Exam {

	public static void main(String[] args) {

		String buseo = "�����";

		String mt;
		
		switch(buseo) {
		
			case "�λ��":
				mt = "�ٴ�";
				break;
			case "������":
				mt = "��";
				break;
			case "�κ�":
				mt = "�ȹ�";
				break;
			case "�κ�":
				mt = "���";
				break;
			default:
				mt = "�ܾ�";
				break;
		}
		
		System.out.println(buseo+":"+mt);
		
		//���޺� ������ ��� �ϼ���
	    //���� : 50%, ���� : 30%, �븮 : 20%, ���:10%
	    //���� :  �⺻�� + �⺻��*���ʽ�
	    //���ް� �⺻���� �Է¹޾� ó��

		int basic=300;
		
		String pos = "����";
		
		double bonus;

	   
		
		switch(pos) {
		
			case "����":
				bonus = 0.5;
				break;
			case "����":
				bonus = 0.3;
				break;
			case "�븮":
				bonus = 0.2;
				break;
			case "���":
				bonus = 0.1;
				break;
			default:
				bonus = 0;
				break;
		}
		
		int money = (int)((bonus+1)*basic);
	
		System.out.println(pos+":"+basic+"("+money+")");
		
	}

}

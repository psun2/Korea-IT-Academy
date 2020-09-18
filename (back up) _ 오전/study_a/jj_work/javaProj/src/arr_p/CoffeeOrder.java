package arr_p;

public class CoffeeOrder {

	public static void main(String[] args) {
		/*
         * ������ �ֹ��޴��� �迭�̴�
         * �� ��¥�� �ֹ��հ踦 ����ϼ���
         * 
         * �ֹ���ȣ:
         * 0 - �Ƹ޸�ī�� (2000)
         * 1 - ������ī�� (2300)
         * 2 - �ƽþƳ�    (2700)
         * 
         *         "�Ƹ޸�ī��"    "������ī��"    "�ƽþƳ�"
         * 4/10        1    2    0
         * 4/11        2    0    1
         * 4/12        0    3    0
         * 4/13        1    1    1
         * "����"        "�����Ѿ�"
         * 4/10        6600
         * 4/11        6700
         * 4/12        6900
         * 4/13        7000
         *
         */
		
		String [] date = {"4/10","4/11","4/12","4/13"};
		
		int [][] order = {
				{1, 2, 0},
				{2, 0, 1},
				{0, 3, 0},
				{1, 1, 1}
		};
		
		int [] price = {2000,2300,2700};
		
		int [] tot = new int[date.length];
		
		for (int i = 0; i < order.length; i++) {
			for (int j = 0; j < order[i].length; j++) {
				tot[i]+= order[i][j]*price[j];
			}
		}
		
		
		for (int i = 0; i < date.length; i++) {
			String ttt = date[i]+"\t"+tot[i];
			
			System.out.println(ttt);
		}
		

	}

}

package excep_p;

import java.util.Scanner;

public class StudExcepLoginMain {

	public static void main(String[] args) {

		String [][] arr = {
				{"aa","1111","��ȿ��"},
				{"bb","2222","��ȿ��"},
				{"cc","3333","��ȿ��"},
				{"dd","4444","��ȿ��"},
				{"ee","5555","��ȿ��"}
				
		};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				int pos=-1;  //�ʱⰪ : ���� ���  -1
				
				//id �Է�
				System.out.print("id:");
				String buf = sc.nextLine();
				
				/*  id �ش� ��ü ã��*/
				for (int i = 0; i < arr.length; i++) {
					if(buf.equals(arr[i][0])) {
						pos = i;
						break;
					}
						
				}
				//�� ã���� --> ������
				if(pos<0) 
					throw new Exception("id ������");
				
				//pw �Է�
				System.out.print("pw:");
				buf = sc.nextLine();
				//id��ȣ �ش��ϴ� ��ü pw�� ��
				if(!arr[pos][1].equals(buf))
				// �ƴϸ� ---> ������
					throw new Exception("pw ������");
				
				//id ��ȣ�� �ش��ϴ� �̸� ���
				System.out.println(arr[pos][2]+" �α��� ����");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		

	}

}

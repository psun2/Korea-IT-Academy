package control_p;

import java.io.IOException;

public class InputMain {

	public static void main(String[] args) throws IOException {
//		System.out.print("�Է�:");
//		int ii = System.in.read();
//		System.out.println("���:"+ii+","+(char)ii);
		
		
		String res = "";
		System.out.print("�Է�:");
		
		while(true) {
		
			char ch = (char)System.in.read();
			
//			System.out.println((int)ch);
			if(ch == 13) //enter  Ű
				break;
			
			res += ch;
		}
		
		System.out.println("���:"+res);
		
		
		///1. System.in.read �� �̿��Ͽ� ���ڸ� �Է¹޾� + 100 �Ͽ� ����ϼ���
		
		
		///2. System.in.read �� �̿��Ͽ� ���� �ΰ��� �Է¹޾� �μ� ������ �ڼ� ������ ����ϼ���
		
		
		
		
	}

}

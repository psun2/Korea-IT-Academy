package control_p;

import java.io.IOException;

public class InputMath {

	public static void main(String[] args) throws IOException {
		///1. System.in.read �� �̿��Ͽ� ���ڸ� �Է¹޾� + 100 �Ͽ� ����ϼ���
		///2. System.in.read �� �̿��Ͽ� ���� �ΰ��� �Է¹޾� �μ� ������ �ڼ� ������ ����ϼ���
		///3. ���ڸ� �Է¹޾� ����ϼ��� ��. �빮��<->�ҹ��� �ٲ㼭 ����ϼ���
		int su1 = 0;
		
		System.out.print("��1:");
		
		while(true) {
			int ii = System.in.read();
			
			if(ii == 13)
				break;
			
			su1 *= 10;
			System.out.println((char)ii+":"+su1);
			su1 += ii-'0';
			
		}
		
		System.out.println(su1+100);

	}

}

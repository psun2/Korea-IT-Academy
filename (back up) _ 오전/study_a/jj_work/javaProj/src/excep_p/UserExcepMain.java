package excep_p;

public class UserExcepMain {

	public static void main(String[] args) throws Exception{
								//declaration - > ����ó�� �߻��� �ڽ��� ȣ����  
								//caller���� ó���� ���� ��û 
		try {
			
			System.out.println("try ����");
			
			//Exception ee = new Exception();
			
			//throw ee;
			
			//throw new Exception();
			
			throw new Exception("������");
			
			// throw ���Ŀ��� ����ó���� �ݵ�� �߻��ǹǷ� ���� ���� �ۼ��� �����߻�
			//System.out.println("try ��");
			
		} catch (Exception e) {
			//System.out.println("����ó�� 1:"+e.getMessage());
			e.printStackTrace();
			
			try {
				throw e;   //re~throwing
			} catch (Exception e2) {
				System.out.println("���� ��� ����:"+e.getMessage());
				throw e2;   //re~throwing
			}
			
		}

	}

}

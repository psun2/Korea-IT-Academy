package class_p;
class OuterPhone{
	String name;
	int cnt;
	public OuterPhone(String name) {
		super();
		this.name = name;
	}
	
	void sale(int cnt) {
		this.cnt += cnt;
		System.out.println(
				name+" ���� �ڵ��� �Ⱦƿ�:"+cnt+"("+this.cnt+")");
	}
	
	@Override
	public String toString() {
		return "���� [name=" + name + ", cnt=" + cnt + "]";
	}
	
	class InnerPhone{
		String name;
		int cnt;
		public InnerPhone(String name) {
			
			this.name = name;
		}
		
		void sale2(int cnt) {
			OuterPhone.this.cnt += cnt;
			this.cnt+=cnt;
			System.out.println(
			OuterPhone.this.name+" "+this.name+" �븮�� �ڵ��� �Ⱦƿ�:"+
					cnt+"("+this.cnt+"/"+OuterPhone.this.cnt+")");
		}
		
		@Override
		public String toString() {
			return "�븮�� [name=" + name + ", cnt=" + cnt + "]";
		}
		
	}
}
public class InnerPhoneMain {

	public static void main(String[] args) {
		OuterPhone kt = new OuterPhone("kt");
		OuterPhone lg = new OuterPhone("lg");
		
		OuterPhone.InnerPhone [] ip = {
				kt.new InnerPhone("����"), 
				kt.new InnerPhone("����"),
				kt.new InnerPhone("����"),
		
				lg.new InnerPhone("����"),
				lg.new InnerPhone("���")
		};
		
		
		kt.sale(1);
		ip[0].sale2(2);
		ip[1].sale2(1);
		ip[4].sale2(3);
		ip[3].sale2(2);
		lg.sale(2);
		ip[4].sale2(3);
		kt.sale(3);
		ip[2].sale2(2);
		ip[4].sale2(4);
		lg.sale(1);
		ip[3].sale2(1);
		
		System.out.println("----------------");
		for (OuterPhone.InnerPhone oi : ip) {
			System.out.println(oi);
		}
		System.out.println(kt);
		System.out.println(lg);
		

		/*
		 Ŀ�� �������� �����ϼ���
		 
		 ���ٹ�, Ŀ����
		 
		 �������� Ŀ���������� ����
		 ���ٹ� - ����,����,����
		 Ŀ���� - ����,����,û����
		
		               ���ٹ�,  Ŀ����
		�Ƹ޸�ī��:2000	2100
		�ƽþƳ�:2300		2500
		������ī��:2700	2200
		
		
		
		�� ������ Ŀ�Ǹ� �ֹ���������(�� ���������� �ֹ�����)
		�� ������ Ŀ�� �Ǹų�����
		��ü ���� Ŀ�� �Ǹ� ������ ����ϼ���
		 
		���ٹ濪�� �ֹ�(�Ƹ޸�ī��) -> ���ٹ� ���� �Ƹ޸�ī�� 2000 �ֹ� 			
		 Ŀ����û���� �ֹ�(�ƽþƳ�)
		 ���ٹ����� �ֹ�(�Ƹ޸�ī��)
		 Ŀ���Ὺ�� �ֹ�(������ī��)
		 
		 -----------------------------
		 �Ǹų���
		 ���ٹ� ����:
		 �Ƹ޸�ī�� : ? - ?
		 �ƽþƳ� : ? - ?
		 ������ī�� : ? - ?
		  ���ٹ� ����:
		 �Ƹ޸�ī�� : ? - ?
		 �ƽþƳ� : ? - ?
		 ������ī�� : ? - ?
		 ...
		 Ŀ���� ����:
		 �Ƹ޸�ī�� : ? - ?
		 �ƽþƳ� : ? - ?
		 ������ī�� : ? - ?
		---------------------------------
		���ٹ� :
		 �Ƹ޸�ī�� : ? - ?
		 �ƽþƳ� : ? - ?
		 ������ī�� : ? - ?
		
		 Ŀ���� :
		 �Ƹ޸�ī�� : ? - ?
		 �ƽþƳ� : ? - ?
		 ������ī�� : ? - ?
		 
		 */
		
		
	}

}


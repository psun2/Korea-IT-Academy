package oops_p;

class ParamStud{
	
	String name, kind;
	
	int [] jum;
	
	int tot, avg, rank ,kk;
	
	void init(String name, int... jum) {
		this.name = name;
		this.jum = jum;
		kk= jum.length-3;
		cal();
	}
	
	void cal() {
		
		kind = new String[] {"�Ϲ�","��ü��"}[kk];
		
		for (int i : jum) {
			tot += i;
		}
		
		avg = tot / jum.length;
		
	}
	void rankCal(ParamStud [] arr) {
		rank=1;
		for (ParamStud you : arr) {
			
			if(avg <you.avg)
				rank++;
			
		}
	}
	
	void ppp() {
		String ttt = kind +"\t"+name+"\t";
		
		for (int i : jum) {
			ttt += i+"\t";
		}
		
		if(kind =="�Ϲ�")
			ttt += "\t";
		
		ttt += tot+"\t"+avg+"\t"+rank;
		
		System.out.println(ttt);
	}
	
}

class ParamBan{
	
	ParamStud [][] arr = new ParamStud[2][0];
	
	
	void addArr(ParamStud ret) {
		ParamStud [] buf = new ParamStud[arr[ret.kk].length+1];
		
		for (int i = 0; i < arr[ret.kk].length; i++) {
			buf[i] = arr[ret.kk][i];
		}
		buf[arr[ret.kk].length] = ret;
		
		arr[ret.kk] = buf;
	}
	
	ParamStud makeSt(String name, int... jum) {
		ParamStud ret = new ParamStud();
		ret.init(name, jum);
		addArr(ret);
		return ret;
	}
	
	void rankCalc() {
		for (ParamStud[] pp : arr) {
			
			for (ParamStud st : pp) {
				st.rankCal(pp);
			}
		}
	}
	
	
	void ppp(){
		
		String [] title = {"�Ϲ�","��ü��"};
		
		
		for (int i = 0; i < title.length; i++) {
			
			System.out.println(title[i]+">>>>");
			
			for (ParamStud st : arr[i]) {
				st.rankCal(arr[i]);
				st.ppp();
			}
			
		}
			
			
			
		
	}
	
}


public class ParamStudMain {

	public static void main(String[] args) {
		ParamBan pb = new ParamBan();
		
		
				
		pb.makeSt("����", 77,79,71,78);
		pb.makeSt("����", 67,69,61);
		pb.makeSt("������", 97,99,91,98);
		pb.makeSt("����", 57,59,51);
		pb.makeSt("�����", 87,89,81);
		pb.makeSt("���", 74,71,71);
		pb.makeSt("�̽��ͺ�", 62,69,61);
		pb.makeSt("������", 93,99,91);
		pb.makeSt("Ŀ�Ǻ�", 52,59,51,52);
		pb.makeSt("�ڹٺ�", 38,89,81,71);
		
		
		//pb.rankCalc();
		pb.ppp();
		
/*
		 ���並 �����ϼ���

  (Ŀ���̸�, �ɼ�...) �� �־� Ŀ�Ǹ� �������ּ���
      
    Ŀ���̸� : 
    �Ƹ޸�ī�� 2000  �ƽþƳ� 2300  ������ī�� 2700
    
    ���̽� +300  , ����ũ�� + 400
    
    ���߰� +200 , �������+1000, 
    
  1. Ŀ�� : Ŀ���̸�, ����
 
  2. ������  Ŀ���������� �Ұ�
  
  3. Ŀ�������� �����հ�, �Ǽ� ����� ��
		 * 
*/

	}

}

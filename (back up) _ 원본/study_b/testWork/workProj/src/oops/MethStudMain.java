package oops;
////�л�Ŭ������ ����, ����, ����, ȣ�� �Ͽ� �л������� ����ϼ���

//---  ��, �̸�, ����,  ���� [����, ����, ����], ����, ���, ���
class MethStud{
	int ban, tot, avg, rank=1, totRank=1;
	String name, gender;
	int [] jum;
	
	void init(int ban, String name, String gender, int kor, int eng, int mat) {
		this.ban = ban;
		this.name = name;
		this.gender = gender;
		this.jum = new int[] {kor, eng, mat};
		
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
		
	}
	
	void ppp() {
		String res = ban+"\t"+name+"\t"+gender+"\t";
		for (int i : jum) {
			res+=i+"\t";
		}
		res+=tot+"\t"+avg+"\t";
		res+=totRank+"\t"+rank;
		
		System.out.println(res);
	}
	
	void rankCal(MethStud [] arr) {
		for (MethStud you : arr) {
			if(avg<you.avg) {
				totRank++;
				if(ban==you.ban)
					rank++;
			}
		}
	}
}


public class MethStudMain {

	public static void main(String[] args) {
		MethStud [] studs = new MethStud[10];
		for (int i = 0; i < studs.length; i++) {
			studs[i] = new MethStud();
		}
		
		studs[0].init(2,"����", "��", 63,67,69);
		studs[1].init(1,"�����", "��", 73,77,79);
		studs[2].init(3,"Ŀ�Ǻ�", "��", 53,57,59);
		studs[3].init(1,"����", "��", 93,97,99);
		studs[4].init(3,"�̽��ͺ�", "��", 43,47,49);
		studs[5].init(2,"����", "��", 83,87,89);
		studs[6].init(2,"���", "��", 23,27,29);
		studs[7].init(1,"�ڹٺ�", "��", 83,57,49);
		studs[8].init(3,"������", "��", 63,76,91);
		studs[9].init(1,"�ֺ�", "��", 31,27,94);
		
		
		int max = 0;
		for (MethStud me : studs) {
			if(max<me.ban)
				max=me.ban;
			
			me.rankCal(studs);
		}
		
		for (int i = 1; i <=max; i++) {
			System.out.println(i+"�� >>>>>");
			for (int r = 1; r <= studs.length; r++) {
				for (MethStud st : studs) {
					if(st.ban == i && st.rank==r)
						st.ppp();
				}
			}
			
		}
		

	}

}

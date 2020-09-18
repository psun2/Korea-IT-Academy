package oops;


class ConstStud{
	
	String name, kind;
	
	int [] jum;
	
	int tot, avg, rank;
	
	ConstStud(String name, int kor, int eng, int mat) {
		this("�Ϲ�", name, kor, eng, mat);
	}
	
	ConstStud(String name, int kor, int eng, int mat, int art) {
		this("��ü��", name, kor, eng, mat, art);
	}

	ConstStud(String kind, String name, int...jum) {
		super();
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		calc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot+= i;
		}
		avg = tot/jum.length;
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			ttt+=i+"\t";
		}
		
		if(kind.equals("�Ϲ�"))
			ttt+="\t";
		ttt += tot+"\t"+avg+"\t"+rank;
		
		System.out.println(ttt);
	}
	
	void rankCalc(ConstStud [] arr) {
		rank=1;
		
		for (ConstStud you : arr) {
			if(avg<you.avg && kind.equals(you.kind))
				rank++;
		}
	}
	
}

public class ConstStudMain {

	public static void main(String[] args) {
		ConstStud [] arr = {
				new ConstStud("��¼�", 77,78,71,70),
				new ConstStud("�ӵ���", 87,88,81),
				new ConstStud("����ȣ", 47,48,41,45),
				new ConstStud("������", 57,58,51,59),
				new ConstStud("������", 97,98,91),
				new ConstStud("���ѿ�", 80,88,81,84),
				new ConstStud("�̿���", 37,38,31),
				new ConstStud("��ö��", 27,28,21)
		};
		
		for (ConstStud st : arr) {
			
			st.rankCalc(arr);
		}
		
		String [] title = {"�Ϲ�","��ü��"};
		for (String ttt : title) {
			System.out.println(ttt+">>>");
		
			for (ConstStud st : arr) {
				if(ttt.equals(st.kind))
				st.ppp();
			}
		}
		
	}

}

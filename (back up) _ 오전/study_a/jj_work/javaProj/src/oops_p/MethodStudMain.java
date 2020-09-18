package oops_p;

import java.util.Arrays;

class MethodStud{
	
	String name;
	
	int [] jum;
	
	int ban,tot, avg, rank, pos;
	
	
	///1. �ʱ�ȭ
	void init(int ban,String name, int kor, int eng, int mat) {
		this.ban = ban;
		this.name = name;
		jum = new int[] {kor,  eng,  mat};
		
		calc();
		//ppp();
	}
	
	//2.1 �����
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	//2.2 ������
	void rankCalc(MethodStud [] studs, int kind) {
		rank=1;
		
		
		for (MethodStud you : studs) {
			boolean [] chk = {
					avg < you.avg
					,avg < you.avg && ban == you.ban};
			
			if(chk[kind])
				rank++;
		}
	}
	
	//pos ��ġ ����
	void posSet(int [] banCnt) {
		pos = rank;
		
		for (int i = 0; i < ban; i++) {
			pos+=banCnt[i];
		}
	}
	
	//3. ��º�
	void ppp() {
		String ttt = ban+"\t"+name+"\t";
		for (int i : jum) {
			ttt += i+"\t";
		}
		ttt+= tot +"\t"+ avg+"\t"+ rank+"\t"+ pos;
		
		System.out.println(ttt);
	}
	
}

public class MethodStudMain {

	public static void main(String[] args) {
		MethodStud [] arr = new MethodStud[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new MethodStud();
		}
		
		arr[0].init(1,"����", 77,79,71);
		arr[1].init(4,"����", 67,69,61);
		arr[2].init(2,"������", 97,99,91);
		arr[3].init(2,"����", 57,59,51);
		arr[4].init(4,"�����", 87,89,81);
		arr[5].init(2,"���", 74,71,71);
		arr[6].init(2,"�̽��ͺ�", 62,69,61);
		arr[7].init(4,"������", 93,99,91);
		arr[8].init(1,"Ŀ�Ǻ�", 52,59,51);
		arr[9].init(4,"�ڹٺ�", 38,89,81);
		
		int max = 0;
		for (MethodStud me : arr) {
			if(max<me.ban)
				max=me.ban;
			me.rankCalc(arr, 1);
		}
		
		int [] banCnt = new int[max+1];
		
		//�� �ο��� ����
		for (MethodStud me : arr) {
			banCnt[me.ban]++;
			
		}
		
		//�� ǥ�� ��ġ �迭
		int [] indexPos = new int[max+1];
		
		//�� ǥ�� ��ġ ����
		for (int i = 0; i < indexPos.length; i++) {
			for (int j = 0; j < i; j++) {
				indexPos[i]+= banCnt[j];
			}
		}
		System.out.println(Arrays.toString(banCnt));
		System.out.println(Arrays.toString(indexPos));
		/*
		[0, 2, 4, 0, 4]
		    1  2  3  4
		    
		    2�� 3��  - 5  0->1 �ο��� + ���
		    4�� 2��  - 8  0->3 �ο��� + ��� 
		*/
		for (MethodStud me : arr) {
			me.posSet(banCnt);	
		}

		for (int j = 1; j <= arr.length; j++) {
			
			for (int i = 1; i < indexPos.length; i++) {
				if(indexPos[i]==j-1)
					System.out.println(i+"��>>>>>");
			}
			
			for (MethodStud me : arr) {
				if(j==me.pos)
					me.ppp();
			
			}
		}
		// -- ��Ŭ������ �̿��Ͽ� �л� ������ ������ �ּ���
		// -- �ݺ��� �����Ͽ� ����� �ּ��� 
		// �ݺ��� ���������� ����� �ּ���(����� 1.  �ݺ����, 2. ��ü���)

	}

}

package coll_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

class StMusic{
	int no;
	String title, singer;
	
	String [] arr;
	public StMusic(int no, String title, String singer) {
		super();
		this.no = no;
		this.title = title;
		this.singer = singer;
		arr = new String [] {title, singer};
	}
	@Override
	public String toString() {
		return " [" + no + "," + title + ", " + singer + "] ";
	}	
}

class StMP3{
	Stack back = new Stack();
	Stack next;
	ArrayList list = new ArrayList();
	StMusic now;
	
	int cnt=0;
	
	void add(String title, String singer) {
		cnt++;
		list.add(new StMusic(cnt, title, singer));
		//init();
	}
	
	void init() {
		Collections.reverse(list);
		next = new Stack();
		next.addAll(list);
	}
	
	void goNext() {
		
		System.out.println("<<<����>>>---------------------");
		if(next.empty()) {
			System.out.println("�������� �����ϴ�.");
			return;
		}
		
		nextModule();
		
		ppp();
	}
	
	void nextModule() {
		if(now!=null)
			back.push(now);
		
		now = (StMusic)next.pop();
	}
	
	void goBack() {
		System.out.println("<<<�ڷ�>>>---------------------");
		if(back.empty()) {
			System.out.println("�������� �����ϴ�.");
			return;
		}
		
		backModule();
		
		ppp();
	}
	
	void backModule() {
		if(now!=null)
			next.push(now);
		
		now = (StMusic)back.pop();
	}
	
	void goTrackNo(int no) {
		System.out.println("<<< "+no+" >>>---------------------");

		trackNoModule(no);
			
		ppp();
	}
	
	void trackNoModule(int no) {
		while(true) {
			
			if(no>now.no)
				nextModule();
			else if(no<now.no)
				backModule();
			else
				break;
		}
	}
	
	
	void search(String mm, int i) {
		
		System.out.println(
				"<<< search ("+new String [] {"����","����"}[i]+
				") : "+mm+" >>>---------------------");

		int nowNo = now.no;
		
		boolean chk = false;
		
		while(true) {
			
			nextModule();
			
			if(chk = schModule(mm,i)) {
				break;
			}
			
			if(next.empty())
				break;
		}
		
		if(!chk) {
			back.clear();
			init();
			init();
			now=null;
			//ppp();
			while(true) {
				
				nextModule();
				if(chk = schModule(mm,i)) {
					break;
				}
				
				if(nowNo == now.no)
					break;
			}
		}
		if(!chk)
		System.out.println(mm+" �˻������ �����ϴ�.");
		ppp();
	}
	
	
	void search2(String mm, int i) {
		
		System.out.println(
				"<<< search ("+new String [] {"����","����"}[i]+
				") : "+mm+" >>>---------------------");

		int nowNo = now.no;
		
		ArrayList res = new ArrayList();
		
		while(true) {
			
			nextModule();
			
			if(schModule(mm,i)) {
				res.add(now);
			}
			
			if(next.empty())
				break;
		}
		
		
		back.clear();
		init();
		init();
		now=null;
		//ppp();
		while(true) {
			
			nextModule();
			if(schModule(mm,i)) {
				res.add(now);
			}
			
			if(nowNo == now.no)
				break;
		}
		
		if(res.isEmpty())
			System.out.println(mm+" �˻������ �����ϴ�.");
		else {
			System.out.println("�˻����:"+res);
			System.out.print("��ȣ�Է�:");
			
			Scanner sc = new Scanner(System.in);
			int nn = sc.nextInt();
			
			trackNoModule(nn);
		}
		ppp();
	}
	
	boolean schModule(String data,  int i) {
		String zipSch=".*";
		String [] index = {
				"��������������������������������������",
				"�����ٶ󸶹ٻ������īŸ���Ϻ�¥�����",
				"�����L���J����磠���i�M���R���������"
		};
		for (char ch : data.toCharArray() ) {
			int pos = index[0].indexOf(ch);
			if(pos>=0) {
				zipSch+="["+index[1].charAt(pos)+"-"+index[2].charAt(pos)+"]";
			}else {
				zipSch+=ch;
			}
		}
		zipSch+=".*";
		
		//System.out.println(zipSch+":"+now.title);
		
		return Pattern.matches(zipSch, now.arr[i]);
	}
	
	void ppp() {
		System.out.println("�����:"+ now);
		System.out.println("������:"+back);
		System.out.println("������:"+next);
//		if(!back.isEmpty())
//			System.out.println("������:"+back.lastElement());
//		if(!next.isEmpty())
//			System.out.println("������:"+next.lastElement());
	}
}

public class StackMP3Main {

	public static void main(String[] args) {
		StMP3 mp3 = new StMP3();

		
		mp3.add("����ϰ� ���� ������", "���̵�");
        mp3.add("���� �Ƶ��", "������");
        mp3.add("�˷���", "������");
        mp3.add("����̰��ѳ���", "�����������");
        mp3.add("���� ����¼", "�����̰�");
        mp3.add("�ڴٱ���", "Crush");
        mp3.add("�� ���� ���", "����");
        mp3.add("���۳��� ������ �Ұ�������", "����");
        mp3.add("��鸮�� �ɵ�ӿ��� �� �˳����� �������ž�", "�����");
        mp3.add("�ƹ���", "����");
        
        mp3.init();
        //System.out.println(mp3.next);
        mp3.goNext();
        
        
        mp3.goNext();
        mp3.goNext();
        mp3.goNext();
        mp3.goBack();
        mp3.goTrackNo(5);
        mp3.goNext();
        mp3.search("��",1);
        mp3.search2("��",0);
        
	}

}

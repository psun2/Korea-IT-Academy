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
		
		System.out.println("<<<다음>>>---------------------");
		if(next.empty()) {
			System.out.println("다음곡이 없습니다.");
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
		System.out.println("<<<뒤로>>>---------------------");
		if(back.empty()) {
			System.out.println("이전곡이 없습니다.");
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
				"<<< search ("+new String [] {"제목","가수"}[i]+
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
		System.out.println(mm+" 검색결과가 없습니다.");
		ppp();
	}
	
	
	void search2(String mm, int i) {
		
		System.out.println(
				"<<< search ("+new String [] {"제목","가수"}[i]+
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
			System.out.println(mm+" 검색결과가 없습니다.");
		else {
			System.out.println("검색결과:"+res);
			System.out.print("번호입력:");
			
			Scanner sc = new Scanner(System.in);
			int nn = sc.nextInt();
			
			trackNoModule(nn);
		}
		ppp();
	}
	
	boolean schModule(String data,  int i) {
		String zipSch=".*";
		String [] index = {
				"ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㅃㅉㄸㄲㅆ",
				"가나다라마바사아자차카타파하빠짜따까싸",
				"깋닣딯맇밓빟싷잏짛칳킿팋핗힣삫찧띻낗앃"
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
		System.out.println("현재곡:"+ now);
		System.out.println("이전곡:"+back);
		System.out.println("다음곡:"+next);
//		if(!back.isEmpty())
//			System.out.println("이전곡:"+back.lastElement());
//		if(!next.isEmpty())
//			System.out.println("다음곡:"+next.lastElement());
	}
}

public class StackMP3Main {

	public static void main(String[] args) {
		StMP3 mp3 = new StMP3();

		
		mp3.add("사랑하게 될줄 몰랐어", "전미도");
        mp3.add("에잇 아디야", "아이유");
        mp3.add("알로하", "조정석");
        mp3.add("고양이가싼나비", "볼빨간사춘기");
        mp3.add("마잉 설아쩌", "오마이걸");
        mp3.add("자다깨다", "Crush");
        mp3.add("내 똥을 모아", "휘인");
        mp3.add("나쁜남자 있으면 소개시켜줘", "조이");
        mp3.add("흔들리는 꽃들속에서 네 똥냄새가 느껴진거야", "장범준");
        mp3.add("아무똥", "지코");
        
        mp3.init();
        //System.out.println(mp3.next);
        mp3.goNext();
        
        
        mp3.goNext();
        mp3.goNext();
        mp3.goNext();
        mp3.goBack();
        mp3.goTrackNo(5);
        mp3.goNext();
        mp3.search("이",1);
        mp3.search2("ㅇ",0);
        
	}

}

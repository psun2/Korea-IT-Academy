package coll_p;

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
		arr = new String[] {title, singer};
	}
	@Override
	public String toString() {
		return "[" + no + ", " + title + ", " + singer + "]";
	}
	
	boolean search(int i, String pp) {
		return Pattern.matches(pp, arr[i]);
	}
	
}


class StMP3{
	
	
	Stack back = new Stack();
	Stack next = new Stack();
	StMusic now;
	int max =-1;
	
	void goNext() {
		System.out.println("goNext()------------------------");
		if(next.empty()) {
			System.out.println("다음곡이 없습니다.");
			return;
		}
		
		next_M();
		ppp();
	}
	
	void next_M() {
		if(now!=null)
			back.push(now);
		
		now = (StMusic)next.pop();
	}
	
	
	void goBack() {
		System.out.println("goBack()------------------------");
		if(back.empty()) {
			System.out.println("다음곡이 없습니다.");
			return;
		}
		
		back_M();
		ppp();
	}
	
	void back_M() {
		if(now!=null)
			next.push(now);
		
		now = (StMusic)back.pop();
	}
	
	
	void goNo(int no) {
		System.out.println("goNo("+no+")------------------------");
		
		if(no<1 || no>max) {
			System.out.println("없는 번호 입니다.");
			return;
		}
		
		while(now.no<no) {
			next_M();
		}
		
		while(now.no>no) {
			back_M();
		}
		
		ppp();
	}
	
	void ppp() {
		
		System.out.println("현재:"+now);
		System.out.println("이전곡들:"+back);
		System.out.println("다음곡들:"+next);
	}
	void add(int no, String title, String singer) {
		if(max<no)
			max=no;
		
		next.push(new StMusic(no, title, singer));
	}
	
	String ppStr(String str) {
		String pp = ".*";
		String [] hangul = {
				"ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㅃㅉㄸㄲㅆ",
				"가나다라마바사아자차카타파하빠짜따까싸",
				"깋닣딯맇밓빟싷잏짛칳킿팋핗힣삫찧띻낗앃"
		};
		
		for (char ch : str.toCharArray()) {
			int p = hangul[0].indexOf(ch);
			if(p>=0) {
				pp+="["+hangul[1].charAt(p)+"-"+hangul[2].charAt(p)+"]";
			}else {
				pp+=ch;
			}
		}
		
		pp += ".*";
		return pp;
	}
	
	void search(int i, String str) {
		
		String [] title = {"제목","가수"};
		System.out.println("search("+title[i]+","+str+")------------------------");
		
		int nowNum = now.no;
		boolean chk = false;
		String pp = ppStr(str);
		
		
		while(!next.empty()) {
			next_M();
			if(chk = now.search(i, pp))
				break;
		}
		
		if(!chk) {
		
			while(!back.empty()) {
				back_M();
			}
			
			next_M();
			while(nowNum!=now.no) {
				
				if(chk = now.search(i, pp))
					break;
				
				next_M();
			}
		}
		
		if(!chk) {
			System.out.println("찾으시는 곡이 없습니다.");
		}else {
			ppp();
		}
		
	}
}


public class StackMP3Main {

	public static void main(String[] args) {
		StMP3 mp3 = new StMP3();

		mp3.add(8,"그때 그 아인","김필");
        mp3.add(7,"모든 날, 모든 순간","폴킴");
        mp3.add(6,"시든 꽃에 물을 주듯","HYNN");
        mp3.add(5,"먼지가 되어","김광석");
        mp3.add(4,"Attention","Charlie Puth");
        mp3.add(3,"Please Don't Touch","RAYE");
        mp3.add(2,"Faded","Alan Walker");
        mp3.add(1,"All of Me","John Legend");

        mp3.goNext();
        mp3.goNext();
        mp3.goNext();
        mp3.goNo(11);
        mp3.goNext();
        mp3.goNext();
        mp3.goNext();
        mp3.goNo(2);
        mp3.goBack();
        mp3.goBack();
        mp3.goNo(4);
        mp3.search(0, "모든");
        mp3.search(1, "Wal");
        mp3.search(0, "ㄲ에");
	}

}

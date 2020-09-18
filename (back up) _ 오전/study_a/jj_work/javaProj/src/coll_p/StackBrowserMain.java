package coll_p;

import java.util.Stack;

class Browser{
	String now;
	Stack back = new Stack();
	Stack next = new Stack();
	
	void goUrl(String url) {
		System.out.println("goUrl("+url+")----------");
		next.clear();
		if(now!=null)
			back.push(now);
		
		now=url;
		
		ppp();
	}
	
	void goBack() {
		System.out.println("goBack----------");
		if(back.empty()) {
			System.out.println("뒤로 갈 페이지가 없습니다.");
			return;
		}
		next.push(now);
		now = (String)back.pop();
		
		ppp();
	}
	
	void goNext() {
		System.out.println("goNext----------");
		if(next.empty()) {
			System.out.println("앞으로 갈 페이지가 없습니다.");
			return;
		}
		back.push(now);
		now = (String)next.pop();
		
		ppp();
	}
	
	void ppp() {
		System.out.println("now:"+now);
		System.out.println("back:"+back);
		System.out.println("next:"+next);
	}
}
public class StackBrowserMain {

	public static void main(String[] args) {
		Browser bw = new Browser();
		
		bw.goUrl("네이버");
		bw.goUrl("다음");
		bw.goUrl("네이트");
		bw.goUrl("줌");
		bw.goBack();
		bw.goBack();
		bw.goBack();
		bw.goBack();
		bw.goBack();
		bw.goNext();
		bw.goNext();
		bw.goNext();
		bw.goNext();
		bw.goBack();
		bw.goBack();
		bw.goUrl("구글");
		bw.goNext();
	}

}

package coll_p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue qq = new LinkedList();
		
//		st.add(1);
//		st.add(2);
//		st.add(3);
//		
//		qq.add(1);
//		qq.add(2);
//		qq.add(3);
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		qq.offer(1);
		qq.offer(2);
		qq.offer(3);
		
		
		System.out.println(st.get(0));
		//System.out.println(qq.get(0));
		
		//System.out.println(st.pop());
		//System.out.println(qq.poll());
		System.out.println(st);
		System.out.println(qq);
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println(st);
		
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
		System.out.println(qq);
	}

}


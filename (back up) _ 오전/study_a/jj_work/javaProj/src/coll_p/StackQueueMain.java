package coll_p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueMain {

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
		
		System.out.println(st.empty());
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.empty());
		
		qq.offer(1);
		qq.offer(2);
		qq.offer(3);
		
		System.out.println(st);
		System.out.println(qq);
		
		for (int i = 0; i < st.size(); i++) {
			System.out.println(i+":"+st.get(i));//+","+qq.get(i));
		}
		
		//Object oo = st.pop();
		//System.out.println(st);
		//System.out.println(oo);
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("--------------");
		
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
		System.out.println("--------------");
		
		System.out.println(st);
		System.out.println(qq);
	}

}


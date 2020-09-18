package coll_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BingoMain {

	public static void main(String[] args) {
		int no = 5;
		
		Set bingo = new HashSet();
		
		while(true) {
			
			bingo.add((int)(Math.random()*100+1));
			
			if(bingo.size()==no*no)
				break;
		}
		
		ArrayList list = new ArrayList(bingo);
		Collections.shuffle(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
			
			if((i+1)%no==0)
				System.out.println();
		}

	}

}

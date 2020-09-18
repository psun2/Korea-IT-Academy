package util_p;

import java.util.Calendar;

class MatrixHoly{
	
	int m, d;
	String title;
	public MatrixHoly(String title,int m, int d ) {
		super();
		this.m = m;
		this.d = d;
		this.title = title;
	}
	
	
	String chk(Calendar day) {
		if((m+"_"+d).equals(day.get(Calendar.MONTH)+1+"_"+day.get(Calendar.DATE)))
			return title;
			
		return "";
	}
	
}


class MMM{
	
	int [][] date=new int[6][7];
	String [][] spec=new String[6][7];
	Calendar day;
	Calendar now;
	int month;
	MatrixHoly [] arr;
	public MMM(int year, int month, MatrixHoly [] arr) {
		this.month = month;
		this.arr = arr;
		
		now = Calendar.getInstance();
		day = Calendar.getInstance();
		day.set(year, this.month,1);
		
		init();
	}
	
	void init() {
		for (int i = 1; i <=day.getActualMaximum(Calendar.DATE); i++) {
			day.set(Calendar.DATE,i);
			date[day.get(Calendar.WEEK_OF_MONTH)-1][day.get(Calendar.DAY_OF_WEEK)-1] = i;
			
			String sss = "";
			
			for (MatrixHoly hh : arr) {
				
				if(!(sss=hh.chk(day)).equals("")) 
					break;
			}
			
			spec[day.get(Calendar.WEEK_OF_MONTH)-1][day.get(Calendar.DAY_OF_WEEK)-1] = sss;
			
			
		}
		
	}
	
	String getWeek(int w) {
		String res = "";
		for (int j = 0; j<date[w].length;j++) {
			String ddStr = "";
			if(date[w][j]!=0) {
				if(date[w][j]<10)
					ddStr+=" ";
				ddStr+=date[w][j];
			}
			
			if(now.get(Calendar.MONTH)==month && 
			   now.get(Calendar.DATE)==date[w][j])
			{
				ddStr= "["+ddStr+"]";
			}else {
				ddStr= " "+ddStr;
			}
					
			res+=ddStr+"\t";	
		}
		
		return res;
	}
	
	String getSpec(int w) {
		String res = "";
		for (int j = 0; j<date[w].length;j++) {
			if(spec[w][j]==null)
				res+="";
			else
				res+=spec[w][j];	
			
			res+="\t";
		}
		return res;
	}
	
}


public class MatrixDiaryMain {

	public static void main(String[] args) {
		
		MatrixHoly [] arr = {
				new MatrixHoly("탄신일",3, 20),
				new MatrixHoly("광복절",8, 15),
				new MatrixHoly("한글날",10, 9),
				new MatrixHoly("설날",1, 27),
				new MatrixHoly("설날",1, 26),
				new MatrixHoly("설날",1, 25)
		};
		
		int year = 2019;
		
		MMM [] mm = new MMM[12];
		
		int col = 5;
		
		for (int i = 0; i < mm.length; i++) {
			mm[i] = new MMM(year, i, arr);
		}
		
		
		///출력부
		String ddTitle = "";
		for(char ch: "일월화수목금토".toCharArray())
			ddTitle+="  "+ch+"\t";
		
		ddTitle+="\t\t";
		for (int i = 0; i < mm.length; i+=col) {
			
			int last = i+col;
			
			if(last>=mm.length)
				last=mm.length;
			
			String monthLine="\n";
			String line="\n";
			String ddTitleLine="\n";
			for (int tt = i; tt<last; tt++) {
				monthLine+="\t\t\t"+(tt+1)+"월\t\t\t\t\t\t";
				line+="--------------------------------------------------------\t\t";
				ddTitleLine+=ddTitle;
			}
			System.out.println(monthLine);
			System.out.println(line);
			System.out.println(ddTitleLine);
			System.out.println(line);
			
			for (int w = 0; w < 6; w++) {
				for (int m = i; m<last; m++) 
					System.out.print(mm[m].getWeek(w)+"\t\t");
				System.out.println();
				for (int m = i; m<last; m++) 
					System.out.print(mm[m].getSpec(w)+"\t\t");
				System.out.println();
			}
			System.out.println("\n\n");
		}
		

	}

}

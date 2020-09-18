package ext_p;

import java.io.File;
import java.util.Arrays;
import java.util.TreeSet;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

class ExcelExam implements Comparable<ExcelExam>{
	String name, grade;
	int [] jum;
	int tot, avg, rank;
	
	public ExcelExam(Cell [] cells) {
		name = cells[0].getContents();
		
		jum = new int [] {
				Integer.parseInt(cells[1].getContents()),
				Integer.parseInt(cells[2].getContents()),
				Integer.parseInt(cells[3].getContents())
		};
		
		calc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot+=i;
		}
		avg = tot/jum.length;
		grade ="가가가가가가양미우수수".charAt(avg/10)+"";
	}
	
	void rankCalc(TreeSet<ExcelExam> set) {
		rank = 1;
		for (ExcelExam you : set) {
			if(avg<you.avg)
				rank++;
		}
	}
	
	

	@Override
	public String toString() {
		return name + "\t" + Arrays.toString(jum) + "\t" + 
				tot + "\t" + avg + "\t"+
				grade + "\t"+  rank;
	}

	@Override
	public int compareTo(ExcelExam o) {
		int res = o.avg-avg;
		if(res==0)
			res = 1;
		return res;
	}
	
	void write(WritableSheet wsh, int row) {
		try {
			int col =0;
			wsh.addCell(new Label(col++, row, name));
			
			for (int i :jum) {
				wsh.addCell(new Label(col++, row, i+""));
			}
			wsh.addCell(new Label(col++, row, tot+""));
			wsh.addCell(new Label(col++, row, avg+""));
			wsh.addCell(new Label(col++, row, grade));
			wsh.addCell(new Label(col++, row, rank+""));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ExcelExamRead {

	public static void main(String[] args) {
		try {
			Workbook wb = Workbook.getWorkbook(new File("fff/exam.xls"));
			
			
			TreeSet<ExcelExam> set = new TreeSet<ExcelExam>();
			
			Sheet sheet = wb.getSheet(0);
			for (int i = 1; i < sheet.getRows(); i++) {
				set.add(new ExcelExam(sheet.getRow(i)));
			}
			wb.close();
			
			
			WritableWorkbook wwk = Workbook.createWorkbook(new File("fff/examRes.xls"));
			WritableSheet wsh = wwk.createSheet("시험결과", 0);
			
			int row = 0;
			String [] index = "이름,국어,영어,수학,총점,평균,등급,등수".split(",");
			for (int i = 0; i < index.length; i++) {
				wsh.addCell(new Label(i, row, index[i]));
			}
			
			
			for (ExcelExam ex : set) {
				row++;
				ex.rankCalc(set);
				ex.write(wsh,row);
				System.out.println(ex);
			}
			
			wwk.write();
			wwk.close();
		////fff/examRes.xls에  
		///학생정보와 각 학생의 총점, 평균, 등급, 등수를 출력하세요
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

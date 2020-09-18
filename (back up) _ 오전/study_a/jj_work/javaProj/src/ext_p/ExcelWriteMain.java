package ext_p;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWriteMain {

	public static void main(String[] args) {
		try {
			
			///excel 파일 생성
			WritableWorkbook wwk = Workbook.createWorkbook(new File("fff/www.xls"));
			
			//sheet 생성 						   시트이름, 시트순서
			WritableSheet sh1 = wwk.createSheet("시트여_1", 0);
			WritableSheet sh3 = wwk.createSheet("시트여_3", 2);
			WritableSheet sh2 = wwk.createSheet("시트여_2", 1);
			
								//2열, 3행
			Label lb = new Label(2, 3, "3행 2열이여");
			sh1.addCell(lb);  //라벨  sheet에 쓰기
			
			sh3.addCell(new Label(5, 6, "여\\긴\t참나무숲\n장수\"풍뎅이\"와\r\n \'사슴벌레\'가 살지"));
		
			int i =0;
			int col = 13;
			for (int row = 0; row < 10; row++) {
				
				
				sh2.addCell(new Label(col, row, "데이터여 "+i));
				i++;
				col--;
				
			}
			
			
			wwk.write(); //직접 파일에 작성
			wwk.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

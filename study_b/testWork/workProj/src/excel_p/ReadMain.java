package excel_p;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadMain {

	public static void main(String[] args) {
		try {
			Workbook wb = Workbook.getWorkbook(new File("fff/www.xls"));
			
			System.out.println(wb.getNumberOfSheets()); // 시트수 반환
			
			Sheet [] arr = wb.getSheets();
			
			for (Sheet sheet : arr) {
				System.out.println(sheet.getName());
			}
			
			Sheet sh = wb.getSheet(1);
			
			System.out.println(sh.getRows()); // 행 반환
			System.out.println(sh.getColumns()); // 열 반화
			
			Cell cell = sh.getCell(1, 2);
			System.out.println(cell);
			System.out.println(cell.getType());
			System.out.println(cell.getContents());
			
			System.out.println("------------------------------");
			
			for (int i = 0; i < sh.getRows(); i++) {
				cell = sh.getCell(1, i);
				System.out.println(cell.getContents());
			}
			
			wb.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package ext_p;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReadMain {

	public static void main(String[] args) {
		
		try {
			File ff = new File("fff/team_leader.xls");
			Workbook wb = Workbook.getWorkbook(ff);
			
			System.out.println("wb.getNumberOfSheets():"+wb.getNumberOfSheets()); //시트갯수
			Sheet [] arr = wb.getSheets(); //sheet 배열
			System.out.println("wb.getSheets() ----------");
			for (Sheet sh : arr) {
				System.out.println(sh.getName());//sheet 이름
			}
			
			Sheet sheet = wb.getSheet(0);  //0번째 시트를 가져옴
		
			//행갯수
			System.out.println("sheet.getRows():"+sheet.getRows());
			
			//열갯수
			System.out.println("sheet.getColumns():"+sheet.getColumns());
			
			//셀  (열, 행)
			Cell cell = sheet.getCell(0, 1);
			System.out.println("sheet.getCell(0, 1):"+cell);
			
			//셀  타입
			System.out.println("cell.getType():"+cell.getType());
			
			//셀  데이터
			System.out.println("cell.getContents():"+cell.getContents());
			
			
			cell = sheet.getCell(2, 1);
			System.out.println("sheet.getCell(2, 1):"+cell);
			
			//셀  타입
			System.out.println("cell.getType():"+cell.getType());
			
			//셀  데이터
			System.out.println("cell.getContents():"+cell.getContents());
			
			
			System.out.println("0번 시트  데이터---------------------------");
			
			for (int row = 0; row < sheet.getRows(); row++) {  //행
				for (int col = 0; col < sheet.getColumns(); col++) { //열
					Cell cc = sheet.getCell(col, row); // cell(열,행) 
					System.out.print(cc.getContents()+",");
				}
				System.out.println();
			}
			
			
			
			////fff/exam.xls 의 내용을 가져와  
			///학생정보와 각 학생의 총점, 평균, 등급, 등수를 출력하세요
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

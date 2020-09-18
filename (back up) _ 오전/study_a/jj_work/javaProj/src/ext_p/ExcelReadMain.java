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
			
			System.out.println("wb.getNumberOfSheets():"+wb.getNumberOfSheets()); //��Ʈ����
			Sheet [] arr = wb.getSheets(); //sheet �迭
			System.out.println("wb.getSheets() ----------");
			for (Sheet sh : arr) {
				System.out.println(sh.getName());//sheet �̸�
			}
			
			Sheet sheet = wb.getSheet(0);  //0��° ��Ʈ�� ������
		
			//�హ��
			System.out.println("sheet.getRows():"+sheet.getRows());
			
			//������
			System.out.println("sheet.getColumns():"+sheet.getColumns());
			
			//��  (��, ��)
			Cell cell = sheet.getCell(0, 1);
			System.out.println("sheet.getCell(0, 1):"+cell);
			
			//��  Ÿ��
			System.out.println("cell.getType():"+cell.getType());
			
			//��  ������
			System.out.println("cell.getContents():"+cell.getContents());
			
			
			cell = sheet.getCell(2, 1);
			System.out.println("sheet.getCell(2, 1):"+cell);
			
			//��  Ÿ��
			System.out.println("cell.getType():"+cell.getType());
			
			//��  ������
			System.out.println("cell.getContents():"+cell.getContents());
			
			
			System.out.println("0�� ��Ʈ  ������---------------------------");
			
			for (int row = 0; row < sheet.getRows(); row++) {  //��
				for (int col = 0; col < sheet.getColumns(); col++) { //��
					Cell cc = sheet.getCell(col, row); // cell(��,��) 
					System.out.print(cc.getContents()+",");
				}
				System.out.println();
			}
			
			
			
			////fff/exam.xls �� ������ ������  
			///�л������� �� �л��� ����, ���, ���, ����� ����ϼ���
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

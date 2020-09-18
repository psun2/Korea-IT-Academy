package excel_p;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			WritableWorkbook wwk = Workbook.createWorkbook(new File("fff/www.xls"));
			System.out.println("[ wwk ] : " + wwk);

			WritableSheet sh1 = wwk.createSheet("시트여_1", 0);
			WritableSheet sh2 = wwk.createSheet("시트여_3", 1);
			WritableSheet sh3 = wwk.createSheet("시트여_2", 2);
			System.out.println("[ sh1 ] : " + sh1);

//			for (int i = 0; i < 5; i++) {
//				WritableSheet sheet = wwk.createSheet("시트여" + i, i);
//			wwk.write();
//			}

			Label lb = new Label(2, 3, "3행 2열이지");
			sh1.addCell(lb);

			// 시작 : 1, 2
			// 뒷자리가 2씩 늘어남

			final int numSize = 100;
			final int columnSize = 2;
			int num = numSize;
			int row = 1;
			int column = columnSize;

			while (true) {

				System.out.println("진입");

				Label lbs = new Label(row, column, num + "");
				num += numSize;
				column += columnSize;
				sh2.addCell(lbs);
				if (num > 1000)
					break;
			}

			wwk.write();
			wwk.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

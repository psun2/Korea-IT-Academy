import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

class Write {

	File file;
	WritableWorkbook wwk;
	WritableSheet sheet;
	String[][] contents;

	public Write(File file, String[][] contents) {
		// TODO Auto-generated constructor stub
		this.file = file;
		this.contents = contents;
		init();
	}

	void init() {

		try {
			this.wwk = Workbook.createWorkbook(file);
			this.sheet = wwk.createSheet("시험sheet", 0);

			int column = 0;
			int row = 0;
			for (String[] str : contents) {

				for (String str2 : str) {

					sheet.addCell(new Label(column, row, str2));
					column++;
				}
				column = 0;
				row++;
			}

			wwk.write();
			wwk.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				if (wwk != null)
					wwk.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}

class Read {

	File file;
	Workbook wb;
	Sheet sheet;

	public Read(File file) {
		// TODO Auto-generated constructor stub
		this.file = file;
		init();
	}

	void init() {
		try {
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				if (wb != null)
					wb.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

	void ppp() {

		try {

			sheet = wb.getSheet(0);

			for (int i = 0; i < sheet.getRows(); i++) {

				for (int j = 0; j < sheet.getColumns(); j++) {
					System.out.print(sheet.getCell(j, i).getContents() + "\t");
				}
				System.out.println();

			}

			wb.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

public class Test3 {

	public static void main(String[] args) {

		new File("fff").mkdir();

		String[][] contents = { { "이름", "반", "전화", "생일" }, { "정우성", "1", "010-1111-1111", "1997-05-06" },
				{ "정좌성", "1", "010-2222-2222", "1997-08-08" }, { "정북성", "3", "010-3333-3333", "1997-02-05" },
				{ "정남성", "2", "010-4444-4444", "1996-06-02" }, { "정중성", "3", "010-5555-5555", "1998-11-13" } };

		Write write = new Write(new File("./fff/aaa.xls"), contents);

		Read read = new Read(new File("./fff/aaa.xls"));

		read.ppp();

	}

}

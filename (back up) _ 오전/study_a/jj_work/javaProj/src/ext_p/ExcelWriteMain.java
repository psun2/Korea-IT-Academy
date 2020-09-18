package ext_p;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWriteMain {

	public static void main(String[] args) {
		try {
			
			///excel ���� ����
			WritableWorkbook wwk = Workbook.createWorkbook(new File("fff/www.xls"));
			
			//sheet ���� 						   ��Ʈ�̸�, ��Ʈ����
			WritableSheet sh1 = wwk.createSheet("��Ʈ��_1", 0);
			WritableSheet sh3 = wwk.createSheet("��Ʈ��_3", 2);
			WritableSheet sh2 = wwk.createSheet("��Ʈ��_2", 1);
			
								//2��, 3��
			Label lb = new Label(2, 3, "3�� 2���̿�");
			sh1.addCell(lb);  //��  sheet�� ����
			
			sh3.addCell(new Label(5, 6, "��\\��\t��������\n���\"ǳ����\"��\r\n \'�罿����\'�� ����"));
		
			int i =0;
			int col = 13;
			for (int row = 0; row < 10; row++) {
				
				
				sh2.addCell(new Label(col, row, "�����Ϳ� "+i));
				i++;
				col--;
				
			}
			
			
			wwk.write(); //���� ���Ͽ� �ۼ�
			wwk.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

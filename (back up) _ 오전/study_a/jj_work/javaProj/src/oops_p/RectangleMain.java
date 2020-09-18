package oops_p;

//���簢�� Ŭ������ �ϼ��ϼ���
//������� : �����̸�, ����, ����, ����, �ѷ�
// ���簢�� 5�� �Է¹޾� ����ϰ�
//����, �ѷ��� ��ü �հ�, ���
// �ִ� �ּ�

class RectangleCla{
	String name;
	int w, h, area, border;
}

public class RectangleMain {

	public static void main(String[] args) {

		//1. �Էº�
		RectangleCla [] arr = new RectangleCla[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new RectangleCla();
		}
		
		arr[0].name = "���ϰ���";
		arr[0].w = 24;
		arr[0].h = 35;
		
		arr[1].name = "���̰���";
		arr[1].w = 156;
		arr[1].h = 1;
		
		arr[2].name = "���ﰢ��";
		arr[2].w = 18;
		arr[2].h = 19;
		
		arr[3].name = "���簢��";
		arr[3].w = 10;
		arr[3].h = 20;
		
		arr[4].name = "��������";
		arr[4].w = 30;
		arr[4].h = 40;
		
		RectangleCla [] res = {
				new RectangleCla(),new RectangleCla()
				,new RectangleCla(),new RectangleCla()};
		
		
		res[0].name = "�հ�";
		res[1].name = "���";
		res[2].name = "�ִ�";  ///�ʱⰪ 0, 0
		res[3].name = "�ּ�";
		
		
		
		
		//2.1  ���� �����
		for (RectangleCla rec : arr) {
			
			rec.border = (rec.w+rec.h)*2;
			rec.area = rec.w*rec.h;
		}
		
		
		//2.2 ��� �����
		res[3].border=arr[0].border; //���� �� ó�� ������ �ѷ��� �⺻������ ������
		res[3].area=arr[0].area;     //���� �� ó�� ������ ũ�⸦ �⺻������ ������
		
		for (RectangleCla rec : arr) {
			
			res[0].w +=rec.w;
			res[0].h +=rec.h;
			res[0].border +=rec.border;
			res[0].area +=rec.area;
			
			if(res[2].border<rec.border) {
				res[2].border=rec.border;
			}
			if(res[2].area<rec.area) {
				res[2].area=rec.area;
			}
			
			if(res[3].border>rec.border) {
				res[3].border=rec.border;
			}
			if(res[3].area>rec.area) {
				res[3].area=rec.area;
			}
			
		}
		
		res[1].w =res[0].w/arr.length;
		res[1].h =res[0].h/arr.length;
		res[1].border =res[0].border/arr.length;
		res[1].area=res[0].area/arr.length;
		
		//3. ��º�
		
		for (RectangleCla rec : arr) {
			String ttt = rec.name+"\t"
					+rec.h+"\t"
					+rec.w+"\t"
					+rec.area+"\t"
					+rec.border;
			System.out.println(ttt);
		}
		System.out.println("-------------------------------------");
		for (RectangleCla rec : res) {
			String ttt = rec.name+"\t"
					+rec.h+"\t"
					+rec.w+"\t"
					+rec.area+"\t"
					+rec.border;
			System.out.println(ttt);
		}

	}

}

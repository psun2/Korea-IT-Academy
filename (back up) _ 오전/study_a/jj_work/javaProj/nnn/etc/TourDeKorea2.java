package oops;

//��ü �ڵ��� ����Ÿ��� ����ϼ���

class Zone2{	//������
	
	static int[] move= {	//�λ꿡�� �λ�,��õ,����,���� �̵��ðŸ�
    		0,300,500,700
	};
    
	static Place2[] Busan = {
    		new Place2("�ؿ��",20,0),
    		new Place2("���ȸ�",10,0),
    		new Place2("�ڰ�ġ����",10,0),
    		//new Place("�λ�",300)
    };
    
   	static Place2[] chuncheon = {
    		new Place2("�Ҿ簭",10,1),
    		new Place2("�߰���",20,1),
    		new Place2("��õȣ",30,1),
    		//new Place("��õ",200)
    };
   	static Place2[] Suwon = {
    		new Place2("������",10,2),
    		new Place2("������",10,2),
    		new Place2("������",5,2),
    		new Place2("������",15,2),
    		new Place2("�������",20,2),
    		new Place2("������",10,2),
    		//new Place("����",200)
    };
    
   	static Place2[] Daejeon = {
    		new Place2("������",5,3),
    		new Place2("������",7,3),
    		new Place2("������",5,3),
    		new Place2("������",10,3),
    		new Place2("������",20,3),
    		new Place2("��������",15,3)
    		};
    
   static Place2[][] zone= {
    		Busan,chuncheon,Suwon,Daejeon
    };
	
	
}
class Place2{		//���
	String place;
    int distance;
    int localNum;
    static int endPlace;
    //static Zone2 aa= new Zone2();
      
    Place2(String aa,    int bb,	int cc)//�����̸� , �Ÿ�, ������ȣ(�Ÿ�����)
    {
        place = aa;
        distance = bb;
        localNum = cc;
    }
    
    Place2 (String[] ad){
    	System.out.print("������ : ");
    	for(String ap : ad) {
			cal(ap);
		}
    	System.out.println("\n���̵��Ÿ� :"+ (distance+Zone2.move[endPlace]));
    }
    int cal(String name) {
    	for(Place2[] aaa: Zone2.zone) {
    		for(Place2 p : aaa) {
        		if(name.equals(p.place)) {
        			System.out.print(name+"\t");
        			distance += p.distance;
        			endPlace = p.localNum;
        		}
    		}
    	}
    	return distance;
    }

}

public class TourDeKorea2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] schedule = {"�ؿ��","��õȣ","������","������","������"};
		Place2 tt = new Place2(schedule);
	}

}

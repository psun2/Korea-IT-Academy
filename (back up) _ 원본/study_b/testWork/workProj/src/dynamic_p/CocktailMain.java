package dynamic_p;
//Ĭ������ ����� �ּ���
///  �Ҹ� ::>  2 : 8  (����Ұ�)  
///  ���� ::>  5 : 5  (���氡��)
///  �� ����, ����, ���̴�, �ݶ� ��뷮�� ����ϼ���  (���� cc ) 
//�� ��� ���� �հ跮
//ex) 
class CocktailMenu{
	final String name;
	final String [] title = {"����","����","���̴�","�ݶ�"};
	final double [] recipe;  //"����","����","���̴�","�ݶ�"
	final int size;
	public CocktailMenu(String name, int size, double ... recipe) {
		super();
		this.name = name;
		this.recipe = recipe;
		this.size = size;
	}
	
	void serving(int cnt,  double [] tot) {
		String ttt = name+" "+cnt+"��(";
		
		for (int i = 0; i < recipe.length; i++) {
			if(recipe[i]!=0) {
				int rr = (int)(cnt*recipe[i]*size);
				ttt+=title[i]+":"+rr+",";
				tot[i]+=rr;
			}
		}
		
		ttt+=") "+cnt*size;
		
		
		System.out.println(ttt);
	}
	
	
}
class Cocktail{
	final private String [] title = {"����","����","���̴�","�ݶ�"};
	final private double [] tot = new double [title.length];
	
	// : 5,(�ܴ�:)   : 2(�ܴ�:),  :3 (�ܴ�:)  :2  (�ܴ� ), :3 (�ܴ� )
	final private CocktailMenu [] menu = {
			
									//"����","����","���̴�","�ݶ�"
			new CocktailMenu("�Ҹ�",500 ,0.2,0.8,0,0 ),
			new CocktailMenu("����", 450, 0,0,0.5,0.5),
			new CocktailMenu("����", 50, 1,0,0,0),
			new CocktailMenu("����", 500, 0,1,0,0),
			new CocktailMenu("�ݶ�", 350, 0,0,0,1)
	};
	
	
	void setCC(double cider, double coke) {
		menu[1].recipe[2] = cider;
		menu[1].recipe[3] = coke;
	}
	
	
	
	
	void order(String name, int cnt) {
		int num = -1;
		
		for (int i = 0; i < menu.length; i++) {
			if(menu[i].name.equals(name)) {
				menu[i].serving(cnt, tot);
				num = i;
				break;
			}
		}
		
		if(num<0) {
			System.out.println("���� �޴��Դϴ�.");
			return;
		}
	}
	
	void ppp() {
		System.out.println("��ü>>>>>>>");
		
		for (int i = 0; i < tot.length; i++) {
			System.out.println(title[i]+":"+tot[i]);
		}
	}
	
	
}

public class CocktailMain {

	public static void main(String[] args) {
		Cocktail cock = new Cocktail();
		
		cock.order("�Ҹ�", 3);
		cock.order("����", 4);
		cock.order("����", 3);
		cock.order("����", 5);
		cock.setCC(0.7, 0.3);
		cock.order("�ݶ�", 1);
		cock.order("����", 3);
		cock.order("�Ҹ�", 3);
		cock.order("����", 4);
		cock.ppp();
	}

}

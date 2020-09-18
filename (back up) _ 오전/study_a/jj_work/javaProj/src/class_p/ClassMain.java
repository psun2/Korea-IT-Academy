package class_p;
class CCC implements ClassInter{

	int a = 1010;
	String b = "CCC.b 입니다.";
	
	
	public void execute() {
		System.out.println("CCC execute() 입니다.");
		
	}
}
public class ClassMain {

	public static void main(String[] args) {
		
		
		try {
			String cName = "class_p.CCC";
			//Class cla = new Class(null);
			Class cla = Class.forName(cName);
			ClassInter cc = (ClassInter)cla.newInstance();
//			System.out.println(cla);
//			System.out.println(cc.a);
//			System.out.println(cc.b);
			
			cc.execute();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

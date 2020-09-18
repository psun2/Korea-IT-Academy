package dynamic_p;

interface Resource{
	void get(String name);
}

interface Building{
	void build(String name);
	void repair(String name);
}

interface Unit{
	void repair(String name);
	void riding(String name);
}

interface SCVWork extends Resource,Building,Unit {
	
}

class ResourceImpl implements Resource{

	String name;

	public void get(String name) {
		System.out.println(this.name+" "+name+" ĳ��");
		
	}
}

class BuildingImpl extends ResourceImpl implements Building{

	

	public void repair(String name) {
		System.out.println(this.name+" "+name+" ���Ŀ�");
		
	}
	public void build(String name) {
		System.out.println(this.name+" "+name+" �����");	
	}
}



class UnitImpl extends BuildingImpl implements Unit{

	
	public void riding(String name) {
		System.out.println(this.name+" "+name+" Ÿ��");
	}
}



class SCV extends UnitImpl implements SCVWork{
	
	public SCV(String name) {
		super();
		this.name = name;
	}

}


public class ScvMain {

	public static void main(String[] args) {
		SCV scv1 = new SCV("3�� 1ȣ��");
		SCV scv2 = new SCV("3�� 2ȣ��");
		Resource rr;
		Building bb;
		Unit uu;
		
		rr = scv1;
		rr.get("�̳׶�");
		bb = scv2;
		bb.build("Ŀ�ǵ弾��");
		bb = scv1;
		bb.build("���丮");
		bb.repair("Ŀ�ǵ弾��");
		uu = scv2;
		uu.riding("�����ε�");
		uu.repair("��Ʈ�󸮽�ũ");
	}

}

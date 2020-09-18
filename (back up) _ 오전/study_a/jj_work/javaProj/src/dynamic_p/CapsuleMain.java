package dynamic_p;

import java.util.Arrays;

class CapAAA{
	private int abc;
	private String efg;
	private boolean hij;
	
	
	
	public CapAAA(int abc, String efg, boolean hij) {
		
		this.abc = abc;
		this.efg = efg;
		this.hij = hij;
	}
	public int getAbc() {
		return abc;
	}
	public String getEfg() {
		return efg;
	}
	public boolean isHij() {
		return hij;
	}
	
	
//	void setAbc(int abc) {
//		this.abc = abc;
//	}
//	int getAbc() {
//		return abc;
//	}
	
	
}


class CapStud{
	private String name;
	
	private int [] jum;
	private int tot, res;
	public CapStud(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.jum = new int[] {kor,  eng, mat};
		
		cal();
	}
	
	private void cal() {
		tot = 0;
		res = 0;
		double [] rate = {0.5,0.3,0.2};
		
		for (int i = 0; i < rate.length; i++) {
			tot += jum[i];
			res += jum[i]*rate[i];			
		}
	}
	public String getName() {
		return name;
	}
	/*
	public int[] getJum() {
		return jum;
	}
	*/
	public int getJum(int index) {
		return jum[index];
	}
	public int getTot() {
		return tot;
	}
	public int getRes() {
		return res;
	}
	
	public String getGrade() {
		return new String[] {
				"��","��","��","��","��","��","��","��","��","��","��"}[res/10];
	}
	
	
}


public class CapsuleMain {

	public static void main(String[] args) {
		CapStud st = new CapStud("������", 89,75,64);

		System.out.println("�̸�:"+st.getName());
		//int [] arr = st.getJum();
		//arr[1] = 10;
		//System.out.println("����:"+Arrays.toString(st.getJum()));
		System.out.println("����:"+st.getJum(0));
		System.out.println("����:"+st.getJum(1));
		System.out.println("����:"+st.getJum(2));
		System.out.println("����:"+st.getTot());
		System.out.println("����:"+st.getRes());
		System.out.println("���:"+st.getGrade());
	}

}

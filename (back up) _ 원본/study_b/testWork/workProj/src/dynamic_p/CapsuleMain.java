package dynamic_p;

import java.util.Arrays;

class ClaCap{
	
	
	
	public ClaCap(int abc, boolean ref) {
		super();
		this.abc = abc;
		this.ref = ref;
	}

	private int abc;
	
	private boolean ref;

	public int getAbc() {
		return abc;
	}

	public void setAbc(int abc) {
		this.abc = abc;
	}

	public boolean isRef() {
		return ref;
	}
	
	private int [] arr = {11,22,33,44};

	/*public int[] getArr() {
		return arr;
	}*/
	
	void pppArr() {
		System.out.println(Arrays.toString(arr));
	}
	
	public int getArr(int i) {
		return arr[i];
	}
	
	
}

class MovieReserve{
	private String id, name, tel;
	private int time, seat;
	public MovieReserve(String id, String name, String tel, int time, int seat) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.time = time;
		this.seat = seat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public int getTime() {
		return time;
	}
	public int getSeat() {
		return seat;
	}
	
	
}


public class CapsuleMain {

	public static void main(String[] args) {
		ClaCap cc = new ClaCap(100,true);
		
		System.out.println(cc.getAbc()+","+cc.isRef());
		
		cc.setAbc(1234);

		
		System.out.println(cc.getAbc()+","+cc.isRef());
		
		MovieReserve mr = new MovieReserve("aaa", "È«¼ºÇõ", "010-1111-1111", 10, 32);
		
		mr.setName("¾ÈÁ¤¹Î");
		mr.setTel("010-2222-2222");
		
		System.out.println(mr.getId());
		System.out.println(mr.getName());
		System.out.println(mr.getTel());
		System.out.println(mr.getSeat());
		System.out.println(mr.getTime());
		
		//System.out.println(Arrays.toString(cc.arr));

		//System.out.println(Arrays.toString(cc.getArr()));
		
		//cc.arr[1] = 2345;
		//cc.getArr()[1] = 2345;
		
		//System.out.println(Arrays.toString(cc.getArr()));
		
		cc.pppArr();
		
		System.out.println(cc.getArr(0));
		System.out.println(cc.getArr(1));
	}

}


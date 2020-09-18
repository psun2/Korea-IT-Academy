package dynamic_p_05_28;

import java.util.Arrays;

//탱크, SCV => attack (공격)
//커멘드센터, 팩토리, 스타포트 => create(유닛생산)
//SCV => 수리(repair), build(건물짓기), get(미네랄 캐기), getOn(탱크타기)

interface TankAndSCVFunction { // 탱크와 scv의 공통적 기능
	void attack(String name, int... su);
}

interface CreateUnit { // 건물들의 공통 기능
	void createUnit();
}

interface SCVFunction extends TankAndSCVFunction { // scv 기능
	void repair(String name, int... su); // 수리

	void getOn(String name, int... su); // 타다

	CommandCenter build(int su, String name) throws Exception; // 짓다

	void get(int... su); // 얻어오다

	String scvAction(int... su);
}

interface CommandCenterFunction extends CreateUnit { // 커맨드 센터 (건물의 유닛생산이라는 공통적인 기능을 extends 합니다.)

}

interface FactoryFunction extends CreateUnit { // 팩토리 (건물의 유닛생산이라는 공통적인 기능을 extends 합니다.)

}

interface StarportFunction extends CreateUnit { // 스타포트 (건물의 유닛생산이라는 공통적인 기능을 extends 합니다.)

}

class StarCraft {

	private static int mineral, gas;
	private static String[] basicScv = { "scv1", "scv2", "scv3", "scv4" }; // 시작시 scv는 4마리
	private static String[] bilding = { "CommandCenter1" };
	private static String[] factory = new String[0], starport = new String[0];
	private SCV2 scv;

	public StarCraft() {
		StarCraft.mineral = 0;
		StarCraft.gas = 0;
		this.scv = new SCV2();
	}

	public SCV2 getScv() {
		return scv;
	}

	public static int getMineral() {
		return mineral;
	}

	public static void setMineral(int mineral) {
		StarCraft.mineral += mineral;
	}

	public static int getGas() {
		return gas;
	}

	public static void setGas(int gas) {
		StarCraft.gas += gas;
	}

	public static String[] getBasicScv() {
		String[] scv = StarCraft.basicScv.clone();
		return scv;
	}

	public static void setBasicScv(String[] scv) {
		StarCraft.basicScv = scv;
	}

	public static String[] getBilding() {
		String[] bilding = StarCraft.bilding.clone();
		return bilding;
	}

	public static void setBilding(String[] bilding) {
		StarCraft.bilding = bilding;
	}

	public static String[] getFactory() {
		String[] factory = StarCraft.factory.clone();
		return factory;
	}

	public static void setFactory(String[] factory) {
		StarCraft.factory = factory;
	}

	public static String[] getStarport() {
		String[] starport = StarCraft.starport.clone();
		return starport;
	}

	public static void setStarport(String[] starport) {
		StarCraft.starport = starport;
	}

}

class SCV2 implements SCVFunction { // scv 클래스

	private final int mineral = 8, gas = 8;

	@Override
	public void attack(String name, int... su) {
		String result = scvAction(su);
		result += " 가 " + name + " 을 공격 합니다.";
		System.out.println(result);

	}

	@Override
	public void repair(String name, int... su) { // FIXME 건물마다 수리가격 다름
		String result = scvAction(su);
		result += " 가 " + name + " 을 수리합니다.";
		System.out.println(result);
		try {
			Thread.sleep(2000); // Thread.sleep 를 걸어주어 딜레이를 줍니다.
			System.out.println("건물 수리가 완료 되었습니다.");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	@Override
	public CommandCenter build(int su, String name) throws Exception { // 건물 짓기는 SCV 한개로만 됨. // 건물을 지을 scv 번호와 건물 이름을
																		// 인자로 받습니다.
		String result = StarCraft.getBasicScv()[su - 1] + "\t"; // 건물을 지을 scv
		int gas = StarCraft.getGas();
		int mineral = StarCraft.getMineral();
		if (name.equalsIgnoreCase("command")) {
			if (mineral >= 400) {
				System.out.println(result + " " + name + " 시공에 착수합니다.");
				try {
					Thread.sleep(3000); // Thread.sleep 를 걸어주어 딜레이를 줍니다.
					result += name + "\t 을 완공했습니다..";
					System.out.println(result);
					return new CommandCenter().init();
				} catch (Exception e) {
					System.out.println("error");
					throw e;
				}
			} else {
				System.out.println("해당 자원이 모자릅니다. 자원을 확인하세요.");
				return null;
			}

		} else if (name.equalsIgnoreCase("starport")) {
			if (mineral >= 150 && gas >= 150) {
				System.out.println(result + " " + name + " 시공에 착수합니다.");
				try {
					Thread.sleep(3000); // Thread.sleep 를 걸어주어 딜레이를 줍니다.
					result += name + "\t 을 완공했습니다..";
					System.out.println(result);
					return new Starport();
				} catch (Exception e) {
					System.out.println("error");
					throw e;
				}
			} else {
				System.out.println("해당 자원이 모자릅니다. 자원을 확인하세요.");
				return null;
			}

		} else if (name.equalsIgnoreCase("factory")) {

			if (mineral >= 200 && gas >= 100) {
				System.out.println(result + " " + name + " 시공에 착수합니다....");
				try {
					Thread.sleep(3000); // Thread.sleep 를 걸어주어 딜레이를 줍니다.
					result += name + "\t 을 완공했습니다.";
					System.out.println(result);
					return new Factory();
				} catch (Exception e) {
					System.out.println("error");
					throw e;
				}
			} else {
				System.out.println("해당 자원이 모자릅니다. 자원을 확인하세요.");
				return null;
			}

		} else {
			result = "해당 건물이 존재 하지 않습니다.";
			System.out.println(result);
			return null;
		}
	}

	@Override
	public void get(int... su) {
		String result = scvAction(su);
		if (result.equals("SCV가 존재 하지 않습니다."))
			return;
		result += " 미네랄과 가스의 채취를 시작 합니다.";
		System.out.println(result);
		try {
			Thread.sleep(1000);
			StarCraft.setMineral(this.mineral * su.length);
			StarCraft.setGas(this.gas * su.length);
			System.out.println("미네랄(" + this.mineral * su.length + ")과 가스(" + this.gas * su.length + ")를 채취 했습니다.");
			System.out.println("현재 자원상황 => 미네랄: " + StarCraft.getMineral() + ", 가스: " + StarCraft.getGas() + "입니다.");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	@Override
	public void getOn(String name, int... su) {
		String result = scvAction(su);
		result += " 가 " + name + " 에 탑승합니다.";
		System.out.println(result);
	}

	@Override
	public String scvAction(int... su) { // 공통된 작업을 scv action 이라는 메소드를 사용해 묶어줍니다.
		String result = "";
		String[] scv = StarCraft.getBasicScv();
		for (int i = 0; i < su.length; i++) {
			result += scv[su[i] - 1] + "\t";
		}
		return result;
	}

}

class CommandCenter implements CommandCenterFunction { // extends StarCraft

	private String name;

	public CommandCenter() {
		super();
		this.name = "CommandCenter";
	}

	CommandCenter init() {

//		String[] bildings = StarCraft.getBilding();
		String[] arrays = getArray();

		String[] temp = new String[arrays.length + 1];

		for (int i = 0; i < arrays.length; i++) {
			temp[i] = arrays[i];
		}

		temp[arrays.length] = name + (arrays.length + 1);

		arrays = temp;

		setArray(arrays);

		value();

		System.out.println("현재 자원상황 => 미네랄: " + StarCraft.getMineral() + ", 가스: " + StarCraft.getGas() + "입니다.");

		return this;
	}

	String[] getArray() {

		return StarCraft.getBilding();
	}

	void setArray(String[] arrays) {
		StarCraft.setBilding(arrays);
	}

	void value() {

		StarCraft.setMineral(-400);
	}

	@Override
	public void createUnit() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Factory extends CommandCenter implements FactoryFunction {

	public Factory() {
		setName("Factory");
		init();
	}

	String[] getArray() {

		return StarCraft.getFactory();
	}

	void setArray(String[] arrays) {
		StarCraft.setFactory(arrays);
	}

	void value() {

		StarCraft.setMineral(-200);
		StarCraft.setGas(-100);
	}

	@Override
	public void createUnit() {
		// TODO Auto-generated method stub

	}

}

class Starport extends CommandCenter implements StarportFunction {

	public Starport() {
		setName("Starport");
		init();
	}

	String[] getArray() {

		return StarCraft.getStarport();
	}

	void setArray(String[] arrays) {
		StarCraft.setStarport(arrays);
	}

	void value() {

		StarCraft.setMineral(-150);
		StarCraft.setGas(-100);
	}

	@Override
	public void createUnit() {
		// TODO Auto-generated method stub

	}

}

public class StarCraftMain {

	public static void main(String[] args) throws Exception {

		/*
		 * /스타크래프트를 구현하세요
		 * 
		 * scv-4 기를 이용하여 작업
		 * 
		 * 커맨드센터:미네랄 400
		 * 
		 * 팩토리:미네랄 200,가스 100
		 * 
		 * 스타포트:미네랄 150,가스 100
		 * 
		 * scv 1 회 획득량 미네랄:8,가스:8
		 * 
		 * 커맨드 센터 --2 짓기
		 * 
		 * 스타포트-1 짓기 1 수리 => 수리? 미네랄?
		 * 
		 * 팩토리-2 짓기
		 * 
		 * 미네랄-500
		 * 
		 * 탱크-2대 수리 => 수리? 미네랄?
		 * 
		 * 탱크 타기 -3
		 * 
		 * 저그 공격 : 5마리
		 * 
		 * 고쳐주세요
		 * 
		 * 각 작업간 log 기록을 남기고
		 * 
		 * 각 scv 의 작업결과와 전체 상황 log를 기록하세요
		 */

		StarCraft sc = new StarCraft(); // 게임 시작

		SCV2 scv = sc.getScv(); // scv 조작 시작

		for (int i = 0; i < 56; i++) {
			scv.get(1, 2, 4); // 1,2,4 번 scv start 3 번 scv 정찰 보냄.
		}

		System.out.println(StarCraft.getMineral());

		scv.get(1, 2, 3, 4); // 1,2,3,4 번 scv 자원 채취

		System.out.println(StarCraft.getMineral());

		scv.build(1, "command"); // 1번 scv 가 커멘드 센터를 짓습니다.

		scv.build(3, "command"); // 3번 scv 가 커멘드 센터를 짓습니다.

		scv.get(2, 4); // 2, 4 번 scv 자원 채취

		scv.build(2, "Starport"); // 2번 scv 가 스타포트를 짓습니다.

		scv.build(4, "Factory"); // 4번 scv 가 팩토리를 짓습니다.

		scv.get(1, 3); // 1, 3 번 scv 자원 채취

		scv.repair("Starport", 2, 4); // 2, 4 번 scv가 Starport 를 수리합니다.

		scv.getOn("탱크", 1, 3); // scv1, 3 탱크 탑승

		scv.attack("저글링", 1, 2, 3, 4);

		System.out.println(StarCraft.getMineral() + ", " + StarCraft.getGas());
		System.out.println(Arrays.deepToString(StarCraft.getBilding()));
		System.out.println(Arrays.deepToString(StarCraft.getFactory()));
		System.out.println(Arrays.deepToString(StarCraft.getStarport()));
		System.out.println(Arrays.deepToString(StarCraft.getBasicScv()));
	}

}

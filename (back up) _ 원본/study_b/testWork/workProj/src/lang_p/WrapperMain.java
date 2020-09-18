package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
		//int i = "123456";
		
		int i = Integer.parseInt("123456");
		
		Integer ii = new Integer(123);
		int iii = ii.intValue();
		Integer iv = 123;
		System.out.println(i+100);
		System.out.println(ii);
		System.out.println(iii);
		System.out.println(iv);
		
		byte bb = Byte.parseByte("123");
		short sh = Short.parseShort("123");
		long ll = Long.parseLong("123");
		
		float ff = Float.parseFloat("123.456");
		double dd = Double.parseDouble("123.456");
		
		boolean bo = Boolean.parseBoolean("true");
		//char ch = Character.parseCharater("a");
		
		System.out.println("bb:"+bb);
		System.out.println("sh:"+sh);
		System.out.println("ll:"+ll);
		
		System.out.println("ff:"+ff);
		System.out.println("dd:"+dd);
		
		System.out.println("bo:"+bo);
		
		System.out.println(Integer.bitCount(4)); //100
		System.out.println(Integer.bitCount(5)); //101
		System.out.println(Integer.bitCount(6)); //110
		System.out.println(Integer.bitCount(7)); //111
		
		ii = 12;
		System.out.println(ii.intValue()+100);
		System.out.println(ii.toString()+100);
		System.out.println(Integer.toBinaryString(12)+99);
		System.out.println(Integer.toOctalString(12)+99);
		System.out.println(Integer.toHexString(12)+99);
	}

}

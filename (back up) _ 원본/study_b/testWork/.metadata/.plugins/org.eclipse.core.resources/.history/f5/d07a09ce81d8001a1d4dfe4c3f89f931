package lang_p;

import java.util.Arrays;

class TelePerson{
	String name;
	TeleCom.PhoneParis tel;
	public TelePerson(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return  name + ":" + tel;
	}
	
	
}

class TeleCom{
	String name;
	
	TelePerson [] pers = new TelePerson[0];
	PhoneParis [] pp = new PhoneParis[0];
	
	public TeleCom(String name) {
		super();
		this.name = name;
	}

	
	
	void repair(TelePerson per) {
		
	}
	
	TelePerson [] perAdd(TelePerson [] arr, TelePerson ps) {
		TelePerson [] buf = new TelePerson[arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			buf[i] = arr[i];
		}
		buf[arr.length] = ps;
		return buf;
	}
	
	void perList() {
		System.out.println(name+" °í°´¸í´Ü >>>>>");
		
		for (TelePerson telePerson : pers) {
			System.out.println(telePerson);
		}
	}
	
	
	class PhoneParis{
		String name;

		public PhoneParis(String name) {
			super();
			this.name = name;
		}

		TelePerson [] pers = new TelePerson[0];
		
		void sale(TelePerson per) {
			String ttt = TeleCom.this.name+" "+name+"Á¡ "+per.name+" ¿¡°Ô ÇÚµåÆù ÆÈ¾Æ¿ä";
			per.tel = this;
			
			pers = perAdd(pers, per);
			TeleCom.this.pers = perAdd(TeleCom.this.pers, per);
			
			System.out.println(ttt);
		}

		@Override
		public String toString() {
			return "["+ TeleCom.this.name+" " + name+"]";
		}
		
		void perList() {
			System.out.println(TeleCom.this.name+" " + name+" °í°´¸í´Ü >>>>>");
			
			for (TelePerson telePerson : pers) {
				System.out.println(telePerson);
			}
		}
		
		
	}
}




public class InnerPhoneMain {

	public static void main(String[] args) {
		TeleCom sk = new TeleCom("sk");
		TeleCom kt = new TeleCom("kt");
		
		TeleCom.PhoneParis sk_1 = sk.new PhoneParis("°­³²");
		TeleCom.PhoneParis sk_2 = sk.new PhoneParis("¼­ÃÊ");
		TeleCom.PhoneParis sk_3 = sk.new PhoneParis("¿ª»ï");
		
		TeleCom.PhoneParis kt_1 = kt.new PhoneParis("°­³²");
		TeleCom.PhoneParis kt_2 = kt.new PhoneParis("µ¿´ë¹®");
		
		TelePerson [] pers = {
				new TelePerson("ÀÌÈ£ÀÎ"),
				new TelePerson("±è¿µÀç"),
				new TelePerson("¹Ú¼º¾ð"),
				new TelePerson("±èÈÖÁø"),
				new TelePerson("±èÁö¹Î"),
				new TelePerson("±è¿¬Áö"),
				new TelePerson("¾ÈÁ¤¹Î"),
				new TelePerson("È«¼ºÇõ"),
				new TelePerson("¹Ú½ÃÇö"),
				new TelePerson("ÀÌÁÖÇõ"),
				new TelePerson("±è¿¬¼·"),
				new TelePerson("±èÇöÁØ"),
				new TelePerson("¿À¹Î¼®"),
				new TelePerson("±è¿¹¼Ö")
		};
		
		sk_1.sale(pers[0]);
		sk_2.sale(pers[1]);
		kt_1.sale(pers[2]);
		sk_3.sale(pers[6]);
		sk_2.sale(pers[4]);
		kt_1.sale(pers[1]);
		kt_2.sale(pers[5]);
		sk_1.sale(pers[7]);
		kt_1.sale(pers[9]);
		System.out.println(pers[0]);
		
		sk_1.perList();
		sk.perList();

	}

}

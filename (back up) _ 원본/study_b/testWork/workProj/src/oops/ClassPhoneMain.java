package oops;

class ClassPhone{
	String name, cam;
	int price;
	
	void call() {
		System.out.println("ÀüÈ­ÇØ¿ä");
	}
	void game() {
		System.out.println("°ÔÀÓÇØ¿ä");
	}
	void photo() {
		System.out.println("»çÁøÀ» Âï¾î¿ä");
	}
	
}
/// ÇÐ¹ø, ÀÌ¸§, ¹Ý, ÀüÈ­¹øÈ£,  Á¡¼ö [±¹¾î, ¿µ¾î, ¼öÇÐ], ÃÑÁ¡, Æò±Õ
class ClaStud{
	String name, tel;
	
	int no, ban, tot, avg, rank;
	
	int [] jum;
	
}


public class ClassPhoneMain {

	public static void main(String[] args) {

		ClassPhone  gall = new ClassPhone();
		ClassPhone  iphone = new ClassPhone();
		ClassPhone  lg = new ClassPhone();
		
		gall.name = "s20";
		gall.cam = "100¹èÁÜ";
		gall.price = 160;
		
		iphone.name = "¾î¸¥Æù";
		iphone.cam = "¾ÈÁÜ";
		iphone.price = 100;
		
		lg.name = "º§ºª";
		lg.cam = "Àü¹æ";
		lg.price = 80;
		
		//System.out.println("gall : "+gall.name+","+gall.cam+","+gall.price);
		//System.out.println("iphone : "+iphone.name+","+iphone.cam+","+iphone.price);
		//System.out.println("lg : "+lg.name+","+lg.cam+","+lg.price);
		
//		ClassPhone myphone = gall;		
//		System.out.println("myphone : "+myphone.name+","+myphone.cam+","+myphone.price);
//		myphone.call();
//		myphone.game();
//		myphone.photo();
//		myphone = iphone;
//		System.out.println("myphone : "+myphone.name+","+myphone.cam+","+myphone.price);
//		
//		myphone = lg;
//		System.out.println("myphone : "+myphone.name+","+myphone.cam+","+myphone.price);
		
		
		ClassPhone  [] arr = {gall,iphone,lg };
		
		for (int i = 0; i < arr.length; i++) {
			String ttt = "arr["+i+"]: "+arr[i].name+","+arr[i].cam+","+arr[i].price;
			System.out.println(ttt);
			arr[i].call();
			arr[i].game();
			arr[i].photo();
		}
		
		
		ClaStud [] st = new ClaStud[5];
		
		for (int i = 0; i < st.length; i++) {
			st[i] = new ClaStud();
			//ClaStud stud = st[i];
		}
		st[0].ban = 2;
		st[0].no = 3;
		st[0].name = "Çöºó";
		st[0].tel = "1111-1111";
		st[0].jum = new int[]{77,78,71};
		
		st[1].ban = 1;
		st[1].no = 2;
		st[1].name = "¿øºó";
		st[1].tel = "2222-2222";
		st[1].jum = new int[]{67,68,61};
		
		st[2].ban = 1;
		st[2].no = 1;
		st[2].name = "°ñºó";
		st[2].tel = "3333-3333";
		st[2].jum = new int[]{97,98,91};
		
		
		st[3].ban = 2;
		st[3].no = 2;
		st[3].name = "ÀåÈñºó";
		st[3].tel = "4444-4444";
		st[3].jum = new int[]{57,58,51};
		
		
		st[4].ban = 2;
		st[4].no = 4;
		st[4].name = "Á©¸®ºó";
		st[4].tel = "5555-5555";
		st[4].jum = new int[]{87,88,81};
		
		for (ClaStud stud : st) {
			
			for (int j : stud.jum) {
				stud.tot += j;
			}
			stud.avg = stud.tot/stud.jum.length;
		}
		
		for (ClaStud me : st) {
			me.rank=1;
			for (ClaStud you : st) {
				if(me.avg <you.avg )
					me.rank++;
			}	
		}
		
		for (int r = 1; r <= st.length; r++) {
			for (ClaStud stud : st) {
				if(r==stud.rank) {
					String ttt = 
							stud.ban+"\t"+
							stud.no+"\t"+
							stud.name+"\t"+
							stud.tel+"\t";
					
					for (int j : stud.jum) {
						ttt += j+"\t";
					}
					ttt += stud.tot+"\t"+
							stud.avg+"\t"+
							stud.rank;
					System.out.println(ttt);
					break;
				}
			}
		}
		
		
		
	}

}

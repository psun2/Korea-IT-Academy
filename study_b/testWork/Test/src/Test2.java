import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class Inspect {

	HashMap<String, ArrayList<String>> map;

	public Inspect() {
		// TODO Auto-generated constructor stub
		init();
	}

	void init() {

		this.map = new HashMap<String, ArrayList<String>>();

		String[] arr = { "doc", "txt", "hwp" };

		ArrayList<String> document = new ArrayList<String>();

		for (String str : arr) {
			document.add(str);
		}

		map.put("문서파일", document);

		ArrayList<String> ect = new ArrayList<String>();
		ect.add("jpg");

		map.put("기타파일", ect);

	}

	String chk(String file) {

		String temp = file.toLowerCase();
		int index = temp.lastIndexOf(".");
		String fileName = temp.substring(0, index);
		String extender = temp.substring(index + 1);
		String result = "undefined";

		for (Entry<String, ArrayList<String>> en : map.entrySet()) {

			for (String str : en.getValue()) {
				if (extender.equals(str)) {
					result = en.getKey();
				}
			}

		}

		String ttt = "파일명 : " + fileName + ", " + "확장자 : " + extender + ", " + "종류 : " + result;

		return ttt;

	}

}

public class Test2 {

	public static void main(String[] args) {

		Inspect is = new Inspect();

		while (true) {
			System.out.println("종료 : 0");
			System.out.print("파일명 입력 : ");
			Scanner sc = new Scanner(System.in);

			String file = sc.nextLine();

			if (file.equals("0"))
				break;

			System.out.println(is.chk(file) + "\n");
		}
	}

}

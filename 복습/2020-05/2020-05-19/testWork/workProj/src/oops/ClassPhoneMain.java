package oops;

import java.util.Arrays;

class ClassPhone {
	String name, cam;
	int price;

	void call() {
		System.out.println("전화를 해요");
	}

	void game() {
		System.out.println("게임을 해요");
	}

	void photo() {
		System.out.println("사진을 찍어요");
	}

}

public class ClassPhoneMain {

	public static void main(String[] args) {

		ClassPhone gall = new ClassPhone(); // 인스턴스 생성: 구조화 된 자료를 실체화 하는 과정 ?
		// 자료형: ClassPhone 변수명: gall = 생성자: new 자료형: ClassPhone()
		ClassPhone iphone = new ClassPhone(); // 인스턴스 생성: 구조화 된 자료를 실체화 하는 과정 ?
		ClassPhone lg = new ClassPhone(); // 인스턴스 생성: 구조화 된 자료를 실체화 하는 과정 ?

		gall.name = "s20";
		gall.cam = "100배줌";
		gall.price = 160;

		iphone.name = "어른폰";
		iphone.cam = "안줌";
		iphone.price = 100;

		lg.name = "벨벳";
		lg.cam = "전방";
		lg.price = 80;

		System.out.println("gall : " + gall.name + "," + gall.cam + "," + gall.price);
		System.out.println("iphone : " + iphone.name + "," + iphone.cam + "," + iphone.price);
		System.out.println("lg : " + lg.name + "," + lg.cam + "," + lg.price);

		ClassPhone myPhone = gall; // 배열과 마찬가지로 주소 개념으로 주소를 참조 하는 것이지 복사가 아닙니다.
		System.out.println("gall 의주소: " + gall + ", " + "myPhone 의주소: " + myPhone);
		int[] arr1 = new int[] { 10, 20, 30 };
		int[] arr2;
		arr2 = arr1;
		int[] arr3 = arr1;
		System.out.println("arr1 의주소: " + arr1 + ", " + "arr2 의주소: " + arr2 + ", " + "arr3 의주소: " + arr3);
		int[] arr4 = arr1.clone(); // clone() 함수는 배열을 참조하는 것이 아닌 값을 복제해 heap 공간에 새로운 배열의 주소를 생성합니다.
		System.out.println("arr1 의주소: " + arr1 + ", " + "arr2 의주소: " + arr2 + ", " + "arr3 의주소: " + arr3 + ", "
				+ "arr4 의주소: " + arr4);

		ClassPhone[] classArr = { gall, iphone, lg };
		// 같은 자료형이므로 배열에 담을수가 있고 그 배열의 자료형 또한 클래스 입니다.
		for (ClassPhone value : classArr) {
			String ttt = value.name + "," + value.cam + "," + value.price;
			System.out.println(ttt);
		}

		// forEach 로 인스턴스 생성이 안되는 이유 ✔✔

		ClassPhone[] classArr2 = new ClassPhone[10];
		// ClassPhone의 자료형인 길이가 10인 배열을 생성합니다.

		System.out.println("Arrays.toString(classArr2): " + Arrays.toString(classArr2));

		for (ClassPhone value : classArr2) {
			System.out.println("forEach: " + value); // null
			value = new ClassPhone();
			System.out.println("forEach: " + value);
			value.name = "park";
		}

		System.out.println("forEach로 인스턴스 생성후 Arrays.toString(classArr2): " + Arrays.toString(classArr2));
//		System.out.println(classArr2[0].name);
//		classArr2[0].name = "park";
//		System.out.println(classArr2[0].name);

		for (int i = 0; i < classArr2.length; i++) {
			System.out.println("for: " + classArr2[i]);
			classArr2[i] = new ClassPhone();
			System.out.println("for: " + classArr2[i]);
		}

		System.out.println("for로 인스턴스 생성후 Arrays.toString(classArr2): " + Arrays.toString(classArr2));
		System.out.println(classArr2[0].name);
		classArr2[0].name = "park";
		System.out.println(classArr2[0].name);

		// 결론 ✔
//		int a = (Integer) null;
//		
//		a = 10;
//		
//		System.out.println(a); // error

//		위와 같이 null 에 무엇인가를 대입하려 할때 error가 발생합니다.

//		null = 존재 하지 않다
//		존재 하지 않은 것에 무엇인가를 대입하려 할때 error 이 발생합니다.

//		forEach 의 그림
//		┌────────────┐────┐────┐
//		│value = null│null│null│
//		└────────────┘────┘────┘
//		forEach 는 value 라는 내가 설정해놓은 임시 변수에 값을 복사해 오는 것 이기 때문에
//		직접적으로 인덱스의 값을 건드리는 것은 불가능 합니다.
//		반면 for 문은

//		for 의 그림
//		┌────┐────┐────┐
//		│null│null│null│
//		└────┘────┘────┘
//		│  0 │  1 │  2 │
//		└────┘────┘────┘
//		index의 번호를 가져와 직접적으로 접근이 가능하기때문에 값의 교체가 가능합니다.

		System.out.println(Arrays.toString(arr1));
		for (int i : arr1) {
			i = 10;
//			여기서 i 는 arr1 을 0번 index부터 1씩 증가하여,
//			순차적으로 순회 하면서 값을 참조하여 잠깐 가지고 있는
//			임시 변수(?) 의 역활이라고 할 수 있습니다.
//			그렇기 때문에 i 에 직접적으로 수를 대입하면
//			내부적으론 사용이 가능 하지만 외부에서 원본배열을
//			확인시 값이 바뀌지 않습니다.
		}
		System.out.println(Arrays.toString(arr1));

		System.out.println("for로 인스턴스 생성후 Arrays.toString(classArr2): " + Arrays.toString(classArr2));

		for (ClassPhone classPhone : classArr2) {
			classPhone.name = "fuck";
		}

		System.out.println("for로 인스턴스 생성후 Arrays.toString(classArr2): " + Arrays.toString(classArr2));

		System.out.println(classArr2[0].name);

		System.out.println("결론: forEach 는 원본배열을 참조만 하기 때문에 원본 배열을 바꿀수 없다.");
	}

}

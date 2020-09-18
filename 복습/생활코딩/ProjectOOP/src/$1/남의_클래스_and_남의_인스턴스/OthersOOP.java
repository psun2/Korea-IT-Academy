package $1.남의_클래스_and_남의_인스턴스;

import java.io.FileWriter; // 클래스 사용을 위한 클래스 import
import java.io.IOException; // 예외처리 import

public class OthersOOP {

	public static void main(String[] args) throws IOException { // 예외처리
		// 질문1. 아래 코드에서 클래스와 인스턴스는 각각 무엇이 있는가 ? => 답변은 제일 아래

//		Math => 수학과 관련된 class 
		System.out.println(Math.PI); // 3.141592653589793
//		Math 라는 클래스에 PI 라는 변수가 있고, 그 PI 의 값은 3.141592653589793 입니다.

		System.out.println(Math.floor(1.8)); // 1.0
//		floor 은 바닥이라는 의미를 가지고 있으며 수학적의미로 내림이라는 의미를 가지고 있습니다.
//		Math 클래스의 floor 메소드 입니다.

		System.out.println(Math.ceil(1.8)); // 2.0
//		floor 은 천장이라는 의미를 가지고 있으며 수학적의미로 올림이라는 의미를 가지고 있습니다.
//		Math 클래스의 floor 메소드 입니다.

//		연관된 기능, 종류들을 모아놓은 껍데기가 class 라는 것 입니다.

		FileWriter f1 = new FileWriter("data.txt"); // 클래스의 인스턴스 생성
		f1.write("Hello");
		f1.write(" Java");
		// project 폴더 우클릭후 refresh 를 하면 위의 명령과 같이 data.txt 파일이 생기고,
		// 내부 내용으로는 Hello Java 내욜을 가지고 있습니다.

		FileWriter f2 = new FileWriter("data2.txt"); // 클래스의 인스턴스 생성
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();

		f1.write("!!!!");
		f1.close();

	}

}

// class : System, Math, FileWriter
// instance : f1, f2
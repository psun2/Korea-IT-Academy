package util_p;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.io.File;

public class Registry {
	public static void main(String[] args) throws Exception {

		String[] index = { "id", "pw", "pw확인", "성명", "이메일", "전화번호", "핸드폰", "주민번호", "사진첨부", "우편번호검색" };

		String[][] dis = { { "성동구", "100-010" }, { "중랑구", "200-010" }, { "노원구", "300-010" }, { "송파구", "400-010" } };

		String dd = "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ", ss = "가나다라마바사아자차카타파하", ee = "깋닣딯맇밓빟싷잏짛칳킿팋핗힣";
		Scanner sc = new Scanner(new File("fff/qqq.csv"));
		String pwChk = "";

		String[][] chk = { { "id", "[a-zA-Z]+[0-9a-zA-Z]*", "쓸 수 없는 id" }, { "성명", "[가-힣]+", "유효하지 않은 이름" },
				{ "이메일", "[0-9a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+", "유효하지 않은 이메일 주소" },
				{ "핸드폰", "[0-9]{3}-[0-9]{4}-[0-9]{4}", "유효하지 않은 핸드폰번호" },
				{ "전화번호", "[0-9]{2,3}-[0-9]{3}-[0-9]{4}", "유효하지 않은 전화번호" },
				{ "주민번호", "[0-9]{6}-[0-9]{7}", "유효하지 않은 주민번호" },
				{ "사진첨부", "[0-9a-z]+[.](jpg|bmp|jpeg|png|gif)", "유효하지 않은 파일이름 또는 확장자" }
				// {"pw확인",pwChk,"비밀번호 불일치"}pwChk의 주소가 아니라 값이라 안되는듯합니다
		};

		A: while (sc.hasNextLine()) { // 전체
			int cnt = 0;
			String input = "";
			input = sc.nextLine();
			StringTokenizer stk = new StringTokenizer(input, ",");

			B: while (stk.hasMoreTokens()) { // 유저한명
				try {
					String buf = stk.nextToken();

					if (index[cnt].equals("pw")) {
						pwChk = buf;
					}

					if (index[cnt].equals("pw확인") && !pwChk.equals(buf)) {
						throw new Exception("pw 불일치" + " : " + buf);
					}

					for (String[] c : chk) {
						String chkTmp = index[cnt].equals("사진첨부") ? buf.toLowerCase() : buf; // 파일,확장자명 대소문자 상관없이
						if (index[cnt].equals(c[0]) && !Pattern.matches(c[1], chkTmp)) {
							throw new Exception(c[2] + " : " + buf);
						}
					}

					if (index[cnt].equals("우편번호검색")) {
						boolean find = false;
						String pp = "";
						for (int i1 = 0; i1 < buf.length(); i1++) {
							int num = dd.indexOf("" + buf.charAt(i1));
							if (num == -1) {
								pp += "[" + buf.charAt(i1) + "]";
							} else {
								pp += "[" + buf.charAt(i1) + "|" + ss.charAt(num) + "-" + ee.charAt(num) + "]";
							}
						}

						for (String[] str : dis) {
							if (Pattern.matches(pp, str[0])) {
								find = true;
								buf += " ==> " + str[0] + " " + str[1];
							}
						}
						if (!find) {
							throw new Exception("없는 지역구" + " : " + buf);
						}
					}
					System.out.println(index[cnt] + " : " + buf);
					cnt++;

				} catch (Exception e) {

					// TODO: handle exception
					System.out.println("회원가입 실패 ==> " + e.getMessage());
					cnt = 0;
					break B;
				}
			}
			System.out.println();
		}

	}
}

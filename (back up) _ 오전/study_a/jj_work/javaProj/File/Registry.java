package util_p;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.io.File;

public class Registry {
	public static void main(String[] args) throws Exception {

		String[] index = { "id", "pw", "pwȮ��", "����", "�̸���", "��ȭ��ȣ", "�ڵ���", "�ֹι�ȣ", "����÷��", "�����ȣ�˻�" };

		String[][] dis = { { "������", "100-010" }, { "�߶���", "200-010" }, { "�����", "300-010" }, { "���ı�", "400-010" } };

		String dd = "����������������������������", ss = "�����ٶ󸶹ٻ������īŸ����", ee = "�����L���J����磠���i�M���R";
		Scanner sc = new Scanner(new File("fff/qqq.csv"));
		String pwChk = "";

		String[][] chk = { { "id", "[a-zA-Z]+[0-9a-zA-Z]*", "�� �� ���� id" }, { "����", "[��-�R]+", "��ȿ���� ���� �̸�" },
				{ "�̸���", "[0-9a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+", "��ȿ���� ���� �̸��� �ּ�" },
				{ "�ڵ���", "[0-9]{3}-[0-9]{4}-[0-9]{4}", "��ȿ���� ���� �ڵ�����ȣ" },
				{ "��ȭ��ȣ", "[0-9]{2,3}-[0-9]{3}-[0-9]{4}", "��ȿ���� ���� ��ȭ��ȣ" },
				{ "�ֹι�ȣ", "[0-9]{6}-[0-9]{7}", "��ȿ���� ���� �ֹι�ȣ" },
				{ "����÷��", "[0-9a-z]+[.](jpg|bmp|jpeg|png|gif)", "��ȿ���� ���� �����̸� �Ǵ� Ȯ����" }
				// {"pwȮ��",pwChk,"��й�ȣ ����ġ"}pwChk�� �ּҰ� �ƴ϶� ���̶� �ȵǴµ��մϴ�
		};

		A: while (sc.hasNextLine()) { // ��ü
			int cnt = 0;
			String input = "";
			input = sc.nextLine();
			StringTokenizer stk = new StringTokenizer(input, ",");

			B: while (stk.hasMoreTokens()) { // �����Ѹ�
				try {
					String buf = stk.nextToken();

					if (index[cnt].equals("pw")) {
						pwChk = buf;
					}

					if (index[cnt].equals("pwȮ��") && !pwChk.equals(buf)) {
						throw new Exception("pw ����ġ" + " : " + buf);
					}

					for (String[] c : chk) {
						String chkTmp = index[cnt].equals("����÷��") ? buf.toLowerCase() : buf; // ����,Ȯ���ڸ� ��ҹ��� �������
						if (index[cnt].equals(c[0]) && !Pattern.matches(c[1], chkTmp)) {
							throw new Exception(c[2] + " : " + buf);
						}
					}

					if (index[cnt].equals("�����ȣ�˻�")) {
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
							throw new Exception("���� ������" + " : " + buf);
						}
					}
					System.out.println(index[cnt] + " : " + buf);
					cnt++;

				} catch (Exception e) {

					// TODO: handle exception
					System.out.println("ȸ������ ���� ==> " + e.getMessage());
					cnt = 0;
					break B;
				}
			}
			System.out.println();
		}

	}
}

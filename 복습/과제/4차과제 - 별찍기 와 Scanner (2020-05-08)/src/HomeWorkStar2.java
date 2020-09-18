//		TODO 그림을 자르고, 공백이 없다고 생각하고 생각하시면 조금더 쉽게 접근이 가능 합니다.

public class HomeWorkStar2 {

	public static void main(String[] args) {

		System.out.println("=================");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

//		세로 = i 값
//		가로 = j 값					

//		0	★						i = 0	|	j = 0				
//		1	★	★					i = 1	|	j = 0, 1
//		2	★	★	★				i = 2	|	j = 0, 1, 2
//		3	★	★	★	★			i = 3	|	j = 0, 1, 2, 3
//		4	★	★	★	★	★		i = 4	|	j = 0, 1, 2, 3, 4

//			0	1	2	3	4

//		j = 0 부터 시작해서 , i = 0 일때, j = 0에 점이 하나 찍힌다.
//		j 가 0 일때 i 는 늘어나서 반복되어 들어 오기 때문에 j <= i 가 1씩 늘어남에 따라 찍을수 있는 갯수가 늘어난다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		for (int i = 0; i < 5; i++) {
//			for (int j = 5; j > i; j--) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

//		세로 = i 값
//		가로 = j 값					

//		0	★	★	★	★	★		i = 0	|	j = 0, 1, 2, 3, 4				
//		1	★	★	★	★			i = 1	|	j = 0, 1, 2, 3
//		2	★	★	★				i = 2	|	j = 0, 1, 2
//		3	★	★					i = 3	|	j = 0, 1
//		4	★						i = 4	|	j = 0

//			0	1	2	3	4

//		i 가 늘어남에 따라 j 반복이 줄어든다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 4; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
//			for (int k = 4; k <= i + 4; k++) {
			for (int k = 0; k <= i; k++) {
				System.out.print("★");
			}
			System.out.println();
		}

//		세로 = i 값
//		흰색별 = j 값
//		검정별 = k 값

//		0	☆	☆	☆	☆	★		i = 0	|	j = 0, 1, 2, 3	|	k = 			4 	
//		1	☆	☆	☆	★	★		i = 1	|	j = 0, 1, 2		|	k = 		 3, 4
//		2	☆	☆	★	★	★		i = 2	|	j = 0, 1		|	k = 	  2, 3, 4
//		3	☆	★	★	★	★		i = 3	|	j = 0			|	k =    1, 2, 3, 4
//		4	★	★	★	★	★		i = 4	|	j = 종료			|	k = 0, 1, 2, 3, 4

//			0	1	2	3	4

//		i 는 0 부터 5 행을 출력하기 위해 초기값을 0으로 주고 5미만의 값으로 반복을 합니다.
//		j 는 4, 3, 2, 1 순으로 반복 출력 됩니다. 즉 i 가 1일때 j는 네번 출력되고 i 가 늘어남에 따라 j가 1씩 줄면서 출력됩니다.
//		i 가 늘고 j 가 줄어드는 상황으로써, j = i  가 되어서 같이 늘어나고 j 를 4까지 반복시키면 위와 같이 공백이 출력됩니다.
//		k 는 i 가 1 씩 증가 할때마다 k도 1씩 증가 함으로써, 시작을 4로 하고 반복의 제한을 1, 2, 3, 4 ..늘려가는 알고리즘을
//		걸어 줍니다. k가 i 만큼 반복해야 하기때문에 k의 초기값을 0을 설정후 i와 같거나 작을때만 박복시켜줍니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("★");
			}
			for (int k = i; k < 4; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

//		세로 = i 값
//		흰색별 = j 값
//		검정별 = k 값

//			k	→	→	→	→	
//				0	1	2	3
//	i
//	↓	0	★	☆	☆	☆	☆		i = 0	|	j = 0				|	k = 0, 1, 2, 3, 4 	
//	↓	1	★	★	☆	☆	☆		i = 1	|	j = 0, 1			|	k =    0, 1, 3, 4
//	↓	2	★	★	★	☆	☆		i = 2	|	j = 0, 1, 2			|	k =       0, 1, 2
//	↓	3	★	★	★	★	☆		i = 3	|	j = 0, 1, 2, 3		|	k =	         0, 1
//	↓	4	★	★	★	★	★		i = 4	|	j = 0, 1, 2, 3, 4	|	k =             0

//			0	1	2	3	4
//		j	→	→	→	→	→

//		j = 0 부터 시작해서 , i = 0 일때, j = 0에 점이 하나 찍힌다.
//		j 가 0 일때 i 는 늘어나서 반복되어 들어 오기 때문에 j <= i 가 1씩 늘어남에 따라 찍을수 있는 갯수가 늘어난다.
//		k 는 i가 1일때 4번 찍히고 i 가 1씩 늘어날때 k의 반복 횟수가 1씩 줄어들게 됩니다. k 의 반복 횟수를 4로 했을때 
//		k = i 가되면 1씩 줄어들면서 출력하게 됩니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("★");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

//		세로 = i 값
//		흰색별 = j 값
//		검정별 = k 값

//			k	→	→	→	→	
//				0	1	2	3
//	i
//	↓	0	★	★	★	★	★		i = 0	|	j = 0, 1, 2, 3, 4 	|	k = 종료 	
//	↓	1	★	★	★	★	☆		i = 1	|	j = 0, 1, 2, 3		|	k =             0
//	↓	2	★	★	★	☆	☆		i = 2	|	j = 0, 1, 2			|	k =          0, 1
//	↓	3	★	★	☆	☆	☆		i = 3	|	j = 0, 1			|	k =	   0, 1, 2, 3
//	↓	4	★	☆	☆	☆	☆		i = 4	|	j = 0				|	k = 0, 1, 2, 3, 4

//			0	1	2	3	4
//		j	→	→	→	→	→

//		j = i이면 j 와 i 가 1씩 증가하고 조건을 4 미만으로 지정해놓으면 시작값이 올라가면서 출력 갯수가 줄어듭니다.
//		k 는 0부터 i 와 똑같이 증가하고 맨 첫줄은 출력하지 않을 것 이므로, k < i 가 성립되어 i보다 작을때 까지만 반복 됩니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int k = i; k < 5; k++) {
				System.out.print("★");
			}
			System.out.println();
		}

//		세로 = i 값
//		흰색별 = j 값
//		검정별 = k 값

//			k	→	→	→	→	
//				0	1	2	3
//	i
//	↓	0	★	★	★	★	★		i = 0	|	j = 0				|	k = 0, 1, 2, 3, 4 	
//	↓	1	☆	★	★	★	★		i = 1	|	j = 0, 1			|	k =    0, 1, 3, 4
//	↓	2	☆	☆	★	★	★		i = 2	|	j = 0, 1, 2			|	k =       0, 1, 2
//	↓	3	☆	☆	☆	★	★		i = 3	|	j = 0, 1, 2, 3		|	k =	         0, 1
//	↓	4	☆	☆	☆	☆	★		i = 4	|	j = 0, 1, 2, 3, 4	|	k =             0

//			0	1	2	3	4
//		j	→	→	→	→	→

//		j 는 0부터 1씩 늘어나면서 늘어나는 i 값보다 미만일때만 출력 합니다.
//		k = i 즉 k 와 i 는 같이 1씩 증가합니다. k 는 5 미만 일때만 출력합니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		System.out.println("삼각형");

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 4; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int star = 0; star <= i * 2; star++) {
//				i + 1, i * 2 는 해보았으나 탈락 
//				if ((star * 3) % 3 == 0)
				System.out.print("★");
			}
			for (int k = i; k < 4; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

//		세로 = i 값
//		j흰색별 = j 값
//		k흰색별 = k 값
//		검정별 = star 값

//							k	→	→	→	→	
//								0	1	2	3	
//	i
//	↓	0	☆	☆	☆	☆	★	☆	☆	☆	☆	i = 0	|	j =	0, 1, 2, 3, 4 | star = 			   0				|	k = 0, 1, 2, 3, 4 	
//	↓	1	☆	☆	☆	★	★	★	☆	☆	☆	i = 1	|	j = 0, 1, 2, 3	  | star = 			0, 1, 2				|	k =    0, 1, 3, 4
//	↓	2	☆	☆	★	★	★	★	★	☆	☆	i = 2	|	j = 0, 1, 2		  | star = 		 0, 1, 2, 3, 4	 		|	k =       0, 1, 2
//	↓	3	☆	★	★	★	★	★	★	★	☆	i = 3	|	j = 0, 1 		  | star = 	  0, 1, 2, 3, 4, 5, 6		|	k =  		 0, 1
//	↓	4	★	★	★	★	★	★	★	★	★	i = 4	|	j = 0 			  | star = 0, 1, 2, 3, 4, 5, 6, 7, 8	|	k =		    	0

//			0	1	2	3
//		j	→	→	→	→

//			0	1	2	3	4	5	6	7	8
//	star	→	→	→	→	→	→	→	→	→	

//	나의 퓰이 방법 : j 와 k 를 먼저 출려후 star의 알고리즘을 생각해본다. 
//		j는 i가 늘어난 숫자만큼 줄고 반복은 4까지 하는 알고리즘을 짠다. ( j = i) ( J < 4 )
//		k도 j 와 같으며 같습니다. why? 안쪽에 칠해진 별이 없기때문에 j와 똑같이 출력이 안되지만 
//		검은 별을 칠해주는 순간 j 와 k는 완벽히 대칭으로 똑같이 진행합니다.
//		star의 규칙 출력 갯수가 2씩늘어난다 (i + 1?)
//		star 의 최대 범위는 0 < 9 까지다.
//		star 의 출력은 1, 3 ,5, 7, 9
//		i 의 첫 반복때 star 에서는 0 ~ 9 까지 돌면서 1번 출력 되어야 합니다.
//		출력 결과는 3의 배수만큼 늘어 납니다.
//		첫 루프는 한번만 반복되면 되고, 두번째 루프는 세번 반복 3의 배수대로 증가
//		증가의 제한을 걸어준다.
//		star 가 0 일때 조건은 < 1, star 가 1 일때 조건은 < 3, star 가 2 일때 조건은 < 5
//		int star = 0; star <= i * 2; star++
//		i 가 0일때  조건 = 0 <=로 인해 true는 단 한번
//		i 가 1일때  조건 = 2 <=로 인해 true는 세번

		System.out.println();
		System.out.println("=================");
		System.out.println();

		System.out.println("역삼각형");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int star = 0; star < 9 - (i * 2); star++) {
				System.out.print("★");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

//		세로 = i 값
//		j흰색별 = j 값
//		k흰색별 = k 값
//		검정별 = star 값

//							k	→	→	→	→	
//								0	1	2	3	
//	i
//	↓	0	★	★	★	★	★	★	★	★	★	i = 0	|	j = 0 			  | star = 0, 1, 2, 3, 4, 5, 6, 7, 8	|	k =		    	0
//	↓	1	☆	★	★	★	★	★	★	★	☆	i = 1	|	j = 0, 1 		  | star = 	  0, 1, 2, 3, 4, 5, 6		|	k =  		 0, 1
//	↓	2	☆	☆	★	★	★	★	★	☆	☆	i = 2	|	j = 0, 1, 2		  | star = 		 0, 1, 2, 3, 4	 		|	k =       0, 1, 2
//	↓	3	☆	☆	☆	★	★	★	☆	☆	☆	i = 3	|	j = 0, 1, 2, 3	  | star = 			0, 1, 2				|	k =    0, 1, 3, 4
//	↓	4	☆	☆	☆	☆	★	☆	☆	☆	☆	i = 4	|	j =	0, 1, 2, 3, 4 | star = 			   0				|	k = 0, 1, 2, 3, 4 	

//			0	1	2	3
//		j	→	→	→	→

//			0	1	2	3	4	5	6	7	8
//	star	→	→	→	→	→	→	→	→	→	

//	나의 퓰이 방법 : j 와 k 를 먼저 출려후 star의 알고리즘을 생각해본다. 
//		j와 k 는 첫 루프에서는 false가 나와 튕기고 두번째 루프 에서부터 i 가 1씩 늘때마다 출력이 1씩 늘어납니다.
//		star 는 첫 반복에 모든 루프를 다돌아 모든 결과를 출력하고,
//		두번째 루프 부터는 -2씩 누적되어 줄어든다 즉 i 의 갯수의 *2 한것 만큼 줄어 듭니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		System.out.println("모래시계");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int star = 0; star < 9 - (i * 2); star++) {
				System.out.print("★");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) { // 한 for문 내에서 해보려 했으니 줄바꿈때문에 위와 정 반대로 생긴 for문을 하나 더 생성합니다.
			for (int j = 0; j < 3 - i; j++) {
				// 출력 갯수제한! 첫루프때 모든 출력 ! 두번째 루프부터 1씩 감소
				System.out.print("☆");
			}
			for (int star = 0; star < 3 + (i * 2); star++) {
				// i 가 0 일때 조건 0~3 까지가 출력이 되어야합니다.
//				i 가 0일때 3을 출력 1일때 5를 출력 2일때 7을 출력 3일때 9를 출력
//				i 가 0일때 star은 0, 1, 2 까지 반복
//				i 가 1일때 star은 0, 1, 2, 3, 4 까지 반복
//				i 가 1씩 증가함에 따라 star 는3 의 배수 입니다.
//				if (i == 0)
//					System.out.print("★★★");
//				else
//					System.out.print("★");
				System.out.print("★");
			}
			for (int j = 0; j < 3 - i; j++) {
				// 출력 갯수제한! 첫루프때 모든 출력 ! 두번째 루프부터 1씩 감소
				System.out.print("☆");
			}
			System.out.println();
		}
//		세로 = i 값
//		j흰색별 = j 값
//		k흰색별 = k 값
//		검정별 = star 값

//							k	→	→	→	→	
//								0	1	2	3	
//	i
//	↓	0	★	★	★	★	★	★	★	★	★	i = 0	|	j = 0 			  | star = 0, 1, 2, 3, 4, 5, 6, 7, 8	|	k =		    	0
//	↓	1	☆	★	★	★	★	★	★	★	☆	i = 1	|	j = 0, 1 		  | star = 	  0, 1, 2, 3, 4, 5, 6		|	k =  		 0, 1
//	↓	2	☆	☆	★	★	★	★	★	☆	☆	i = 2	|	j = 0, 1, 2		  | star = 		 0, 1, 2, 3, 4	 		|	k =       0, 1, 2
//	↓	3	☆	☆	☆	★	★	★	☆	☆	☆	i = 3	|	j = 0, 1, 2, 3	  | star = 			0, 1, 2				|	k =    0, 1, 3, 4
//	↓	4	☆	☆	☆	☆	★	☆	☆	☆	☆	i = 4	|	j =	0, 1, 2, 3, 4 | star = 			   0				|	k = 0, 1, 2, 3, 4
//	↓	0	☆	☆	☆	★	★	★	☆	☆	☆	i = 0	|	j = 0, 1, 2, 3	  | star = 			0, 1, 2				|	k =    0, 1, 3, 4
//	↓	1	☆	☆	★	★	★	★	★	☆	☆	i = 1	|	j = 0, 1, 2		  | star = 		 0, 1, 2, 3, 4	 		|	k =       0, 1, 2
//	↓	2	☆	★	★	★	★	★	★	★	☆	i = 2	|	j = 0, 1 		  | star = 	  0, 1, 2, 3, 4, 5, 6		|	k =  		 0, 1
//	↓	3	★	★	★	★	★	★	★	★	★	i = 3	|	j = 0 			  | star = 0, 1, 2, 3, 4, 5, 6, 7, 8	|	k =		    	0

//			0	1	2	3
//		j	→	→	→	→

//			0	1	2	3	4	5	6	7	8
//	star	→	→	→	→	→	→	→	→	→	

//	나의 퓰이 방법 : j 와 k 를 먼저 출려후 star의 알고리즘을 생각해본다. 
//		설계도 : 모래시계를 4번을 기준으로 X축으로 반으로 나눈다. 위를 먼저 출력후 아래를 출력한다.
//		4번 line 까지 for문을 돌리고, 그밑에 또다른 위와 같은 for문을 생성합니다.

//		↓	0	★	★	★	  						| star = 0, 1, 2				
//		↓	1	★	★	★	★	★					| star = 0, 1, 2, 3, 4	 	
//		↓	2	★	★	★	★	★	★	★			| star = 0, 1, 2, 3, 4, 5, 6		
//		↓	3	★	★	★	★	★	★	★	★	★	| star = 0, 1, 2, 3, 4, 5, 6, 7, 8		

//		for(int i = 0; i < 3; i++) {
//			System.out.print("d\t");
//		}
//		
//		TODO 그림을 자르고, 공백이 없다고 생각하고 생각하시면 조금더 쉽게 접근이 가능 합니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		System.out.println("옆 삼각형");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("★");
			}
			for (int k = i; k < 4; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = i; j < 4; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("★");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("☆");
//				System.out.print("k");
			}
			System.out.println();
		}

//		TODO 그림을 자르고, 공백이 없다고 생각하고 생각하시면 조금더 쉽게 접근이 가능 합니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		System.out.println("역 옆 삼각형");

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 4; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("★");
//				System.out.print("k");
			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int k = i; k < 4; k++) {
				System.out.print("★");
			}
			System.out.println();
		}

//		TODO 그림을 자르고, 공백이 없다고 생각하고 생각하시면 조금더 쉽게 접근이 가능 합니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

		System.out.println("나비");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("★");
			}
			for (int k = i; k < 4; k++) {
				System.out.print("☆");
			}
			for (int j = i; j < 4; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("★");
//				System.out.print("k");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = i; j < 4; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("★");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("☆");
//				System.out.print("k");
			}
			for (int j = 0; j <= i; j++) {
//				System.out.print("　"); // ㄱ 한자 1 (공백)을 넣지 않고 space 공백을 넣게 되면 이상하게 출력됩니다.
				System.out.print("☆");
			}
			for (int k = i; k < 4; k++) {
				System.out.print("★");
			}
			System.out.println();
		}

//		TODO 그림을 자르고, 공백이 없다고 생각하고 생각하시면 조금더 쉽게 접근이 가능 합니다.

		System.out.println();
		System.out.println("=================");
		System.out.println();

	}

}

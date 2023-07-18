package doit;

import java.util.Scanner;
import java.util.Stack;

public class 연습04_02<E> {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		doit.Stack<String> s = new doit.Stack<String>(64);	// 최대 64개를 푸시할 수 있는 스택

		while (true) {
			System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
											 "(4) 덤프 (5) 검색 (6) 비움 " +
											 "(7) 출력 (0) 종료 : ");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			String x;

			switch (menu) {
			 case 1: 								// 푸시
				System.out.print("데이터 : ");
				x = stdIn.next();
				try {
					s.push(x);
				 } catch (doit.Stack.OverflowGstackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 								// 팝
				try {
					 x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				 } catch (doit.Stack.EmptyGstackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 								// 피크
				try {
					 x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				 } catch (doit.Stack.EmptyGstackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4:								// 덤프
				s.dump();
				break;

			 case 5:								// 검색
				System.out.print("검색할 데이터 : ");
				x = stdIn.next();
				int n = s.indexOf(x);
				if (n >= 0)
					System.out.println("꼭대기에서 " + (s.size() - n) +"번째에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;

			 case 6:								// 비웁니다
				s.clear();
				break;

			 case 7:								// 데이터 출력
				System.out.println("용량 : " + s.getCapacity());
				System.out.println("데이터수 : " + s.size());
				System.out.println("비어 " + (s.isEmpty()	? "있습니다."
																								: "있지 않습니다."));
				System.out.println("가득 차 " + (s.isFull() ? "있습니다."
																								: "있지 않습니다."));
				break;
			}
		}
	}
}

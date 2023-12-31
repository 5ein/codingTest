package doit;

import java.util.Scanner;

public class 연습03_05 {
	//--- 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색 ---//
	 static int binSearchX(int[] a, int n, int key) {
	     int pl = 0;            // 검색 범위의 첫 인덱스
	     int pr = n - 1;        // 검색 범위의 끝 인덱스
	     
	     int center = 0; //가운데의  인덱스
	     
	     do {
	         int pc = (pl + pr) / 2;     // 중앙 요소 인덱스
	         if (a[pc] == key) {
	        	 center = pc;             // 검색 성공!
	        	 break;
	         }else if (a[pc] < key) {
	        	 pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
	         }else {
	        	 pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 좁힘
	         }
	     } while (pl <= pr);
	     
	     
	     int first = -1;
	     for (int i = center; i >= pl; i--) {
			if(a[i] == key) first = i;
	     }
	     
	     return first;
	 }

	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     System.out.print("요솟수: ");
	     int num = sc.nextInt();
	     int[] x = new int[num];              // 요솟수가 num인 배열

	     System.out.println("오름차순으로 입력하세요.");

	     System.out.print("x[0]: ");        // 첫 요소 읽력받음
	     x[0] = sc.nextInt();

	     for (int i = 1; i < num; i++) {
	         do {
	             System.out.print("x[" + i + "]: ");
	             x[i] = sc.nextInt();
	         } while (x[i] < x[i - 1]);    // 바로 앞의 요소보다 작으면 다시 입력받음
	     }

	     System.out.print("검색할 값: ");       // 킷값을 읽어 들임
	     int ky = sc.nextInt();

	     int first = binSearchX(x, num, ky);    // 배열 x에서 값이 ky인 요소를 검색

	     if (first == -1)
	         System.out.println("검색 값의 요소가 없습니다.");
	     else
	         System.out.println("키값과 일치하는 맨 앞의 요소는 x[" + first + "]에 있습니다.");
	     
	     sc.close();
	 }
}

package doit;

import java.util.Scanner;

public class 연습01_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		if(n % 2 == 0) sum = (1 + n) * n/2;
		else sum = (1 + n) * n / 2 + (1 + n)/2;
		
		System.out.println("1부터 " + n + "까지의 정수의 합: " + sum);
		
		sc.close();
	}
}

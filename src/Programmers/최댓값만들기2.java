package Programmers;

import java.util.Arrays;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		int[] numbers = {0, -31, 24, 10, 1, 9};
		
		int answer = 0;
		
		Arrays.sort(numbers);
		
		int max1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		int max2 = numbers[0] * numbers[1];
		
		if(max1 > max2) answer = max1;
		else answer = max2;
		
		System.out.println(answer);
	}

}

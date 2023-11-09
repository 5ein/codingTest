package programmers;

import java.util.Arrays;

public class 배열의길이에따라다른연산하기 {

	public static void main(String[] args) {
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		
		System.out.println(Arrays.toString(solution(arr, n)));
	}
	
	public static int[] solution(int[] arr, int n) {
		int[] answer = arr.clone();
		if(arr.length % 2 != 0) {
			for (int i = 0; i < answer.length; i += 2) {
				answer[i] += n;
			}
		}else {
			for (int i = 1; i < answer.length; i += 2) {
				answer[i] += n;
			}
		}
		return answer;
	}
	
//    public static int[] solution(int[] arr, int n) {
//        int[] answer = new int[arr.length];
//        
//        for (int i = 0; i < arr.length; i++) {
//            if (arr.length % 2 == 1 && i % 2 == 0) {
//                answer[i] = arr[i] + n;
//            } else if (arr.length % 2 == 0 && i % 2 == 1) {
//                answer[i] = arr[i] + n;
//            } else {
//                answer[i] = arr[i];
//            }
//        }
//        
//        return answer;
//    }
	
}

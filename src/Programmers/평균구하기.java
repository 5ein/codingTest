package programmers;

public class 평균구하기 {

	public static void main(String[] args) {
		int[] arr = {5, 5};
		System.out.println(solution(arr));
	}
	
    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int i : arr) {
			sum += i;
		}
        answer = (double)sum / arr.length;
        return answer;
    }

}

package programmers;

public class 다음에올숫자 {

	public static void main(String[] args) {
		int[] common = {1, 2, 3, 4};
		System.out.println(solution(common));
	}
	
    public static int solution(int[] common) {
        int answer = 0;
        if((common[1] - common[0]) == (common[2] - common[1])) { //등차수열
        	answer = common[common.length - 1] + (common[1] - common[0]);
        } else { //등비수열
        	answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }

}

package programmers;

public class 짝수와홀수 {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(solution(num));
	}
	
    public static String solution(int num) {
        String answer = "";
        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";
        return answer;
    }
    
}

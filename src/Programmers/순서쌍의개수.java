package programmers;

public class 순서쌍의개수 {
	
	public static void main(String[] args) {
		int n = 20;
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) answer++;
		}
		
		System.out.println(answer);
	}
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class no_2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		
		Collections.sort(arr);
		for (int i : arr) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

}

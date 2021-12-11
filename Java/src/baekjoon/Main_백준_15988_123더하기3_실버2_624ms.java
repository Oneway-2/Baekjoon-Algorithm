package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_백준_15988_123더하기3_실버2_624ms {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] dp = new long[1_000_001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		int TC = Integer.parseInt(br.readLine());
		for (int i = 0; i < TC; i++) {
			int N = Integer.parseInt(br.readLine());
			for (int j = 4; j <= N; j++) {
				dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]) % 1_000_000_009; 
			}
			System.out.println(dp[N]);
		}
	} // 메인 끝
}

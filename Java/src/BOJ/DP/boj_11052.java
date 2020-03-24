package BOJ.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");

        int[] P = new int[N + 1];
        for(int i = 1; i <= N; i++){
            P[i] = Integer.parseInt(tmp[i - 1]);
        }

        int[] dp = new int[N + 1];


        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], dp[i-j] + P[j]);
            }
        }

        System.out.println(Arrays.toString(P));
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[N]);
    }
}

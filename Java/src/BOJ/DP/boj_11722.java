package BOJ.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] dp = new int[N];

        String[] a = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(a[i]);
            dp[i] = 1;
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(A[i] < A[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        Arrays.sort(dp);
        System.out.println(dp[N - 1]);
    }
}

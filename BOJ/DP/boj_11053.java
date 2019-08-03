package BOJ.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_11053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] answer = new int[N];

        String[] a = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(a[i]);
            answer[i] = 1;
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(A[i] > A[j]){
                    answer[i] = Math.max(answer[j] + 1, answer[i]);
                }
            }
        }

        Arrays.sort(answer);
        System.out.println(answer[N - 1]);
    }
}

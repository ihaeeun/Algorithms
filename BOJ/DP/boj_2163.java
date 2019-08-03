package BOJ.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int M = Integer.parseInt(a[1]);

        System.out.println(N * M - 1);
    }
}

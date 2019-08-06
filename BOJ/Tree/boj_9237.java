package BOJ.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class boj_9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] tmp = br.readLine().split(" ");

        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            arr[i] = i + arr[i] + 1;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0] + 1);
    }
}

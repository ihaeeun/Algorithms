package BOJ.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj_3176 {
    private static int N, K;
//    private static int A, B, C, D, E;
    private static ArrayList<Integer>[] trees;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A, B, C, D, E;
        String[] tmp;

        N = Integer.parseInt(br.readLine());

        trees = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            trees[i] = new ArrayList<Integer>();


        }

        for (int i = 1; i < N; i++){
            tmp = br.readLine().split(" ");
            A = Integer.parseInt(tmp[0]);
            B = Integer.parseInt(tmp[1]);
            C = Integer.parseInt(tmp[2]);

            trees[A].add(B);
            trees[B].add(A);
        }

        K = Integer.parseInt(br.readLine());
//        D = new int[K];
//        E = new int[K];
//        for (int i = 0; i < K; i++){
//            tmp = br.readLine().split(" ");
//            D[i] = Integer.parseInt(tmp[0]);
//            E[i] = Integer.parseInt(tmp[1]);
//        }


//        System.out.println(Arrays.toString(trees));
    }
}


// 부모까지의 거리만 배열로 저장
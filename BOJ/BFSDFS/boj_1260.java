package BOJ.BFSDFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_1260 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        int[][] a = new int[n + 1][n + 1];

        boolean checked[] = new boolean[n + 1];

        for(int i = 0; i < m; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            a[v1][v2] = 1;
            a[v2][v1] = 1;
        }

        dfs(a, checked, v);
        for(int i = 0; i < n+1; i++) checked[i] = false;
        bfs(a, checked, v);

    }

    private static void dfs(int[][] a, boolean[] checked, int v){
        if(checked[v]) return;

        checked[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= a.length - 1; i++) {

            if (a[v][i] == 1) {
                dfs(a, checked, i);
            }

        }

    }

    private static void bfs(int[][] a, boolean[] checked, int v){
        Queue<Integer> q = new LinkedList<>();

        q.offer(v);
        checked[v] = true;

        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");

            for (int i = 1; i <= a.length - 1; i++) {
                if (a[v][i] == 1 && !checked[i]) {
                    q.offer(i);
                    checked[i] = true;
                }

            }
        }
    }

}

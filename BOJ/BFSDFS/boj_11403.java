package BOJ.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11403 {
    private static int n;
    private static int[][] array;
    private static boolean[] checked;
    private static int[][] answer = {{0,0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        array = new int[n][n];
        checked = new boolean[n];
        answer = new int[n][n];

        for(int i = 0; i < n; i++){
            String[] tmp = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                array[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                checked[j] = false;
            }
            dfs(i);
            getAnswer(checked, i);
        }

        for (int[] i : answer) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int v){
        for (int i = 0; i < n; i++) {
            if (array[v][i] == 1 && !checked[i]) {
                checked[i] = true;
                dfs(i);
            }
        }
    }

    private static void getAnswer(boolean[] checked, int v){
        for(int i = 0; i < n; i++){
            if(checked[i])
                answer[v][i] = 1;
        }
    }
}

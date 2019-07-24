package BOJ.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1012 {
    private static int[] answer;
    private static int m, n, k;
    private static int[][] array;
    private static boolean[][] checked;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        answer = new int[t];

        for(int i = 0; i < t; i++){
            int count = 0;

            input();
            checked = new boolean[m][n];

            makeArray();

            for(int x = 0; x < m; x++){
                for(int y = 0; y < n; y++){
                    if(!checked[x][y] && array[x][y] == 1){
                        count++;
                        dfs(x, y);
                    }
                }
            }

            answer[i] = count;
        }

        for(int i : answer){
            System.out.println(i);
        }
    }

    private static void input() throws IOException {
        String[] mnk = br.readLine().split(" ");
        m = Integer.parseInt(mnk[0]);
        n = Integer.parseInt(mnk[1]);
        k = Integer.parseInt(mnk[2]);
    }

    private static void makeArray() throws IOException {
        array = new int[m][n];

        String[] ij;
        int x, y;

        for(int i = 0; i < k; i++){
            ij = br.readLine().split(" ");
            x = Integer.parseInt(ij[0]);
            y = Integer.parseInt(ij[1]);
            array[x][y] = 1;
        }
    }

    private static void dfs(int x, int y){
        checked[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < m && ny >= 0 && ny < n){
                if(!checked[nx][ny] && array[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }
}

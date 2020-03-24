package BOJ.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9250 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, x, y;
    private static int[][] array;
    private static boolean[][] checked;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            input();

            t--;
        }
    }

    private static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        String[] xy;

        while(n > 0){
            xy = br.readLine().split(" ");
            x = Integer.parseInt(xy[0]);
            y = Integer.parseInt(xy[1]);

            n--;
        }
        xy = br.readLine().split(" ");
        x = Integer.parseInt(xy[0]);
        y = Integer.parseInt(xy[1]);
        array = new int[x][y];
    }

    private static void dfs(int x, int y){

    }
}

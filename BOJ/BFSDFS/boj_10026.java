package BOJ.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10026 {

    private static int n;
    private static char[][] array;
    private static boolean[][] checked;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        array = new char[n][n];
        checked = new boolean[n][n];

        for(int i = 0; i < n; i++){
            String tmp = br.readLine();
            for(int j = 0; j < n; j++){
                array[i][j] = tmp.charAt(j);
            }
        }

        int ans1 = answer();

        array = G2R(array);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                checked[i][j] = false;
            }
        }

        int ans2 = answer();

        System.out.println(ans1 + " "  + ans2);
    }

    private static void dfs_10026(int x, int y){

        checked[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                if(array[x][y] == array[nx][ny] && !checked[nx][ny]){
                    dfs_10026(nx, ny);
                }
            }
        }

//        return answer;
    }

    private static int answer(){
        count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!checked[i][j]){
                    count++;
                    dfs_10026(i, j);
                }
            }
        }
        return count;
    }

    private static char[][] G2R(char[][] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i][j] == 'G'){
                    a[i][j] = 'R';
                }
            }
        }
        return array;
    }

}

package Programmers.BFSDFS;

public class Network {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static boolean[][] checked;


    private static int solution(int n, int[][] computers) {
        int answer = 0;
        checked = new boolean[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!checked[i][j] && computers[i][j] == 1){
                    answer++;
                    DFS(n, computers, i, j);
                }
            }
        }
        return answer;
    }

    private static void DFS(int n, int[][] computers, int x, int y){
        checked[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                if(!checked[nx][ny] && computers[nx][ny] == 1){
                    DFS(n, computers, nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0}, {1,1,1}, {0,1,1}};

        System.out.println(solution(n, computers));
    }
}

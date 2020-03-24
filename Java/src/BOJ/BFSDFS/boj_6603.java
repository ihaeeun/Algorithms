package BOJ.BFSDFS;

import java.util.*;

public class boj_6603 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<Integer> relations = new ArrayList<>();

        for(int i = 0; i < m; i++){
            int value = scanner.nextInt();
        }

        boolean[] check = new boolean[n];
    }

    public void BFS(HashMap relations, HashMap relation, boolean[] check){
        Queue<Integer> q = new LinkedList<>();


        while(!q.isEmpty()){

        }
    }

    private static void bfs(ArrayList<Integer>[] input, boolean[] checked, int v){
        Queue<Integer> q = new LinkedList<>();

        q.offer(v);
        checked[v] = true;

        while(!q.isEmpty()){
            v = q.poll();
            for(int vv : input[v]){
                if(!checked[vv]){
                    q.offer(vv);
                    checked[vv] = true;
                }
            }
        }
    }
}


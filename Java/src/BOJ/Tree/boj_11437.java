package BOJ.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_11437 {
    private static int[] depth;
    private static int[] parent;
    private static int N;
    private static int M;
    private static ArrayList<Integer>[] connect;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        parent = new int [N + 1];
        depth = new int [N + 1];

        connect = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            connect[i] = new ArrayList<Integer>();
//            parent[i] = -1;
//            depth[i] = -1;
        }

        String[] tmp;
        int a, b;
        for(int i = 1; i < N; i++){
            tmp = br.readLine().split(" ");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);

            connect[a].add(b);
            connect[b].add(a);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        parent[1] = 1;
        depth[1] = 1;

        while(!queue.isEmpty()){
            a = queue.poll();
            for(int i : connect[a]){
                if(parent[i] == 0){
                    queue.add(i);
                    parent[i] = a;
                    depth[i] = depth[a] + 1;
                }
            }
        }

        int temp;
        M = Integer.parseInt(br.readLine());
        for(int i = 1; i <= M; i++){
            tmp = br.readLine().split(" ");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);

            if(depth[a] > depth[b]){
                temp = b;
                b = a;
                a = temp;
            }

            while(depth[a] != depth[b]){
                b = parent[b];
            }

            while(a != b){
                a = parent[a];
                b = parent[b];
            }

            System.out.println(a);
        }

        System.out.println(Arrays.toString(connect));
        System.out.println(Arrays.toString(parent));
        System.out.println(Arrays.toString(depth));
//        System.out.println();
    }
}

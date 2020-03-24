package BOJ.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class boj_11725 {
    private static boolean[] isVisited;
    private static int[] parents;
    private static ArrayList<Integer>[] tree;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];
        parents = new int[N + 1];

        for(int i = 1; i <= N; i++){
            tree[i] = new ArrayList<>();
        }

        String[] tmp;
        int parent = 0;
        int node = 0;

        for(int i = 1; i < N; i++){
            tmp = br.readLine().split(" ");
            parent = Integer.parseInt(tmp[0]);
            node = Integer.parseInt(tmp[1]);

            tree[parent].add(node);
            tree[node].add(parent);
        }

        for(int i = 1; i <= N; i++){
            if(!isVisited[i])
                DFS(i);
        }

        for(int i = 2; i <= N; i++){
            System.out.println(parents[i]);
        }
    }


    private static void DFS(int x){
        isVisited[x] = true;

        for(int i = 0; i < tree[x].size(); i++){
            if(tree[x].get(i) > 1 && !isVisited[tree[x].get(i)]){
                parents[tree[x].get(i)] = x;
                DFS(tree[x].get(i));
            }
        }
    }
}

/*

 */
package BOJ.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_1167 {
    static class Edge {
        int data;
        int cost;

        public Edge(int data, int cost){
            this.data = data;
            this.cost = cost;
        }
    }

    private static boolean[] checked;
    private static int V;
    private static List<Edge>[] edges;
    private static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        V = Integer.parseInt(br.readLine());
        checked = new boolean[V + 1];
        edges = new ArrayList[V + 1];
        dist = new int[V + 1];

        for(int i = 1; i <= V; i++){
            edges[i] = new ArrayList<Edge>();
        }

        int node, a, cost;
        String[] tmp;

        for(int i = 1; i <= V; i++){
            tmp = br.readLine().split(" ");
            node = Integer.parseInt(tmp[0]);
            for(int j = 1; j < tmp.length - 1; j += 2){
                a = Integer.parseInt(tmp[j]);
                cost = Integer.parseInt(tmp[j + 1]);
                edges[i].add(new Edge(a, cost));
            }
        }

        bfs(1);

        int start = 1;
        for(int i = 1; i <= V; i++){
            if(dist[start] < dist[i])
                start = i;
            bfs(start);
        }
        Arrays.sort(dist);

        System.out.println(dist[V]);
    }

    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        checked[start] = true;

        int v;
        while (!queue.isEmpty()){
            v = queue.poll();
            for(Edge edge : edges[v]){
                int a = edge.data;
                int cost = edge.cost;

                if(!checked[a]){
                    checked[a] = true;
                    queue.add(v);
                    dist[a] = dist[v] + cost;
                }
            }
        }
    }
}

package DFS_BFS.TargetNumber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// BFS 이용해야 함!!!
public class Solution {
    public int solution(int[] numbers, int target) {

        int answer = 0;

        graph(numbers);

        ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[numbers.length + 1];

//        for(int i = 0; i <= numbers.length; i++){
//            int v1 = s.nextInt();
//            int v2 = s.nextInt();
//
//            a[v1].add(v2);
//            a[v2].add(v1);
//        }

        return answer;
    }

    private static void graph(int[] numbers){
        int a[][] = new int[numbers.length][numbers.length];

        for(int i = 0; i < numbers.length; i++){
            int v1 = numbers[i];
            int v2 = numbers[i];

            a[v1][v2] = 1;
            a[v2][v1] = 1;
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(v);
        boolean checked[] = new boolean[v];
        checked[v] = true;
//
//        while(!q.isEmpty()){
//            v=q.poll();
//            System.out.print(v + " ");
//
//            for(int vv : a[v]){
//                if(!c[vv]){
//                    q.add(vv);
//                    c[vv] = true;
//                }
//            }
//        }
    }
}

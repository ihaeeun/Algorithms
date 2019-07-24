package Programmers.Heap;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(int i : scoville){
            heap.offer(i);
        }

        while(heap.size() > 1){
            System.out.println(heap);
            if(heap.peek() >= K){
                break;
            }
            int temp = heap.poll();
            int head = temp + (heap.poll() * 2);
            heap.offer(head);
            answer++;
        }

        if(heap.peek() < K){
            return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        MoreSpicy solution = new MoreSpicy();
        System.out.println(solution.solution(scoville, K));
    }
}

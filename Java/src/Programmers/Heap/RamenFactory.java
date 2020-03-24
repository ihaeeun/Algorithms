package Programmers.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RamenFactory {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int date = 0;

        PriorityQueue<Integer> dQueue = new PriorityQueue<>();
        PriorityQueue<Integer> sQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int supply : supplies){
            sQueue.offer(supply);
        }

        for(int i : dates){
            dQueue.offer(i);
        }

        int index = 0;

        for(int i = 0; i < k; i++){
            if(!dQueue.isEmpty() && i == dQueue.peek())
                sQueue.offer(supplies[index]);



                int tmp = sQueue.poll();
                stock += tmp;
                answer++;
                System.out.println(i + " " + stock);
                dQueue.poll();
                date = i;
                if(date + stock >= k){
                    break;
                }

            stock--;
        }

        return answer;
    }

    public static void main(String[] args) {
        RamenFactory solution = new RamenFactory();
        RamenFactory2 newSolution = new RamenFactory2();
        int stock = 4;
        int[] dates = {4,10,15};
        int[] supplies = {20,5,10};
        int k = 30;

//        int stock = 10;
//        int[] dates = {5, 10};
//        int[] supplies = {1, 100};
//        int k = 110;

        System.out.println(solution.solution(stock, dates, supplies, k));
//        System.out.println(newSolution.solution(stock, dates, supplies, k));
    }
}

package Programmers.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

class Factory implements Comparable<Factory>{
    int date;
    int supply;

    Factory(int date, int supply){
        super();
        this.date = date;
        this.supply = supply;
    }

    @Override
    public int compareTo(Factory target) {
        if (this.supply > target.supply) {
            return 1;
        } else if (this.supply < target.supply) {
            return -1;
        }
        return 0;
    }
}

public class RamenFactory2 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int date = 0;

        PriorityQueue<Factory> queue = new PriorityQueue<>(1, Collections.reverseOrder());

        for(int i = 0; i < dates.length; i++){
            queue.offer(new Factory(dates[i], supplies[i]));
        }

        for(int i = 0; i < k; i++){
            if(queue.size() > 1 && i == queue.peek().date) {
                Factory f1 = new Factory(queue.peek().date, queue.peek().supply);
                Factory f2 = new Factory(queue.peek().date, queue.peek().supply);
                if(f2.supply + stock > k) {
                    answer++;
//                    queue.poll();
                    queue.poll();
                    continue;
                }
                stock += f1.supply;
                answer++;
                queue.poll();
                System.out.println(i + " " + stock);
                date = f1.date;
                if(date + stock >= k){
                    break;
                }

            }
            stock--;
        }

        return answer;
    }


}

package Programmers.StackQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> trucks = new ArrayDeque<>();
        for(int truck_weight : truck_weights){
            trucks.offer(truck_weight);
        }

        Queue<Integer> bridge = new ArrayDeque<>();
        int count = 0;

        bridge.offer(trucks.poll());
        while(!(trucks.isEmpty() && bridge.isEmpty())){
            if(weight <= bridge.peek() + trucks.peek()){
                bridge.add(trucks.poll());
                count++;
            } else {
                count++;
            }

            if(count == bridge_length){
                bridge.poll();
            }
            System.out.println(bridge);
            System.out.println(trucks);
            System.out.println(count);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        Truck solution = new Truck();
        System.out.println(solution.solution(bridge_length, weight, truck_weights));
    }
}
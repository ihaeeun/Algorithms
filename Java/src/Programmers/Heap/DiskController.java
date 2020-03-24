package Programmers.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Job implements Comparable<Job>{
    int time;
    int workload;

    Job(int time, int workload){
        super();
        this.time = time;
        this.workload = workload;
    }

    @Override
    public int compareTo(Job target) {
        if (this.workload > target.workload) {
            return 1;
        } else if (this.workload < target.workload) {
            return -1;
        } else if (this.workload == target.workload) {
            if(this.time > target.time)
                return 1;
            else return -1;
        }
        // workload가 같을 때 들어온 시간이 작은 걸 먼저!
        return 0;
    }
}

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Job> queue = new PriorityQueue<>();
        ArrayList<Job> disk = new ArrayList<>();

        for(int i = 0; i < jobs.length; i++){
            queue.offer(new Job(jobs[i][0], jobs[i][1]));
        }

        for(int i = 0; i < jobs.length; i++){
            disk.add(queue.poll());
        }

        int current = 0;
        int total = 0;
        Job task;

        while(!disk.isEmpty()){
            for(int i = 0; i < jobs.length; i++){
                if(disk.get(i).time <= current){
                    task = disk.get(i);
                    total += current + task.workload - task.time;
                    current += task.workload;
                    disk.remove(i);
                    break;
                }
                if(i == disk.size() - 1){
                    current++;
                }
            }
        }

        answer = total / jobs.length;

        return answer;
    }

    public static void main(String[] args) {
        DiskController diskController = new DiskController();
//        Solution2 solution2 = new Solution2();
//        int [][] jobs = {{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}};
//        int [][] jobs = {{0, 5}, {1, 2}, {5, 5}};
        int [][] jobs = {{1, 9}, {0, 3}, {2, 6}};
        System.out.println(diskController.solution(jobs));
    }
}

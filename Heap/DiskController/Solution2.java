//package Heap.DiskController;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//
//public class Solution2 {
//    public int solution(int[][] jobs) {
//        int answer = 0;
//        int totalTime = jobs[0][0];
//        PriorityQueue<Job> queue = new PriorityQueue<>();
//        PriorityQueue<Integer> personals = new PriorityQueue<>();
//        ArrayList<Job> disk = new ArrayList<>();
//
//        for(int i = 0; i < jobs.length; i++){
//            queue.offer(new Job(jobs[i][0], jobs[i][1]));
//        }
//
//        for(int i = 0; i < jobs.length; i++){
//            disk.add(queue.poll());
//            totalTime += disk.get(i).workload;
//        }
//
//        int personal = 0;
//        int current = 0;
//        int avg = 0;
//
//        for(int i = 0; i < disk.size(); i++){
//            personals.offer(totalTime - disk.get(i).time);
//        }
//
////        while(totalTime > 0){
////
////            totalTime--;
////        }
//
//        System.out.println(personals);
//
//        while(disk.size() > 0){
//            Job task;
//            for(int i = 0; i < jobs.length; i++){
//                if(disk.get(i).time <= current){
//                    task = disk.get(i);
//                    personal = current + task.workload - task.time;
//                    avg += personal;
//                    current += task.workload;
//                    disk.remove(i);
//                    break;
//                }
//                if(i == disk.size() - 1){
//                    current++;
//                }
//            }
//
//            System.out.println(personal + " " + current);
//        }
//
//        answer = avg / jobs.length;
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
////        int [][] jobs = {{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}};
////        int [][] jobs = {{0, 5}, {1, 2}, {5, 5}};
//        int [][] jobs = {{0, 3}, {1, 9}, {2, 6}};
//        System.out.println(solution.solution(jobs));
//    }
//}
//
///*
//
// */
//
//
//
//
//
//
//
//
//

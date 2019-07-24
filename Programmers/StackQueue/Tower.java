package Programmers.StackQueue;

import java.util.Arrays;

public class Tower {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
//
//        Stack<Integer> towers = new Stack<>();
//
//        for(int height : heights){
//            ;
//        }
//        int top = towers.pop();
//
//        while(!towers.isEmpty()){
//            if(top < towers.peek()){
//                if(!temp.isEmpty()){
//                    while(!temp.isEmpty()){
//                        arr.add(towers.size());
//                        temp.pop();
//                    }
//                }
//                arr.add(towers.size());
//                top = towers.pop();
//                System.out.println("top " + top);
//            } else {
//                temp.add(towers.pop());
//                System.out.println("temp " + temp);
//            }
//        }
//
//        if(!temp.isEmpty()){
//            while(!temp.isEmpty()){
//                arr.add(towers.size());
//                temp.pop();
//            }
//            arr.add(0);
//        }
//
//        System.out.println(arr);
//
//        for(int j = answer.length - 1; j >= 0; j--){
//            answer[j] = arr.get(answer.length - j - 1);
//        }

        for(int i = heights.length - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0; j--){
                if(heights[i] < heights[j]){
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {3,9,9,3,5,7,2};

        Tower solution = new Tower();
        System.out.println(Arrays.toString(solution.solution(heights)));
    }
}

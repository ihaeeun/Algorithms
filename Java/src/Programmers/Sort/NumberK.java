package Programmers.Sort;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

class NumberK {
    int[] solution(int[] array, int[][] commands) {

        List<Integer> list = new ArrayList<>();

        for(int[] results : commands){
            int[] temp = Arrays.copyOfRange(array, results[0]-1, results[1]);
            Arrays.sort(temp);
            list.add(temp[results[2]-1]);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        NumberK solution = new NumberK();
        System.out.println(Arrays.toString(solution.solution(array, commands)));
    }
}
package Programmers.Test;

import java.util.Arrays;

public class SortNum {
    public static void main(String[] args) {
        int [] array = new int[] {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];
        int i, j, k;
        String tmp = "";
        String s = Arrays.toString(array).replaceAll("[^0-9]","");
        for(int x = 0; x < commands.length; x++) {
            i = commands[x][0] - 1;
            j = commands[x][1];
            k = commands[x][2] - 1;

            tmp = s.substring(i, j);
            String [] middle = tmp.split("");
            int [] temp = new int[tmp.length()];
            for(int y = 0; y < tmp.length(); y++){
                temp[y] = Integer.parseInt(middle[y]);
            }
            Arrays.sort(temp);
            answer[x] = temp[k];

        }

        System.out.println(Arrays.toString(answer));
    }
}

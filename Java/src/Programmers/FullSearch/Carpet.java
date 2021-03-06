package Programmers.FullSearch;

import java.util.Arrays;

public class Carpet {
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int size = brown + red;

        for(int i = 1; i * i <= size; i++){
            for(int j = 1; i * j <= size; j++){
                if(i * j == size && j >= i && (j * i - ((j-2) * (i-2)) >= brown)){
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int brown = 10;
        int red = 2;
        Carpet carpet = new Carpet();
        System.out.println(Arrays.toString(carpet.solution(brown, red)));
    }
}
package Programmers.FullSearch;

import java.util.ArrayList;

public class NumberBaseball {
    public int solution(int[][] baseball) {
        int answer = 0;

        ArrayList<String> lists = new ArrayList<>();

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                for(int k = 1; k < 10; k++){
                    if(i != j && j != k && k != i){
                        lists.add(String.valueOf(i * 100 + j * 10 + k));
                    }
                }
            }
        }


        for(String list : lists){
            int count = 0;
            for(int i = 0; i < baseball.length; i++){
                int strike = strike(list, String.valueOf(baseball[i][0]));
                int ball = ball(list, String.valueOf(baseball[i][0]));
                if((strike == baseball[i][1]) && (ball == baseball[i][2])){
                    count++;
                } else {
                    break;
                }
            }
            if(count == baseball.length){
                answer++;
            }
        }

        return answer;
    }

    private int strike(String list, String num){
        int strike = 0;
        for(int i = 0; i < 3; i++){
            if(list.charAt(i) == num.charAt(i)){
                strike++;
            }
        }
        return strike;
    }

    private int ball(String list, String num){
        String[] standard = list.split("");
        String[] number = num.split("");
        int ball = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(standard[i].equals(number[j]) && (i != j)){
                    ball++;
                }
            }
        }
        return ball;
    }

    public static void main(String[] args) {
        int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
        NumberBaseball solution = new NumberBaseball();
        System.out.println(solution.solution(baseball));
    }
}

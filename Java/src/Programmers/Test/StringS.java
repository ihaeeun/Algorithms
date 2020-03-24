package Programmers.Test;

import java.util.*;

public class StringS {
    public String solution(String s) {
        String answer = "";
        String[] array = new String[s.length()];

        for(int i = 0; i < s.length(); i++){
            array[i] = String.valueOf(s.charAt(i));
        }

        for(int j = 0; j < array.length; j++){
            if(j == 0 || j % 2 == 0){
                array[j] = array[j].toUpperCase();
            } else {
                array[j] = array[j].toLowerCase();
            }
        }
        answer = Arrays.toString(array);
        return answer;
    }

    public static void main(String[] args) {

        String numbers = "try hello world";
        StringS foundPrimeNum = new StringS();
        System.out.println(foundPrimeNum.solution(numbers));
    }
}

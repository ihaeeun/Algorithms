package StackQueue.IronBar;

public class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        int temp = 0;

        arrangement = arrangement.replace("()", "1");

        System.out.println(arrangement);

        for(int i = 0; i < arrangement.length(); i++){
            switch (arrangement.charAt(i)){
                case '(': temp++; break;
                case ')': temp--; answer++; break;
                case '1': answer += temp;
            }
            System.out.println("temp : " + temp + " answer : " + answer);
        }

        return answer;
    }
}

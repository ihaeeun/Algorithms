package Programmers.Level1;

public class MidWord {
    public String solution(String s) {
        String answer = "";
        int length = s.length();

        if(length % 2 == 0) {
            answer = "" + s.charAt(length/2-1) + s.charAt(length/2);
        } else {
            answer = "" + s.charAt(length/2);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "abcde";
        MidWord solution = new MidWord();
        System.out.println(solution.solution(s));
    }
}

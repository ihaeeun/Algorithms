package Programmers.Test;

public class Str2Int {
    public static void main(String[] args) {
        String s = "-1234";
        int answer = 0;

        char[] chars = new char[s.length()];

        if(chars[0] == '-'){
            answer = Integer.parseInt(s) * -1;
        } else {
            answer = Integer.parseInt(s);
        }

        System.out.println(answer);
    }
}

package Programmers.StackQueue;

public class IronBar {
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

    public static void main(String[] args) {
        IronBar solution = new IronBar();
        String arrangement = "()(((()())(())()))(())";
        System.out.println(solution.solution(arrangement));
    }
}

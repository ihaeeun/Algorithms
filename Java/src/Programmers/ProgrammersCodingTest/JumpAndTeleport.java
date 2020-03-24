package Programmers.ProgrammersCodingTest;

public class JumpAndTeleport {
    public int solution(int n){
        int ans = 0;

        while(n != 0){
            if(n % 2 == 1){
                n = n - 1;
                ans++;
            }
            n = n / 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        JumpAndTeleport solution = new JumpAndTeleport();

        int n = 5000;
        System.out.println(solution.solution(n));
    }
}
package MakingPrimeNum;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;
        int num = 0;
        boolean res = true;

        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    num = nums[i] + nums[j] + nums[k];
                    res = isPrime(num);
                    if(res == true){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }



    private boolean isPrime(int num){
        boolean result = true;
        if(num % 2 == 0 && num != 2) {
            result = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if(num % i != 0) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}

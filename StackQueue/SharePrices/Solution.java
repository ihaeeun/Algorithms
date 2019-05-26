package StackQueue.SharePrices;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++){
            int count = 0;
            for(int j = i + 1; j < prices.length; j++){
                count++;
                if(prices[i] > prices[j]){
                    answer[i] = count;
                    break;
                }
            }
            if(answer[i] == 0){
                answer[i] = count;
            }
        }
        return answer;
    }
}

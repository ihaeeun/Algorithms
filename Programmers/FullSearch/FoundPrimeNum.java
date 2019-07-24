package Programmers.FullSearch;

// 첫 번째로, 숫자 조각으로 만들 수 있는 모든 숫자를 만들고 그 숫자들 중 소수의 개수를 세는 방법.
// 두 번째로, 숫자 조각으로 구할 수 있는 최대 수 까지 소수를 모두 구한 뒤 모든 소수를 검사하며 해당 소수가 숫자 조각들로 이루어 질 수 있는지 확인하는 방법

import java.util.Arrays;
import java.util.Collections;

public class FoundPrimeNum {
    public int solution(String numbers) {
        int answer = 0;

        //제일 큰 수 찾기
        String[] arrs = numbers.split("");
        Arrays.sort(arrs);
        Collections.reverse(Arrays.asList(arrs));
        int max = Integer.parseInt(String.join("", arrs));

        for(int i = 1; i <= max; i++){
            if(isPrime(i)){
                int[] count = initCount(arrs);
                boolean flag = true;
                String[] test = String.valueOf(i).split("");
                for(int j = 0; j < test.length; j++){
                    if(checkNum(Integer.parseInt(test[j]), count)){
                        count[Integer.parseInt(test[j])]--;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }


    private boolean isPrime(int num){
        boolean result = true;
        if((num % 2 == 0 && num != 2) | num == 1) {
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

    private boolean checkNum(int num, int count[]){
        return count[num] > 0;
    }

    private int[] initCount(String arrs[]){
        int[] count = new int[10];
        for(int i = 0; i < arrs.length; i++){
            count[Integer.parseInt(arrs[i])]++;
        }
        return count;
    }

    public static void main(String[] args) {
        String numbers = "17";
        FoundPrimeNum foundPrimeNum = new FoundPrimeNum();
        System.out.println(foundPrimeNum.solution(numbers));
    }
}
package Programmers.Test;

public class primenum {
    public int solution(int n) {
        int answer = 0;
        System.out.println(n);
        boolean result = false;
        for(int i = 2; i <= n; i++){
            result = isPrime(i);
            System.out.println(i + " " + result);
            if(result){
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(int num){
        boolean result = true;
        if((num % 2 == 0 && num != 2) | num == 1) {
//            System.out.println(num + " " + result);
            result = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if(num % i != 0) {
                    result = true;
//                    System.out.println(i + " " + result);
                } else {
                    result = false;
//                    System.out.println(i + " " + result);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int numbers = 5;
        primenum foundPrimeNum = new primenum();
        System.out.println(foundPrimeNum.solution(numbers));
    }
}
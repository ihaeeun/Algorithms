package Programmers.Level1;

class CeasarCipher {
    public String solution(String s, int n) {
        String answer = "";

        int[] plain = new int[s.length()];
        char[] cipher = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            plain[i] = (int) s.charAt(i);
            if (plain[i] == 32) {
                cipher[i] = 32;
            } else {
                if(plain[i] + n > 122 || (plain[i] < 97 && plain[i] + n > 90)){
                    plain[i] = plain[i] - 26;
                }
                cipher[i] = (char) (plain[i] + n);
            }
        }

        answer = String.copyValueOf(cipher);

        return answer;
    }

    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;

        CeasarCipher solution = new CeasarCipher();
        System.out.println(solution.solution(s, n));
    }
}

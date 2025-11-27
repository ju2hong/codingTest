import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder answer = new StringBuilder(new String(arr)).reverse();
        return Long.parseLong(answer.toString());
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int answer2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        if(answer1 > answer2) {
            answer = answer1;
        } else {
            answer = answer2;
        }
        return answer;
    }
}
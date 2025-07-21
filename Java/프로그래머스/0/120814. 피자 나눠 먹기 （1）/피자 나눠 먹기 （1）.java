class Solution {
    public int solution(int n) {
        int answer = 0;
        int div1 = n/7;
        int div2 = n%7;
        if(n<=7) {
            answer = 1;
        } else if(n%7>1) {
            answer = div1+1;
        } else {
            answer = div1+div2;
        }
        return answer;
    }
}
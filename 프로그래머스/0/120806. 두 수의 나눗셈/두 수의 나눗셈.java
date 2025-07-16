class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double boubleNum1 = num1;
        double boubleNum2 = num2;
        answer = (int)(boubleNum1/boubleNum2 * 1000);
        return answer;
    }
}
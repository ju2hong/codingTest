import java.util.Arrays;
    
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        int last = num_list[num_list.length - 1];
        int second = num_list[num_list.length - 2];
        
        if(last > second) {
            answer[answer.length - 1] = last - second;
        } else {
            answer[answer.length - 1] = last * 2;
        } 
        
        return answer;
    }
}
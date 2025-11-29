import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int maxCount = 0;
        int answer = -1;
        
        for(int key : map.keySet()) {
            int count = map.get(key);
            
            if(count>maxCount) {
                maxCount = count;
                answer = key;
            } else if(count == maxCount){
                answer = -1;
            }
        }
        return answer;
    }
}
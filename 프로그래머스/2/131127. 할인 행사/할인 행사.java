class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for (int startDay=0; startDay < discount.length-9; startDay++) {
            int matchedItemCount = 0;
            
            for(int wantIndex = 0; wantIndex < want.length; wantIndex++) {
                int requiredCount = number[wantIndex];
                
                for(int checkDay = startDay; checkDay < startDay + 10; checkDay++) {
                    
                    if(discount[checkDay].equals(want[wantIndex])) {
                        requiredCount--;
                    }
                } 
                
                if(requiredCount > 0) {
                    break;
                }
                
                matchedItemCount++;
            }
            
            if(matchedItemCount == want.length) {
                answer++;
            }
            
        }
        
        return answer;
    }
}
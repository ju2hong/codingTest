class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int x = (numer1*denom2) + (numer2*denom1);
        int y = denom1*denom2;
        int z = 1;
        int min;
        if(x < y) {
            min = x;
        } else {
            min = y;
        }
            
        for(int i=min; i>1; i--) {
            if(x % i == 0 && y % i == 0) {
                if(z == 0) {
                    break;  
                }
                z = i; 
                break;
            }
        }
        x = x/z;
        y = y/z;
        
        int[] answer = new int[2];
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
}
class Solution {
    public int solution(String t, String p) { 
        int tSize = t.length();
        int pSize = p.length();
        long pValue = Long.parseLong(p);
        int plus = tSize - pSize;
        int result = 0;
        for(int i=0; i<= plus; i++) {
            String tStr = t.substring(i,i+pSize);
            long tValue = Long.parseLong(tStr);
            if(tValue<=pValue) {
                 result++;
            }
        }
        return result;
    }
}
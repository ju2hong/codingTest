class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(String i : arr) {
            int num = Integer.parseInt(i);
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        return min + " " + max;
    }
}
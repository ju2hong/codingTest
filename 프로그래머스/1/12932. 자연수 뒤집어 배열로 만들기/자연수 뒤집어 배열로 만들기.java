class Solution {
    public int[] solution(long n) {
        char[] array = new StringBuilder(Long.toString(n))
                                             .reverse().toString().toCharArray();
        int[] result = new int[array.length];
        
        for(int i=0; i<array.length; i++) {
            result[i] = array[i] - '0';
        }
        return result;
    }
}
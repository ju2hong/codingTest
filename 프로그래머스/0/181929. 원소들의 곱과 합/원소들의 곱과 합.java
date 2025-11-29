class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gop = 1;
        int hap = 0;
        for(int i=0; i<num_list.length; i++) {
             gop *= num_list[i];
             hap += num_list[i];
        }
        int hapza = hap * hap;
        if (gop<hapza) {
            return 1;
        } else {
            return 0;
        }
    }
}
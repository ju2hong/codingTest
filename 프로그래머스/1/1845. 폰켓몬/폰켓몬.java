import java.util.*;

class Solution {    
    public int solution(int[] nums) {
        Map<Integer, Integer> pokemons = new HashMap<>();
        for(int num:nums) {
            pokemons.put(num, pokemons.getOrDefault(num,0)+1);
        }
        int hN = nums.length/2;
        if(hN <= pokemons.size()) {
            return hN;
        } else {
            return pokemons.size();
        }
    }
}
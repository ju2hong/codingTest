import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<Integer>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int check = 0;
                if (board[j][moves[i] - 1] > 0) {
                    if (basket.size() > 0) {
                        Integer lastData = basket.get(basket.size() - 1);
                        if (lastData == board[j][moves[i] - 1]) {
                            basket.remove(basket.size() - 1);
                            answer += 2;
                            check = 1;
                        }
                    }
                    if (check == 0) {
                        basket.add(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

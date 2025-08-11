class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
                int walletSmall = Math.min(wallet[0], wallet[1]);
        int walletBig   = Math.max(wallet[0], wallet[1]);

        while (true) {
            int billSmall = Math.min(bill[0], bill[1]);
            int billBig   = Math.max(bill[0], bill[1]);

            if (billSmall <= walletSmall && billBig <= walletBig) {
                break;
            }

            if (bill[0] >= bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }

            answer++;
        }

        return answer;
    }
}
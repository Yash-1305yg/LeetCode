class Solution {
    // Boolean[] dp = new Boolean[100000 + 1];
    public boolean winnerSquareGame(int n) {
    //     if (dp[n] != null) {
    //         return dp[n];
    //     }
    //     Boolean answer = false;
    //     for (int move = 1; n - move * move >= 0; ++move) {
    //         if (n - move * move == 0) {
    //             answer = true;
    //             break;
    //         } else {
    //             answer |= !winnerSquareGame(n - move * move);
    //         }
    //     }
    //     return dp[n] = answer;
        boolean[] f = new boolean[n + 1];
        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k * k <= i; ++k) {
                // System.out.println("i:"+i);
                // System.out.println("k:" + k);
                if (!f[i - k * k]) {
                    f[i] = true;
                    // System.out.println("break:" + k);
                    break;
                }
            }
        }
        
        return f[n];
    
     }
}
class Solution {
    public boolean stoneGame(int[] piles) {
        
        int[] dp = Arrays.copyOf(piles, piles.length);
        for (int d = 1; d < piles.length; d++)
            for (int i = 0; i < piles.length - d; i++)
                dp[i] = Math.max(piles[i] - dp[i + 1], piles[i + d] - dp[i]);
        return dp[0] > 0;
    }
    
}


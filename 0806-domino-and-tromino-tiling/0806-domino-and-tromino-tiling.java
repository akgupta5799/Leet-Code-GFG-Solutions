class Solution {
    public int numTilings(int n) {
        if(n<=2) return n;
        long mod = 1000000007;
        long dp[] = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for(int i=4;i<n+1;i++){
            dp[i] = (2*dp[i-1] + dp[i-3])%mod;
            dp[i] = dp[i]%mod;
        }
        return (int)(dp[n]%mod);
    }
}
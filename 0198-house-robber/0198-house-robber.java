// class Solution {
//     public int rob(int[] nums) {
//         // Recursion
//         int n = nums.length;
//         int res = solve(nums, 0, n);
//         return res;
//     }

//     public int solve(int[] nums, int i, int n){
//         if(i >= n) return 0;
//         // Take
//         int steal = nums[i] + solve(nums, i+2, n);
//         // Non Take
//         int skip = solve(nums, i+1, n);

//         return Math.max(steal, skip);
        
//     }
// }

class Solution{
    public int rob(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];

        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i=2;i<n+1;i++){
            int steal = nums[i-1] + dp[i-2]; 
            int skip = dp[i-1];
            dp[i] = Math.max(steal, skip);
        }
        return dp[n];
    }
}
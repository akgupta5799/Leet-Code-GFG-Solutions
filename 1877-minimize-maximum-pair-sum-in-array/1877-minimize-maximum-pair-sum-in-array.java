class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        //I will make pair as (a1,an), (a2,an-1), (a3, an-3) ...like this
        //means pairing will be greatest with the smallest and second greatest with the second smallest and so on.
        int minMaxSum = 0;
        for(int i=0;i<n/2;i++){
            minMaxSum = Math.max(minMaxSum, nums[i]+nums[n-1-i]);
        }
        return minMaxSum;
    }
}
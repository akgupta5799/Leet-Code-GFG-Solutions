class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int split = 0;
        long leftSum = 0;
        long rightSum = 0;
        for(int i=0;i<n-1;i++){
            leftSum += nums[i];
            rightSum = sum - leftSum;
            if(leftSum >= rightSum){
                split++;
            }
        }
        return split;
    }
}
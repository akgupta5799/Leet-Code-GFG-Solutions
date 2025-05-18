class Solution {
    public int rob(int[] nums) { //nums[] = [1,2,3,1]
        if(nums.length==1){
            return nums[0];
        }
        int skipFirst[] = new int[nums.length-1]; 
        int skipLast[] = new int[nums.length-1];  
        for(int i=0;i<nums.length-1;i++){
            skipFirst[i] = nums[i+1]; //skipFirst[] = [2,3,1]
            skipLast[i] = nums[i];    //skiplast[] = [1,2,3]
        }
        int res1 = robHelper(skipFirst);
        int res2 = robHelper(skipLast);
        return Math.max(res1,res2);
    }
    public int robHelper(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int dp[] = new int[arr.length+1];
        dp[0] = 0;
        dp[1] = arr[0];
        for(int i=2;i<arr.length+1;i++){
            int steal = arr[i-1] + dp[i-2];
            int skip = dp[i-1];
            dp[i] = Math.max(steal, skip);
        }
        return dp[arr.length];
    }
}
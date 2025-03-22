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
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
        }
        return dp[arr.length-1];
    }
}
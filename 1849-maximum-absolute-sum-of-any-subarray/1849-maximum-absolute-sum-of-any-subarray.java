class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSumSubarray = kadanesMax(nums);
        int minSumSubarray = kadanesMin(nums);
        int res = Math.max(Math.abs(maxSumSubarray), Math.abs(minSumSubarray));
        return res;
    }

    public static int kadanesMax(int[] nums){
        int n = nums.length;
        int currSum = nums[0];
        int overAllSum = nums[0];
        for(int i=1;i<n;i++){
            if(currSum < 0){
                currSum = nums[i];
            }else{
                currSum += nums[i];
            }

            if(currSum > overAllSum){
                overAllSum = currSum;
            }
        }
        return overAllSum;
    }

    public static int kadanesMin(int[] nums){
        int n = nums.length;
        int currSum = nums[0];
        int overAllSum = nums[0];
        for(int i=1;i<n;i++){
            if(currSum >= 0){
                currSum = nums[i];
            }else{
                currSum += nums[i];
            }

            if(currSum < overAllSum){
                overAllSum = currSum;
            }
        }
        return overAllSum;
    }
}
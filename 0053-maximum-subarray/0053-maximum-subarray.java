class Solution {
    public int maxSubArray(int[] nums) {
        // T.C. O(n^2)
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += nums[j];
        //         if(sum > max){
        //             max = sum;
        //         }
        //     }
        // }
        // return max;

        // Kadane's Algorithm
        int n = nums.length;
        int currSum = nums[0];
        int overAllSum = nums[0];
        for(int i=1;i<n;i++){
            if(currSum >= 0){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }
            if(currSum > overAllSum){
                overAllSum = currSum;
            }
        }
        return overAllSum;
    }
}
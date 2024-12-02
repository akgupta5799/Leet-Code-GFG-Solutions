// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//         // Brute Force
//         int n = nums.length;
//         int res = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int maxSum = kadane(nums,n);
//             rotate(nums,n);
//             res = Math.max(res, maxSum);
//         }
//         return res;
//     }

//     public static int kadane(int[] nums, int n){
//         int currSum = nums[0];
//         int overallSum = nums[0];
//         for(int i=1;i<n;i++){
//             if(currSum >= 0){
//                 currSum += nums[i];
//             }else{
//                 currSum = nums[i];
//             }
//             if(currSum > overallSum){
//                 overallSum = currSum;
//             }
//         }
//         return overallSum;
//     }
//     public static void rotate(int[] nums, int n){
//         int temp = nums[0];
//         for(int i=0;i<n-1;i++){
//             nums[i] = nums[i+1];
//         }
//         nums[n-1]= temp;
//     }

// }
   
class Solution{
    public int maxSubarraySumCircular(int[] nums){
        // Case 1: Finding max sum subaray using Kadane's Algorithm
        int n = nums.length;
        int maxSum = KadaneMax(nums,n);

        // Case 2: Finding min sum subarray using Kadane's Algorithm
        int minSum = KadaneMin(nums,n);
        int totalSum = Arrays.stream(nums).reduce(0, (a,b)->a+b);
        int circularSum = totalSum - minSum;

        if(maxSum > 0){
            return Math.max(maxSum, circularSum);
        }
        return maxSum;
    }

    public static int KadaneMax(int[] nums, int n){
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

    public static int KadaneMin(int[] nums, int n){
        int currSum = nums[0];
        int overAllSum = nums[0];
        for(int i=1;i<n;i++){
            if(currSum <= 0){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }
            if(currSum < overAllSum){
                overAllSum = currSum;
            }
        }
        return overAllSum;
    }
}   
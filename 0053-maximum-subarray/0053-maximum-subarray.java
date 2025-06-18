class Solution {
    public int maxSubArray(int[] nums) {
        // T.C. O(n^2) TLE
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

        // T.C. O(n) { Optimal Solution *Kadane's Algorithm* }
        int n = nums.length;
        int currSum = nums[0];
        int overAllSum = nums[0];
        // int start = 0;
        // int end = 0;
        // int tempStart = 0;
        for(int i=1;i<n;i++){
            if(currSum >= 0){
                currSum += nums[i];
            }else{
                currSum = nums[i];
                //tempStart = i;
            }

            if(currSum > overAllSum){
                overAllSum = currSum;
                //start = tempStart;
                //end = i;
            }
        }

        // Printing result Subarray
        // int res[] = new int[end - start + 1];
        // for(int i=start;i<=end;i++){
        //     res[i-start] = nums[i];
        // }
        // for(int val : res){
        //     System.out.println(val + " ");
        // }
        return overAllSum;
    }
}
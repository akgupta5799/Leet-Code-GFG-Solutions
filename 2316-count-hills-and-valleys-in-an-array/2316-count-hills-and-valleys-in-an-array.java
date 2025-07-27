class Solution {
    public int countHillValley(int[] nums) {
        // First Approach
        // int count = 0;
        // for(int i=1;i<nums.length-1;i++){
        //     if(nums[i] > nums[i+1] && nums[i] > nums[i-1]){
        //         count++;
        //     }
        //     if(nums[i] < nums[i+1] && nums[i] < nums[i-1]){
        //         count++;
        //     }
        //     if(nums[i] == nums[i+1]){
        //         nums[i] = nums[i-1];
        //     }
        // }
        // return count;

        // Another Approach
        int count = 0;
        int left = nums[0];
        for(int i=1;i<nums.length-1;i++){
            if((left < nums[i] && nums[i] > nums[i+1]) || (left > nums[i] && nums[i] < nums[i+1])){
                count++;
                left = nums[i];
            }
        }
        return count;
    }
}
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;
        for(int i=0;i<=n-3;i++){
             // if nums[i] = 0, then flip current and next two numbers
             if(nums[i] == 0){
                nums[i] = 1 - nums[i];
                nums[i+1] = 1 - nums[i+1];
                nums[i+2] = 1 - nums[i+2];
                operations++;
             }
        }
        // Check if all the elements are 1 after performing the operations
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                return -1;
            }
        }

        return operations;

    }
}
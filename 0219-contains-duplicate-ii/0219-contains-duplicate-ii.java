class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j] && i != j && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
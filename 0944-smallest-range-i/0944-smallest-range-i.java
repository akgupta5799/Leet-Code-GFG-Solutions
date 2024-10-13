class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

         // difference will be minimum if (max-k) - (min+k)

            int diff = (max - k) - (min + k);
            return (diff > 0) ? diff : 0;
    }
}
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int k = (int)Arrays.stream(nums).distinct().count();
        int count = 0;
        for(int i=0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(nums[j]);
                if(set.size() == k){
                    count++;
                }
            }
        }
        return count;
    }
}
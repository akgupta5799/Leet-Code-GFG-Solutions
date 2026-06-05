class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i] == nums[j] && i != j && Math.abs(i-j) <= k){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int n = nums.length;
        
        HashSet<Integer> st = new HashSet<>();
        
        int i = 0, j = 0;
        
        while(j < n) {
            
            //step-1
            if(Math.abs(i - j) > k) { //abs(i-j) <= k
                st.remove(nums[i]);
                i++; //shrink
            }
            
            //past me dekha hai nums[j] ?
            if(st.contains(nums[j])) {
                return true;
            }
            
            st.add(nums[j]);
            j++;
            
        }
        
        return false;
    }
}
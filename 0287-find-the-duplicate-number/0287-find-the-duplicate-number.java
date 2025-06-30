class Solution {
    public int findDuplicate(int[] nums) {
        // Using sorting T.C. O(n*logn)
        /*int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;*/

        //Using Set T.C. O(n), S.C. O(n)
        /*int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return -1;*/

        // Using Boolean Array T.C. O(n), S.C.O(n)
        /*int n = nums.length;
        boolean[] set = new boolean[n+1];
        for(int i=0;i<n;i++){
            if(set[nums[i]]) return nums[i];
            set[nums[i]] = true;
        }
        return -1;*/

        // Optimal Solution [Floyd's Tortoise & Hare Algorithm] T.C. O(n)
        int slow = nums[0];
        int fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break; // Cycle detected
            }
        }
        // Detect the entry point of the cycle (duplicate)
        // set slow to nums[0] and fast will be at the same position
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow; // or return fast
    }    
}
class Solution { 
    public int majorityElement(int[] nums) {

        // Low beats 38%

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for (int x : map.keySet()) {
        //     if (map.get(x) > nums.length / 2) {
        //         return x;
        //     }
        // }
        // return -1;

        // 66%
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        /*Boyer-Moore Voting Algorithm */
        int n = nums.length;
        Integer maj = null;
        int count = 0;
        for(int i=0;i<n;i++){
            if(count == 0){
                maj = nums[i];
                count = 1;
            }else if(nums[i] == maj){
                count++;
            }else{
                count--;
            }
        }
        // Here we are not doing verfiation part because majority element always exists in the array.
        return maj;
    }
}
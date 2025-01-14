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
        int maj = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                maj = num;
                count = 1;
            } else if (maj == num) {
                count++;
            } else {
                count--;
            }
        }
        // Here we are not doing verfiation part because majority element always exists in the array.
        return maj;
    }
}
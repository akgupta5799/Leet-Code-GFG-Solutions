class Solution {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp);
        return new ArrayList<>(set);
    }

    public void solve(int[] nums, int i, List<Integer>  temp){
        if(i >= nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        solve(nums, i+1, temp);

        temp.remove(temp.size() - 1);

        solve(nums, i+1, temp);

    }
}
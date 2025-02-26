class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp);
        return res;
    }

    public void solve(int[] nums, int i, List<Integer> temp){
        if(i >= nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]); // take
        solve(nums, i+1, temp); // explore
        temp.remove(temp.size()-1); // non - take
        solve(nums, i+1, temp); // explore
    }
}
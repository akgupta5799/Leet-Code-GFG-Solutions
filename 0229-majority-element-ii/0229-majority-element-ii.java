class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x) > n/3){
                res.add(x);
            }
        }
        return res;
    }
}
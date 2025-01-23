class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        // Convert map.entrySet() to a list
        // map.entrySet() = [1=3, 2=3, 3=1]
        List<Map.Entry<Integer, Integer>> entrySet = new ArrayList<>(map.entrySet());
        
        // Sort the List by Values in Descending Order
        entrySet.sort((a,b) -> b.getValue() - a.getValue());// [1=3, 2=3, 3=1]

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(entrySet.get(i).getKey());
        }

        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;

    }
}
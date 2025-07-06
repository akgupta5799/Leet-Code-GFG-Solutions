class FindSumPairs {

    int [] arr1;
    int [] arr2;
    int len1 = 0;
    int len2 = 0;
    HashMap<Integer, Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        len1 = nums1.length;
        len2 = nums2.length;
        arr1 = nums1;
        arr2 = nums2;
        map = new HashMap<>();
        for(int i = 0; i < len2; i++){
            map.put(nums2[i], map.getOrDefault(nums2[i],0)+1);
        }
    }


    
    public void add(int index, int val) {
        //int v = map.get(arr2[index]);
        map.put(arr2[index],map.getOrDefault(arr2[index],0)-1);
        arr2[index] += val;
        map.put(arr2[index],map.getOrDefault(arr2[index],0)+1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int i = 0; i < len1; i++){
            int v = arr1[i];
            int rem = tot-v;
            count += map.getOrDefault(rem,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
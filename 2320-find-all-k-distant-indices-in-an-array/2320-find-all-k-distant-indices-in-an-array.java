class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        // HashSet<Integer> set = new HashSet<>();
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(Math.abs(i-j) <= k && nums[j] == key){
        //             set.add(i);
        //         }
        //     }
        // }
        // List<Integer> list = new ArrayList<>(set);
        // Collections.sort(list);
        // return list;

        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(i-j) <= k && nums[j] == key){
                    list.add(i);
                    break;
                }
            }
        }
        return list;

    }
}
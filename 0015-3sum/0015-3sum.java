class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Brute Force Using three loops 
        // T.C. O(n^3) S.C. O(m) , m = no. of triplets
        // Set<List<Integer>> set = new HashSet<>();
        // int n = nums.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(triplet);
        //                 set.add(triplet);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> res = new ArrayList<>();
        // res.addAll(set);
        // return res;

        //Optmal T.C. O(nlogn) + O(n2) ~ O(n2)
        // Because O(n2) is dominanting term
        // S.C. O(m), where m is no. of triplets
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        list.addAll(set);
        return list;
    }
}
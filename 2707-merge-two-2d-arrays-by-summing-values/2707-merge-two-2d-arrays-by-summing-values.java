class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int[] nums : nums1){
        //     map.put(nums[0], nums[1]);
        // }

        // for (int[] nums : nums2) {
        //     map.put(nums[0], map.getOrDefault(nums[0], 0) + nums[1]);
        // }

        // List<int[]> list = new ArrayList<>();

        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     list.add(new int[]{entry.getKey(), entry.getValue()});
        // }

        // int[][] res = new int[list.size()][2];
        // for(int i=0;i<list.size();i++){
        //     res[i] = list.get(i);
        // }
        // return res;

        int i = 0;
        int j = 0;
        List<int[]> res = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                res.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                res.add(nums1[i]);
                i++;
            }else{
                res.add(nums2[j]);
                j++;
            }
        }

        while(i < nums1.length){
            res.add(nums1[i]);
            i++;
        }

        while(j < nums2.length){
            res.add(nums2[j]);
            j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
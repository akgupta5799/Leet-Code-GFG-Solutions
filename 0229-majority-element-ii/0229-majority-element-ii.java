class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Using HashMap
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
        /* Boyer-Moore Voting Algorithm */
        // Assumption Part
        // int n = nums.length;
        // int majority1 = 0;
        // int majority2 = 0;
        // int count1 = 0;
        // int count2 = 0;
        // for(int i=0;i<n;i++){
        //     if(majority1 == nums[i]){
        //         count1++;
        //     }else if(majority2 == nums[i]){
        //         count2++;
        //     }else if(count1 == 0){
        //         majority1 = nums[i];
        //         count1 = 1;
        //     }else if(count2 == 0){
        //         majority2 = nums[i];
        //         count2 = 1;
        //     }else{
        //         count1--;
        //         count2--;
        //     }
        // }

        // // Verification Part
        // List<Integer> res = new ArrayList<>();
        // int freq1 = 0;
        // int freq2 = 0;
        // for(int i=0;i<n;i++){
        //     if(nums[i] == majority1){
        //         freq1++;
        //     }else if(nums[i] == majority2){
        //         freq2++;
        //     }
        // }

        // if(freq1 > n/3){
        //     res.add(majority1);
        // }
        // if(freq2 > n/3){
        //     res.add(majority2);
        // }
        // return res;
        
    }
}
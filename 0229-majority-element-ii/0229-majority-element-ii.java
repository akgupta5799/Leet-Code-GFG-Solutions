class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /* Boyer-Moore Voting Algorithm */
        // Assumption Part
        int n = nums.length;
        Integer maj1 = null;
        Integer maj2 = null;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            if(maj1 != null && nums[i] == maj1){
                count1++;
            }else if(maj2 != null && nums[i] == maj2){
                count2++;
            }else if(count1 == 0){
                maj1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                maj2 = nums[i];
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        // Verification Part
        List<Integer> res = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;
        for(int i=0;i<n;i++){
            if(maj1 != null && nums[i] == maj1){
                freq1++;
            }else if(maj2 != null && nums[i] == maj2){
                freq2++;
            }
        }

        if(freq1 > Math.floor(n/3)){
            res.add(maj1);
        }
        if(freq2 > Math.floor(n/3)){
            res.add(maj2);
        }

        return res;
    }
}
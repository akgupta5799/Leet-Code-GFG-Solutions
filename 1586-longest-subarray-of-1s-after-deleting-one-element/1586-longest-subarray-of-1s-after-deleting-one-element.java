
class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                list.add(count);
                count=0;
            }
            else{
                count++;
            }
        }
        list.add(count);  
        if(count==nums.length){
            return count-1;
        }
        int max=0;
        for(int i=1;i<list.size();i++){
            max=Math.max(max,list.get(i)+list.get(i-1));
        }
        return max;
    }
}
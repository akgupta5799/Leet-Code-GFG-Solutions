class Solution {
    public int singleNumber(int[] nums) {
        int Xor = 0;
        for(int num : nums){
            Xor = Xor ^ num;
        }
        return Xor;
    }
}
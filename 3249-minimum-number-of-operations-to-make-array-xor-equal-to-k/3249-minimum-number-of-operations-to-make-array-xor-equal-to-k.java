class Solution {
    public int minOperations(int[] nums, int k) {
        int totalXor = 0;
        for(int num : nums){
            totalXor  = totalXor ^ num;
        }
        int n = totalXor ^ k;
        return Integer.bitCount(n);
    }
}
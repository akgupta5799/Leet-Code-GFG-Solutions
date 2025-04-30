class Solution {
    public int findNumbers(int[] nums) {
        int countEven = 0;
        for(int i=0;i<nums.length;i++){
            if(isEven(nums[i])){
                countEven++;
            }
        }
        return countEven;
    }
    public boolean isEven(int n){
        int countDigit = 0;
        while(n>0){
            n = n/10;
            countDigit++;
        }
        if(countDigit%2==0){
            return true;
        }
        return false;

    }    
}
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] temp = new int[2*n];
        for(int i=0;i<2*n;i++){
            temp[i] = nums[i%n];
        }

        int totalOne = Arrays.stream(nums).sum();

        int currOne = 0;
        int maxOne = 0;
        int i = 0;
        int j = 0;
        while(j < 2*n){
            if(temp[j] == 1){
                currOne++;
            }
            if(j-i+1 > totalOne){
                currOne -= temp[i];
                i++;
            }
            maxOne = Math.max(maxOne, currOne);
            j++;
        }
        return totalOne - maxOne;
    }
}
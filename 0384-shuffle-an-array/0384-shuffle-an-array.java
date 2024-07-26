class Solution {
    int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] shuf = nums.clone();
        Random rand = new Random();
        for(int i=0;i<shuf.length;i++)
        {
            int random = rand.nextInt(shuf.length);
            int temp = shuf[random];
            shuf[random] = shuf[i];
            shuf[i]=temp;
        }
        return shuf;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
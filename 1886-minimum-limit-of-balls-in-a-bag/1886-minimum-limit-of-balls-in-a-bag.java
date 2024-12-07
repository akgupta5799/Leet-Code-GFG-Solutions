class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();
        int res = r; // We have to minimize the answer
        while(l <= r){
            int mid = l + (r - l)/2;
            if(isPossible(nums, maxOperations, mid)){
                res = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return res;
    }

    public static boolean isPossible(int[] nums, int maxOperations, int mid){
        int totalOps = 0;
        for(int num : nums){
            int ops = num / mid;

            if(num % mid == 0){
                ops -= 1;
            }

            totalOps += ops;
        }
        return totalOps <= maxOperations;
    }

}
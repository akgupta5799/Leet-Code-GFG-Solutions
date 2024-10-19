class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];
        res[0] = findLeftMost(nums, target, n);
        res[1] = findRightMost(nums, target, n);
        return res;
    }
    public static int findLeftMost(int[] nums, int target, int n){
        int leftMost = -1;
        int l = 0;
        int r = n - 1;

        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                leftMost = mid;
                r = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return leftMost;
    }
    public static int findRightMost(int[] nums, int target, int n){
        int rightMost = -1;
        int l = 0;
        int r = n - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                rightMost = mid;
                l = mid + 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return rightMost;
    }
}
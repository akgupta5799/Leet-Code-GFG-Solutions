class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int pivot_index = findPivot(nums, n);
        if(binarySearch(nums, target, 0, pivot_index-1)){
            return true;
        }
        return binarySearch(nums, target, pivot_index, n-1);
    }
    public static int findPivot(int[] nums, int n){
        int l = 0;
        int r = n-1;
        while(l < r){
            while(l < r && nums[l] == nums[l+1]){
                l++;
            } 
            while(r < l && nums[r] == nums[r-1]){
                r--;
            } 
            int mid = l + (r - l)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return r;
    }

    public static boolean binarySearch(int[] nums,  int target, int l, int r){
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
}
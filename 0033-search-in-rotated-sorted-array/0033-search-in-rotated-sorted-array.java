class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot_index = findPivot(nums, n);// min value index
        int idx = binarySearch(nums, target, 0, pivot_index -1);//left side
        if(idx != -1){
            return idx;
        }
        idx = binarySearch(nums, target, pivot_index, n-1);// right side
        return idx;
    }
    public static int findPivot(int[] nums, int n){
        int l = 0;
        int r = n-1;
        while(l <r ){
            int mid = l+(r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return r;
    }

    public static int binarySearch(int[] nums, int target, int l, int r){
        int idx = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                idx = mid;
                break;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return idx;
    }
}
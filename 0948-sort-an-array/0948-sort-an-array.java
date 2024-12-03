class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        return mergeSort(nums, l, r);
    }

    public static int[] mergeSort(int[] nums, int l, int r){
        if(l < r){
            int mid = l+(r-l)/2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid+1, r);
            merge(nums, l, mid, r);
        }
        return nums;
    }

    public static void merge(int[] nums, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i] = nums[l+i];
        }

        for(int i=0;i<n2;i++){
            rightArray[i] = nums[mid+1+i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                nums[k] = leftArray[i];
                k++;
                i++;
            }else{
                nums[k] = rightArray[j];
                k++;
                j++;
            }
        }

        while(i < n1){
            nums[k] = leftArray[i];
            k++;
            i++;
        }

        while(j < n2){
            nums[k] = rightArray[j];
            k++;
            j++;
        }
    }
}
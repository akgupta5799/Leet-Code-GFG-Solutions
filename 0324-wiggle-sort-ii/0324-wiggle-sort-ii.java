class Solution {
    public void wiggleSort(int[] nums) {
        int sortedArray[] = nums.clone();
        Arrays.sort(sortedArray);
        int mid = (nums.length + 1)/2;
        int i = mid - 1;
        int j = nums.length - 1;
        for(int idx=0;idx<nums.length;idx++){
            if(idx % 2 == 0){
                nums[idx] = sortedArray[i];
                i--;
            }else{
                nums[idx] = sortedArray[j];
                j--;
            }
        }
        
    }
}
class Solution {
    public void sortColors(int[] nums) {
        // Using Library function
       // Arrays.sort(nums); // T.C. O(nlogn) <-- Quick Sort

        // Using Counting Sort T.C. O(n) but 2 pass solution
        /*int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count0++;
            }else if(nums[i] == 1){
                count1++;
            }else{
                count2++;
            }
        }
        
        int i = 0;
        while(count0 > 0){
            nums[i] = 0;
            count0--;
            i++;
        }
        while(count1 > 0){
            nums[i] = 1;
            count1--;
            i++;
        }
        while(count2 > 0){
            count2--;
            nums[i] = 2;
            i++;
        } */

        // Dutch National Flag Algorithm (DNF) { One Pass Solution }
        // T.C. O(n) & S.C. O(1)
        int n = nums.length;
        int low = 0; //trcking 0's value
        int mid = 0; //trcking 1's value
        int high = n-1; //trcking 2's value

        // Focus on mid values only
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{ // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // Finding the gola_index
        int gola_index = -1;
        for(int i=n-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                gola_index = i-1;
                break;
            }
        }

        if(gola_index != -1){
            int swap_index = gola_index;
            for(int j=n-1;j>=gola_index+1;j--){
                if(nums[j] > nums[gola_index]){
                    swap_index = j;
                    break;
                }
            }

            // swap these two values present at gola_index and swap_index
            swap(nums, gola_index, swap_index);
        }

        // reverse from gola_index+1 to n-1
        reverse(nums, gola_index+1, n-1);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
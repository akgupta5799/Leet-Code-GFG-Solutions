class Solution {
    public void sortColors(int[] nums) {
        // T.C O(nlogn) By sorting
        //Arrays.sort(nums);

        // T.C. O(n)
        // int n = nums.length;
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;
        // for(int i=0;i<n;i++){
        //     if(nums[i] == 0){
        //         count0++;
        //     }else if(nums[i] == 1){
        //         count1++;
        //     }else{
        //         count2++;
        //     }
        // }

        // int idx = 0;
        // while(count0 > 0){
        //     nums[idx] = 0;
        //     idx++;
        //     count0--;
        // }

        // while(count1 > 0){
        //     nums[idx] = 1;
        //     idx++;
        //     count1--;
        // }

        // while(count2 > 0){
        //     nums[idx] = 2;
        //     idx++;
        //     count2--;
        // }

        // T.C. O(n)  Optimal Solution (One-pass Solution)

        int n = nums.length;
        int i = 0;      // denote for 0
        int j = 0;      // denote for 1
        int k = n-1;    // denote for 2

        while(j <= k){
            if(nums[j] == 1){
                j++;
            }else if(nums[j] == 2){
                swap(nums,j,k);
                k--;
            }else{ // nums[j] == 0
                swap(nums,j,i);
                i++;
                j++; // because i and j started from the same place
            }
        }
    }
    public void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
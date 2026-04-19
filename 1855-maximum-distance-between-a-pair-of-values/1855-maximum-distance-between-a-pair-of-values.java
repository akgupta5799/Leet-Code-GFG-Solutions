class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {

        //Time Limit Exceeded
        // int dist = 0;
        // int max = 0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(i<=j && nums1[i]<=nums2[j]){
        //             dist = j - i;
        //         }
        //         if(dist > max){
        //             max = dist;
        //         }
        //     }
        // }
        // return max;

        int i = 0;
        int j = 0;
        int ans = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                i++;
            }else{
                ans = Math.max(j-i,ans);
                j++;
            }
        }
        return ans;  
    }  
}
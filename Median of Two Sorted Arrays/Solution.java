class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        double res[] = new double[n1+n2];
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                res[i+j] = nums1[i];
                i++;
            }
            else{
                res[i+j] = nums2[j];
                j++;
            }
        }
        while(i<n1){
            res[i+j] = nums1[i];
            i++;
        }
        while(j<n2){
            res[i+j] = nums2[j];
            j++;
        }
        int n = n1+n2;
        if(n%2!=0){
            return (res[(n+1)/2-1]);
        }
        else{
            return (res[n/2 -1]+res[n/2 ])/2;
        }
    }
}
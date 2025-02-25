class Solution {
    public int numOfSubarrays(int[] arr) {
        // Brute Force Approach TLE
        // int n = arr.length;
        // int count = 0;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         if(sum % 2 != 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int n = arr.length;
        int count = 0;
        int odd = 0;
        int even = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum % 2 == 0){
                count = (count + odd) % 1000000007;
                even++;
            }else{
                count = (count + even)%1000000007;
                odd++;
            }
        }
        return count;
    }
}
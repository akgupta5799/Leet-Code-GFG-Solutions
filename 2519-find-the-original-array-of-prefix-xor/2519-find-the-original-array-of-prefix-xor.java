class Solution {
    public int[] findArray(int[] pref) {
        // int n = pref.length;
        // int ans[] = new int[n];
        // ans[0] = pref[0];
        // for(int i=1;i<n;i++){
        //     ans[i] = pref[i] ^ pref[i-1];
        // }
        // return ans;

        // Without create an ans array
        int n = pref.length;
        for(int i=n-1;i>0;i--){
            pref[i] = pref[i] ^ pref[i-1];
        }
        return pref;
    }
}
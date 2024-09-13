class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int preXor[] = new int[n];
        preXor[0] = arr[0];
        for(int i=1;i<n;i++){
            preXor[i] = preXor[i-1] ^ arr[i];
        }
        int res[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left != 0){
                res[i] = preXor[left-1] ^ preXor[right];
            }else{
                res[i] = 0 ^ preXor[right];
            }
        }
        return res;
    }
}
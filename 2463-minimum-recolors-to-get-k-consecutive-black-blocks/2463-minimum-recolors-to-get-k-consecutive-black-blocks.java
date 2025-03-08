class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i = 0;
        int j = 0;
        int res = k;
        int W = 0;
        while(j < blocks.length()){
            if(blocks.charAt(j) == 'W'){
                W++;
            }
            if((j-i+1) == k){
                res = Math.min(res, W);

                // shift the window
                if(blocks.charAt(i) == 'W'){
                    W--;
                }
                i++;
            }
            j++;
        }
        return res;
    }
}
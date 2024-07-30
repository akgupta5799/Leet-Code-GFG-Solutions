class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int countB = 0;
        int remove = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'a'){
                if(countB > 0){
                    countB--;
                    remove++;
                }
            }else{
                countB++;
            }
        }
        return remove;
    }
}
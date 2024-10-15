class Solution {
    public long minimumSteps(String s) {
        int countZero = 0;
        long res = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '0'){
                countZero++;
            }else{
                res += countZero;
                //countZero = 0;
            }
        }
        return res;
    }
}
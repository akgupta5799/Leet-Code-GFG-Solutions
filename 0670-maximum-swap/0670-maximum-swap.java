class Solution {
    public int maximumSwap(int num) {
        String strNum = Integer.toString(num);
        int n = strNum.length();
        int max = num;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                char[] tempChar = strNum.toCharArray();
                char temp = tempChar[i];
                tempChar[i] = tempChar[j];
                tempChar[j] = temp;

                int tempNum = Integer.parseInt(new String(tempChar));

                max = Math.max(tempNum, max);    
            }
        }
        return max;
    }
}
class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder sb = new StringBuilder();
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        }
        int i = 25; // Start traversing from the last index 
        while( i >= 0){
            if(count[i] == 0){
                i--;
                continue;
            }
            char ch = (char)('a' + i); //getting current character
            int freq = Math.min(count[i], repeatLimit);
            for(int k=0;k<freq;k++){
                sb.append(ch);
            }
            count[i] -= freq;
            if(count[i] > 0){
                int j = i-1;
                while(j >= 0 && count[j] == 0){
                    j--;
                }
                if(j < 0){
                    break;
                }
                sb.append((char)('a' + j));
                count[j]--;
            }
        }
        return sb.toString();
    }
}
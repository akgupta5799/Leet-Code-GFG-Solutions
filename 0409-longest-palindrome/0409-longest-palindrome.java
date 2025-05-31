class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        if(s == null || s.length()==0){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int len = 0;
        boolean hasOdd = false;
        for(int count : map.values()){
            len += (count/2)*2;
            if(count % 2 != 0){
                hasOdd = true;
            }
        }
        if(hasOdd){
            len++;
        }
        return len;
    }
}
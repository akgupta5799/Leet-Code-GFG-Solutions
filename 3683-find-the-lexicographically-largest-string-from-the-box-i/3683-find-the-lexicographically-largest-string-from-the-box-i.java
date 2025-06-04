class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1) return word;
        String result = "";
        int n = word.length();
        int longestPossible = n - (numFriends - 1);
        for(int i=0;i<n;i++){
            int canTake = Math.min(longestPossible, n-i);
            String sub = word.substring(i, i + canTake);
            if (sub.compareTo(result) > 0) {
                result = sub;
            }
        }
        return result;
    }
}
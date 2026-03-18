class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCapitals(word) || allSmalls(word) || allSmalls(word.substring(1))){
            return true;
        }
        return false;
    }
    public boolean allCapitals(String word){
        for(char ch : word.toCharArray()){
            if(ch < 'A'  || ch >'Z'){
                return false;
            }
        }
        return true;
    }
     public boolean allSmalls(String word){
        for(char ch : word.toCharArray()){
            if(ch < 'a'  || ch >'z'){
                return false;
            }
        }
        return true;
    }
}
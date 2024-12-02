class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String words[] = sentence.split(" ");
        int len = searchWord.length();
        for(int i=0;i<words.length;i++){
            if(words[i].length() >= len){
                String s1 = words[i].substring(0,len);
                if(s1.equals(searchWord)){
                    return (i+1);
                }
            }
            
        }
        return -1;
    }
}
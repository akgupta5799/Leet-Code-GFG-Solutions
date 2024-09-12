class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for(String word : words){
            boolean allCharAllowed = true;
            for(char ch : word.toCharArray()){
                if(!set.contains(ch)){
                    allCharAllowed = false;
                    break;
                }
            }
            if(allCharAllowed){
                count++;
            }
        }
        return count;

    }
}
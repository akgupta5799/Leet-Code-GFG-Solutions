class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words1){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for(String word : words2){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        String str[] = new String[list.size()];
        for(int i=0;i<list.size();i++){
            str[i] = list.get(i);
        }

        return str;

    }
}
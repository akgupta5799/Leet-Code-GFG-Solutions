class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] scharArray = s.toCharArray();
        // char[] tcharArray = t.toCharArray();

        // Arrays.sort(scharArray);
        // Arrays.sort(tcharArray);

        // return Arrays.equals(scharArray, tcharArray);
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }else{
                return false;
            }
            if(map.get(t.charAt(i)) == 0){
                map.remove(t.charAt(i));
            }
        }
        if(map.size() == 0){
            return true;
        }
        return false;
    }
}
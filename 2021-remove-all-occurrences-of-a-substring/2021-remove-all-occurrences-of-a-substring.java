class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int startIndex = s.indexOf(part);
            s = s.substring(0, startIndex) + s.substring(startIndex + part.length());
        }
        return s;
    }
}
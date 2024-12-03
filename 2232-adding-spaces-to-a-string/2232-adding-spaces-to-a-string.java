class Solution {
    public String addSpaces(String s, int[] spaces) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<spaces.length;i++){
            set.add(spaces[i]);
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n){
            if(!set.contains(i)){
                sb.append(s.charAt(i));
            }else{
                sb.append(" ");
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
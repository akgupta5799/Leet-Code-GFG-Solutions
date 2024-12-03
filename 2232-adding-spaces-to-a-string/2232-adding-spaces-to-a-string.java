class Solution {
    public String addSpaces(String s, int[] spaces) {
        // What I though (Bekar)
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<spaces.length;i++){
        //     set.add(spaces[i]);
        // }

        // StringBuilder sb = new StringBuilder();
        // int n = s.length();
        // int i = 0;
        // while(i < n){
        //     if(!set.contains(i)){
        //         sb.append(s.charAt(i));
        //     }else{
        //         sb.append(" ");
        //         sb.append(s.charAt(i));
        //     }
        //     i++;
        // }
        // return sb.toString();

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int spaceIndex = 0;
        for(int i=0;i<n;i++){
            if(spaceIndex < spaces.length && i == spaces[spaceIndex]){
                sb.append(" ");
                spaceIndex++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
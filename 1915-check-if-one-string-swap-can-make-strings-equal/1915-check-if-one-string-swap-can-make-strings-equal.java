class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                list.add(i);
            }
        }
        if(list.size()==2){
            int x = list.get(0);
            int y = list.get(1);
            if(s1.charAt(x)==s2.charAt(y) && s1.charAt(y)==s2.charAt(x)){
                return true;
            }
            else return false;
        }
        return false;
    }
}
class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '['){
                st.push('[');
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        return (st.size()+1)/2;
    }
}
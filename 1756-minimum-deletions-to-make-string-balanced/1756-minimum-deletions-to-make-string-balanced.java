class Solution {
    public int minimumDeletions(String s) {
        // Approach 1
        // int n = s.length();
        // int countB = 0;
        // int remove = 0;
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i) == 'a'){
        //         if(countB > 0){
        //             countB--;
        //             remove++;
        //         }
        //     }else{
        //         countB++;
        //     }
        // }
        // return remove;

        //Approach 2: Using Stack
        Stack<Character> st = new Stack<>();
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek() == 'b' && s.charAt(i) == 'a'){
                st.pop();
                res++;
            }else{
                st.add(s.charAt(i));
            }
        }
        return res;
    }
}
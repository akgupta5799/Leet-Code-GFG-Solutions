class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int freq[] = new int[26];
        boolean exist[] = new boolean[26];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']--;
            if(exist[ch-'a']) continue;

            while(st.size()>0 && st.peek()>ch && freq[st.peek()-'a']>0){
                char remove = st.pop();
                exist[remove-'a'] = false;
            }
            st.push(ch);
            exist[ch-'a'] = true;
        }

        char res[] = new char[st.size()];
        int i = res.length - 1;
        while(i>=0){
            res[i] = st.pop();
            i--;
        }
        return new String(res);
    }
}
class Solution {
    public boolean canBeValid(String s, String locked) {
        int open_count = 0;
        int close_count = 0;
        int unlock_count = 0;
        if(s.length() % 2 != 0){
            return false;
        }
        for(int i = 0; i  < s.length(); i++){
            if(locked.charAt(i) == '0'){
                unlock_count++;
            }else if(s.charAt(i) == '('){
                open_count++;
            }else if(s.charAt(i) == ')'){
                close_count++;
            }

            if(unlock_count + open_count < close_count){
                return false;
            }
        }

        open_count = 0;
        close_count = 0;
        unlock_count = 0;

        
        for(int i = s.length()-1; i  >= 0; i--){
            if(locked.charAt(i) == '0'){
                unlock_count++;
            }else if(s.charAt(i) == '('){
                open_count++;
            }else if(s.charAt(i) == ')'){
                close_count++;
            }

            if(unlock_count + close_count < open_count){
                return false;
            }
        }
        return true;
    }
}
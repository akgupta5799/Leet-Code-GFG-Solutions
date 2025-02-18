class Solution {
    public String smallestNumber(String pattern) {
        int size = pattern.length();
        char[] res = new char[size+1];
        for(int i=0;i<size+1;i++){
            res[i] = (char)((i+1)+'0');
        }
        
        for(int i=0;i<size;i++){
            int t=i;
            while(t<size && pattern.charAt(t)=='D'){
                t++;
            }
            
            int left=i,right=t;
            while(left<right){
                char temp = res[left];
                res[left]=res[right];
                res[right]=temp;
                left++;
                right--;
            }
            
            if(t!=i) i = t-1;
            
        }
        
        return new String(res);
    }
}
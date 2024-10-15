class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            ArrayList<Integer> temp = new ArrayList<>();
            while(num > 0){
                int rem = num % 10;
                temp.add(rem);
                num /= 10;
            }
            for(int j=temp.size()-1;j>=0;j--){
                list.add(temp.get(j));
            }

        }
        int res[] = new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
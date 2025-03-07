class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] < pivot){
                list1.add(nums[i]);
            }else if(nums[i] == pivot){
                list2.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] > pivot){
                list2.add(nums[i]);
            }
        }
        int size = list1.size() + list2.size();
        int res[] = new int[size];
        int k = 0;
        for(int i=0;i<list1.size();i++){
            res[k] = list1.get(i);
            k++;
        }
        for(int i=0;i<list2.size();i++){
            res[k] = list2.get(i);
            k++;
        }

        return res;
    }
}
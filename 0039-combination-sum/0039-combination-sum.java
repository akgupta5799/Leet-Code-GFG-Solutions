class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<Integer>(), candidates, target, 0);
        return resultList;
    }
    public void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] candidates, int remain, int start){
        if(remain < 0) return;
        else if(remain==0) resultList.add(new ArrayList<>(tempList));
        else{
            for(int i=start;i<candidates.length;i++){
                // case of including the number
                tempList.add(candidates[i]);

                // Backtracking for new List
                backtrack(resultList, tempList, candidates, remain-candidates[i],i); // not i+1 because we can take the same element again

                // case of non-inclusion of the number
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
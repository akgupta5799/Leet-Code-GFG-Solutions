class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<Integer>(), candidates, target, 0);
        return resultList;
    }
    public void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] candidates, int target, int start){
        if(target==0){
            resultList.add(new ArrayList<>(tempList));
            return ;
        } 
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1])continue;     
            if(candidates[i] > target) break;
            // Inclusion of this current number
            tempList.add(candidates[i]);
            backtrack(resultList, tempList, candidates, target-candidates[i], i+1);
            // Non Inclusion of this current number
            tempList.remove(tempList.size()-1);
        }
    }
}
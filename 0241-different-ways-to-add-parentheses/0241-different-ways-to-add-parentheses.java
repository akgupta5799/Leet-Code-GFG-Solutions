public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == '-' ||
                input.charAt(i) == '*' ||
                input.charAt(i) == '+' ) {
                String part1 = input.substring(0, i);
                String part2 = input.substring(i+1);
                List<Integer> part1Ret = diffWaysToCompute(part1);
                List<Integer> part2Ret = diffWaysToCompute(part2);
                for (int j=0;j<part1Ret.size();j++) {
                    for (int k=0;k<part2Ret.size();k++) {
                        int c = 0;
                        switch (input.charAt(i)) {
                            case '+': c = part1Ret.get(j)+part2Ret.get(k);
                                break;
                            case '-': c = part1Ret.get(j)-part2Ret.get(k);
                                break;
                            case '*': c = part1Ret.get(j)*part2Ret.get(k);
                                break;
                        }
                        list.add(c);
                    }
                }
            }
        }
        if (list.size() == 0) {
            list.add(Integer.valueOf(input));
        }
        return list;
    }
}
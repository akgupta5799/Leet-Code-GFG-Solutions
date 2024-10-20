class Solution {
    public boolean parseBoolExpr(String expression) {
        int n = expression.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(expression.charAt(i) == ','){
                continue;
            }
            if(expression.charAt(i) == ')'){
                ArrayList<Character> list = new ArrayList<>();
                while(st.peek()!= '('){
                    list.add(st.pop());
                }
                st.pop();
                char operator = st.peek();// !, &, |
                st.pop();
                st.push(solveOperator(list, operator));
            }else{
                st.push(expression.charAt(i));
            }
        }
        return st.peek() == 't' ? true : false;
    }
    public static char solveOperator(ArrayList<Character> list , char operator){
        //Handle NOT operator
        if(operator == '!'){
            return list.get(0) == 't' ? 'f' : 't';
        }

        //Handle AND operator
        if(operator == '&'){
            for(int i=0;i<list.size();i++){
                if(list.get(i) == 'f'){
                    return 'f';
                }
            }
            return 't';
        }

        //Handle OR operator
        if(operator == '|'){
            for(int i=0;i<list.size();i++){
                if(list.get(i) == 't'){
                    return 't';
                }
            }
            return 'f';
        }

        return 't'; // will never come here so return anything.
    }
}
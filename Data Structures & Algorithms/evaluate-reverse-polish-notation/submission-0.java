class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            }else{
                int b = stack.pop();
                 int a = stack.pop();

                 if(token.equals("+")) stack.push(a+b);
                 else if (token.equals("-")) stack.push(a-b);
                 else if (token.equals("*")) stack.push(a*b);
                 else stack.push(a/b);
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}

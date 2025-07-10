class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> jarStack=new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c== '(' || c== '{' || c== '['){
                jarStack.push(c);
            }
            else{
                if(jarStack.isEmpty()){
                    return false;
                }
                char top=jarStack.pop();
                if(c==')' && top!='(' 
                || c=='}' && top!='{'
                || c==']' && top!='[' ){
                    return false;
                }
            }
        }
        return jarStack.isEmpty();
    }
}
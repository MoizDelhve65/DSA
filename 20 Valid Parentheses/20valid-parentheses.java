class Solution {
    public boolean isValid(String x) {
        //implement stack
        Stack<Character> stk = new Stack<>();
        char s[] = x.toCharArray();
        char a;
        for(int i = 0; i < s.length; i++) {
            if(s[i]=='{' ||s[i]=='(' ||s[i]=='[' )
            {

                stk.push(s[i]);

            }
            if(s[i]=='}' ||s[i]==']' ||s[i]==')') {
                if(stk.isEmpty()) return false;
                a = stk.pop();
                if((s[i]=='}'&&a!='{') || (s[i]==']'&&a!='[') || (s[i]==')'&&a!='(') )
                {
                    
                    return false;
                }
            }
        }
        if(stk.isEmpty()) return true; else return false;
        
    }
}
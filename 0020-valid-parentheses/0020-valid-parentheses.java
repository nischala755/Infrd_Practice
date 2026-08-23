class Solution {
    public boolean isValid(String s) {
        int length=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<length;i++)
        {
            char c=s.charAt(i);//get the current character
            if(c=='('||c=='{'||c=='[')
            {
                stack.push(c);//push it into the stack whenever it is an opening bracket of any type
            }
           
            else
            {
                
                if(stack.isEmpty()) return false;
                 char top=stack.pop();//use the pop op from stack and get the top element of the stack
                
                    if(c==')' && top!='(') return false; // if the current character is a closing brace and the top element of the stack is not corresponding opening brace kindly return false
                    if(c=='}' && top!='{') return false;
                    if(c==']' && top!='[') return false;
                }
            
        }
        return stack.isEmpty(); // if all the char are processed and the stack is empty then it is a valid string -> true 
        
    }
}
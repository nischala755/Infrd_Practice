class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        int n=s.length();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            Character cur=s.charAt(i);
            if(map.containsKey(cur))
            {
                if(stack.isEmpty() || stack.pop()!=map.get(cur))
                {
                    return false;
                }
                
            }
            else
                stack.push(cur);
        }
        return stack.isEmpty();
        
    }
}
class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        Stack<Character> stack=new Stack<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            if(map.containsKey(cur))
            {
                if(stack.isEmpty() || stack.pop() != map.get(cur)) return false;
            }
            else
            stack.push(cur);
        }
        return stack.isEmpty();
        
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++)
        {
            char cur=s.charAt(right);
            if(map.containsKey(cur) && map.get(cur)>=left)
            {
                left=map.get(cur)+1;
            }
            map.put(cur,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
        
    }
}
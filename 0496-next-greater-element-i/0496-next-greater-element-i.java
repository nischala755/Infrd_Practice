class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums2)
        {
            while(!stack.isEmpty() && stack.peek() < num)
            {
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=map.getOrDefault(nums1[i],-1);
        }
        return result;
        
    }
}
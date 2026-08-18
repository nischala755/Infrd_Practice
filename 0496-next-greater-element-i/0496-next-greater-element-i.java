class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int num : nums2)
        {
            while(!stack.isEmpty() && num>stack.peek())
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
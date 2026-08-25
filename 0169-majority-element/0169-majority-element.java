class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int maj_ele=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                maj_ele=nums[i];
                
            }
            if(nums[i]==maj_ele)
            {
                count++;
            }
            else count--;
        }
        return maj_ele;
        
    }
}
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        long total=0;
        int left=0;
        int max_ele=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max_ele=Math.max(max_ele,nums[i]);
        }
        for(int right=0;right<n;right++)
        {
            if(nums[right]==max_ele)
            {
                count++;
            }
            while(count==k)
            {
                total+=(n-right);
                if(nums[left]==max_ele)
                {
                    count--;
                }
                left++;
            }
        }
        return total;
        
    }
}
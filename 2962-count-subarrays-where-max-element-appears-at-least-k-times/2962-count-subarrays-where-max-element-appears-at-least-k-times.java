class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int count=0;
        long total=0;
        int max_ele=Integer.MIN_VALUE;
        for(int num : nums)
        {
            max_ele=Math.max(num,max_ele);
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
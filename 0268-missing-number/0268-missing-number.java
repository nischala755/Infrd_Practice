class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a_sum=n*((n+1))/2;
        int e_sum=0;
        for(int i=0;i<n;i++)
        {
            e_sum+=nums[i];
        }
        int ans=0;
        ans=a_sum-e_sum;
        return ans;
        
    }
}
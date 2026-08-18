class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;//calc the expected sum
        int a_sum=0;//calc the actual sum
        sum=(n*(n+1))/2;
        for(int i=0;i<n;i++)
        {
            a_sum+=nums[i];
        }
        int ans=sum-a_sum;//get the missing number
        return ans;
        
    }
}
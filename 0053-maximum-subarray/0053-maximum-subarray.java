class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int num : nums)
        {
            if(sum<0) 
            {
                sum=0;
            }
            sum+=num;
            max_sum=Math.max(sum,max_sum);

        }
        return max_sum;
        
    }
}
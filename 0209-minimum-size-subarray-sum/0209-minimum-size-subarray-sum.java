class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int cur=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<n;right++)
        {
            cur+=nums[right];
            while(cur>=target)
            {
                min=Math.min(min,right-left+1);
                cur-=nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        else return min;

        
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        res[0]=findFirst(nums,target);
        res[1]=findLast(nums,target);
        return res;
        
    }
    public int findFirst(int[] nums,int target)
    {
        int idx=-1;
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left+((right-left))/2;
            if(nums[mid]==target)
            {
                idx=mid;
                right=mid-1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return idx;
    }
    public int findLast(int[] nums,int target)
    {
        int idx=-1;
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left+((right-left))/2;
            if(nums[mid]==target)
            {
                idx=mid;
                left=mid+1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return idx;
    }
}
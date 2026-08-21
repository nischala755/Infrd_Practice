class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] res=new int[2];
        res[0]=findFirst(nums,target);
        res[1]=findLast(nums,target);
        return res;
        
    }
    public int findFirst(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        int idx=-1;
        while(start<=end)
        {
            int mid=start+((end-start))/2;
            if(nums[mid]==target) 
            {
                idx=mid;
                end=mid-1;

            }
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return idx;
        
    }
    public int findLast(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        int idx=-1;
        while(start<=end)
        {
            int mid=start+((end-start))/2;
            if(nums[mid]==target) 
            {
                idx=mid;
                start=mid+1;

            }
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return idx;
        
    }

}
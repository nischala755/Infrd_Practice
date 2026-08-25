class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majEle=n/2;
        for(int num : nums)
        {
            int count=0;
            for(int num1: nums)
            {
                if(num1==num)
                {
                    count++;
                }
            }
            if(count>majEle) return num;
        }
        return -1;//default case
    }
}
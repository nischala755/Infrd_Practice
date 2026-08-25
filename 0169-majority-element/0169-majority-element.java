class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int majEle=n/2;
        
        for(int num : nums)
        {
            int count=0;
            count=map.getOrDefault(num,0)+1;
            map.put(num,count);
            if(count>majEle) return num;
        }
        return -1;
        
    }
}